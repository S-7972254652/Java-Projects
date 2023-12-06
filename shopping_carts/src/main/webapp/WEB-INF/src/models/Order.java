package models;

import java.sql.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.time.LocalDateTime;
import java.sql.*;
import java.util.*;


public class Order {
	private Integer orderId;
	private Item item;
	private User user;
	private Timestamp orderOn;

	public Order(Item item,Timestamp orderOn){
		this.item = item;
		this.orderOn = orderOn;
	}


    public static void updateOrder(Integer userId,Integer itemId){
        LocalDateTime now = LocalDateTime.now();
		Timestamp sqlNow = Timestamp.valueOf(now);

        String query = "INSERT INTO orders(item_id,user_id,ordered_on)values(?,?,?)";
		Connection  con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);

		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setInt(1,itemId);
		   ps.setInt(2,userId);
		   ps.setTimestamp(3,sqlNow);

		   ps.executeUpdate();
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
    }	

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void createTable(){
		String query = "create table orders(order_id integer not null primary key autoincrement, item_id "+ 
            "integer not null,user_id integer not null,ordered_on timestamp,constraint fk_orders_items foreign "+
            "key(item_id) references items(item_id),constraint fk_orders_users foreign key(user_id) references users(user_id))";
		Connection  con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   Boolean flag = ps.execute();
		   System.out.println("models.Student.createStudentTable()    "+flag);
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}

	public static ArrayList<Order> collectMyItems(Integer userId){
		System.out.println(userId+"************* in method");
		ArrayList<Order> items = new ArrayList<Order>();	
		Integer itemId = 0;
		Connection con=null;
		String query = "SELECT item_id,ordered_on from orders where user_id=?";
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setInt(1,userId);
		   
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()){
			   itemId = rs.getInt(1);

			   Item item = Item.collectSuchItem(itemId);
			   System.out.println(item+" item************** itemid"+itemId);
			   items.add(new Order(item,rs.getTimestamp(2))); 	
		   }
		   System.out.println(items+" items**************");
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}

		return items;
	}

	public static Boolean DeleteOrder(Integer userId,Integer itemId){
		Connection con=null;
		Boolean flag = false;
		String query = "DELETE from orders WHERE user_id=? and item_id=?";		
				
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setInt(1,userId);	   
		   ps.setInt(2,itemId);	   
		   
		   ps.executeUpdate();
		   flag = true;
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}

    public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setOrderOn(Timestamp orderOn){
		this.orderOn = orderOn;
	}
	public Timestamp getOrderOn(){
		return orderOn;
	}
	
}

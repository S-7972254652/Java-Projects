package models;

import java.sql.*;
import java.io.*;
import java.util.*;


public class Cart {
	private Integer cartId;
	private User user;
    private Item product;
    
    public static final class MetaData{
		public static final String TABLE_NAME="carts";
		public static final String COLUMN_1="cart_id";
		public static final String COLUMN_2="user_id";
		public static final String COLUMN_3="item_id";
    }
	
	public Cart(Integer cartId, User userId, Item productId) {	
        this.cartId = cartId;
        this.user = user;
        this.product = product;
	}
	
	public static Boolean addItem(Integer itemId,Integer userId){
		Boolean flag = false;
		Connection con=null;
		String raw = "INSERT INTO %s(%s,%s)values(?,?)";
		String query = String.format(raw,MetaData.TABLE_NAME
		       ,MetaData.COLUMN_2
			   ,MetaData.COLUMN_3);
			   
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   
		   PreparedStatement ps = con.prepareStatement(query);
		   System.out.println(query+"^^^^&&((");
		   
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

	public static void closeConnection(Connection con){
		try{
			System.out.println("connection close");
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    public static ArrayList<Item> collectMyItems(Integer userId){
		System.out.println(userId+"************* in method");
		ArrayList<Item> items = new ArrayList<Item>();	
		Integer itemId = 0;
		Connection con=null;
		String raw = "SELECT %s from %s where %s="+userId+"";
		String query = String.format(raw,MetaData.COLUMN_3			   
			   ,MetaData.TABLE_NAME
		       ,MetaData.COLUMN_2);
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		//    ps.setInt(1,userId);
		   System.out.println(userId+"**************");
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()){
			   itemId = rs.getInt(1);
			   Item item = Item.collectSuchItem(itemId);
			   System.out.println(item+" item************** itemid"+itemId);
			   items.add(item); 	
		   }
		   System.out.println(items+" items**************");
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}

		return items;
	}

	public static Boolean DeleteItemFromCart(Integer userId,Integer itemId){
		Boolean flag = false;
		String query = "DELETE FROM carts WHERE item_id=? and user_id=?";		
		Connection con=null;		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   		   
		   ps.setInt(2,userId);	   
		   ps.setInt(1,itemId);	   
		   
		   ps.executeUpdate();
		   flag = true;
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}

    public static void createTable(){
		String query = "CREATE table carts(cart_id integer NOT NULL PRIMARY KEY AUTOINCREMENT,user_id integer,item_id integer,"+
        "constraint fk_carts_users FOREIGN key(user_id) REFERENCES users(user_id),"+
        "CONSTRAINT fk_carts_item FOREIGN KEY(item_id) REFERENCES items(item_id))";
		Connection con=null;
		// String query = String.format(raw,MetaData.TABLE_NAME,
		//        MetaData.COLUMN_1
		//        ,MetaData.COLUMN_2
		//        ,MetaData.COLUMN_3
		//        ,MetaData.COLUMN_4
		//        ,MetaData.COLUMN_5
		//        );
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
	
	public Integer getCartId() {
		return cartId;
	}
	
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Item getProduct() {
		return product;
	}
	public void setProduct(Item product) {
		this.product = product;
	}	
}
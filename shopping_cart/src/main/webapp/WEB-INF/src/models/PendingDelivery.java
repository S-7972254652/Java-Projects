package models;

import java.sql.*;
import java.io.*;

public class PendingDelivery {
	private Item item;
	private User user;
	private Integer pendingDeliveryId;	
	
	
	public PendingDelivery(Item item, User user, Integer pendingDeliveryId) {		
		this.item = item;
		this.user = user;
		this.pendingDeliveryId = pendingDeliveryId;
	}
	
	public PendingDelivery(){
		
    }

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    
    public static void createTable(){
		String query = "CREATE TABLE pending_deliveries(pd_id integer NOT NULL PRIMARY KEY AUTOINCREMENT,item_id integer NOT NULL,"+
        "user_id integer NOT NULL,constraint pd_users FOREIGN KEY(user_id) "+
        "REFERENCES users(user_id),CONSTRAINT fk_pd_items FOREIGN KEY(item_id) REFERENCES "+
        " items(item_id))";
		Connection con=null;
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
	public Integer getPendingDeliveryId() {
		return pendingDeliveryId;
	}
	public void setPendingDeliveryId(Integer pendingDeliveryId) {
		this.pendingDeliveryId = pendingDeliveryId;
	}
	
	
}

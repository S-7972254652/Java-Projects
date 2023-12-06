package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


/**
 * @author Shubham kewat..!!
 *
 */
public class User {
	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private String contact;
	private String userImage;
	
	
	public static final class MetaData{
		public static final String TABLE_NAME="users";
		public static final String COLUMN_1="user_id";
		public static final String COLUMN_2="user_name";
		public static final String COLUMN_3="user_email";
		public static final String COLUMN_4="user_password";
		public static final String COLUMN_5="user_contact";
		public static final String COLUMN_6="image_path";
		
	}
	
	
	// public User(Integer userId, String userName, String password, String email) {	
	// 	this.userId = userId;
	// 	this.userName = userName;
	// 	this.password = password;
	// 	this.email = email;
	// }

	
	public User(Integer userId, String userName,String email,String contact) {	
		this.userId = userId;
		this.userName = userName;		
		this.email = email;
		this.contact = contact;
	}

	
	public User(String userName,String email,String password) {		
		this.userName = userName;
		this.password = password;
		this.email = email;	
	}

	public User(String userName,String email,String password,String contact) {	
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}
	

	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	//utility methods
	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	public Boolean updateProfile(Integer userId,String path){
		Boolean flag = false;
		String query = "update users set image_path=? where user_id=?";
		Connection con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {

		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);

		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setString(1,path);
		   ps.setInt(2,userId);
		   
		   ps.executeUpdate();
		   flag = true;
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}

	public User saveInformation(){
		String raw = "INSERT INTO %s(%s,%s,%s,%s)values(?,?,?,?)";
		String query = String.format(raw,MetaData.TABLE_NAME
		       ,MetaData.COLUMN_2
		       ,MetaData.COLUMN_3
		       ,MetaData.COLUMN_4
		       ,MetaData.COLUMN_5);
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		Connection con=null;
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   System.out.println(query+"%%%%%%%%%%");
		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setString(1,userName);
		   ps.setString(2,email);
		   ps.setString(3,password);
		   ps.setString(4,contact);
		   
		   ps.executeUpdate();
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return this;
	}

	public static ArrayList<User> collectAllUsers(){
		ArrayList<User> users = new ArrayList();
		Connection con=null;
		String raw = "select %s,%s,%s,%s from %s";
		String query = String.format(raw,MetaData.COLUMN_1
		,MetaData.COLUMN_2
		,MetaData.COLUMN_3
		,MetaData.COLUMN_5
		,MetaData.TABLE_NAME);

		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ResultSet rs = ps.executeQuery();

		   while(rs.next()){
				users.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		   }
		   con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeConnection(con);
		}
		return users;
	}
	
	public static void updateTable(){
		String query = "ALTER TABLE users ADD COLUMN image_path varchar(300) DEFAULT NULL";
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



	public static void createTable(){
		String raw = "CREATE table %s(%s integer not null PRIMARY key AUTOINCREMENT,"
				+ "%s varchar(100),%s varchar(100) unique,%s varchar(200)not null,%s varchar(12) null)";
		Connection con=null;
		String query = String.format(raw,MetaData.TABLE_NAME,
		       MetaData.COLUMN_1
		       ,MetaData.COLUMN_2
		       ,MetaData.COLUMN_3
		       ,MetaData.COLUMN_4
		       ,MetaData.COLUMN_5
		       );
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

	public Boolean removeUser(Integer id){
		Boolean flag = false;
		String query = "delete from users where user_id=?";
		Connection con=null;
		// String query = String.format(raw,MetaData.TABLE_NAME,
		//        MetaData.COLUMN_1
		//        ,MetaData.COLUMN_2
		//        ,MetaData.COLUMN_3
		//        ,MetaData.COLUMN_4
		//        ,MetaData.COLUMN_5
		//        );
		System.out.println("deleting user!!!!!!!!!!!!");
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setInt(1,id);
		   ps.executeUpdate();		   
		   flag = true;
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}
	
		
	public static User checkExist(String email,String password){
		
		User u = null;
		Connection con=null;
		String raw = "SELECT %s,%s,%s,%s,%s,%s from %s where %s=? and %s=?";
		String query = String.format(raw,MetaData.COLUMN_1
		       ,MetaData.COLUMN_2
			   ,MetaData.COLUMN_3
			   ,MetaData.COLUMN_4
			   ,MetaData.COLUMN_5
			   ,MetaData.COLUMN_6
			   ,MetaData.TABLE_NAME
		       ,MetaData.COLUMN_3
		       ,MetaData.COLUMN_4
		       ,MetaData.TABLE_NAME);
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setString(1,email);
		   ps.setString(2,password);
		   
		   System.out.println(email+"@@@"+password+"##\n"+query);
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
			   u = new User();
			   u.setUserId(rs.getInt(1));
			   u.setUserName(rs.getString(2));
			   u.setEmail(rs.getString(3));
			   u.setPassword(rs.getString(4));
			   u.setContact(rs.getString(5));
			   u.setUserImage(rs.getString(6));
		   }
			System.out.println(u);   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}

		return u;
	}

	public static Boolean updateUserProfile(String name,String email,String contact,String password,Integer userId){
		Boolean flag = false;
		String query = "UPDATE users set user_name=?,user_email=?,user_password=?"
				+ ",user_contact=? WHERE user_id=?";		
		Connection con=null;				
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setString(1,name);
		   ps.setString(2,email);			
		   ps.setString(3,password);
		   ps.setString(4,contact);
		   ps.setInt(5,userId);
		   
		   ps.executeUpdate();
		   flag = true;
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setUserImage(String userImage){
		this.userImage = userImage;
	}
	public String getUserImage(){
		return userImage;
	}
	
	
}

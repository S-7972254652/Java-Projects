package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import models.User.MetaData;

public class Admin {
	private Integer adminId;
	private String email;
	private String name;
	private String password;
	private String contact;	
	
	public static final class MetaData{
		public static final String TABLE_NAME="admins";
		public static final String COLUMN_1="admin_id";
		public static final String COLUMN_2="admin_name";
		public static final String COLUMN_3="admin_email";
		public static final String COLUMN_4="admin_password";
		public static final String COLUMN_5="admin_contact";

	}
	
	public Admin(){
		
	}

	public Admin(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public Admin(Integer adminId, String email, String name, String password) {
		this.adminId = adminId;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public Admin(Integer adminId, String email, String name, String password,String contact) {
		this.adminId = adminId;
		this.email = email;
		this.name = name;
		this.password = password;
		this.contact = contact;
	}

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	public static void createTable(){
		String raw = "CREATE table %s(%s integer not null PRIMARY key AUTOINCREMENT,"
				+ "%s varchar(100),%s varchar(100),%s varchar(200)not null,%s varchar(12) not null)";
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
		   setAdmin();
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}
	

	public static void setAdmin(){
			String raw = "INSERT into %s(%s,%s,%s,%s)values(?,?,?,?)";
			
			String query = String.format(raw,MetaData.TABLE_NAME,
			       MetaData.COLUMN_2
			       ,MetaData.COLUMN_3
				   ,MetaData.COLUMN_4
				   ,MetaData.COLUMN_5);
			Connection con=null;
			String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
			try {
			   Class.forName("org.sqlite.JDBC");
			   con = DriverManager.getConnection(connectionURL);
			   PreparedStatement ps = con.prepareStatement(query);
			   
			   ps.setString(1,"Admin");
			   ps.setString(2,"admin@gmail.com");			
			   ps.setString(3,"1234");
			   ps.setString(4,"123456789");
			   
			   ps.executeUpdate();
			   
			   con.close();
			} catch (Exception e) {
			   e.printStackTrace();
			   closeConnection(con);
			}
		}
	
	public static Admin checkExist(String email, String password) {
		
		Admin u = null;
		Connection con=null;
		String raw = "SELECT %s,%s,%s,%s,%s from %s where %s=? and %s=?";
		String query = String.format(raw,MetaData.COLUMN_1
		       ,MetaData.COLUMN_2
			   ,MetaData.COLUMN_3
			   ,MetaData.COLUMN_5
			   ,MetaData.COLUMN_4
			   ,MetaData.TABLE_NAME
		       ,MetaData.COLUMN_3
		       ,MetaData.COLUMN_4);
		
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
			   u = new Admin();
			   u.setAdminId(rs.getInt(1));
			   u.setName(rs.getString(2));
			   u.setEmail(rs.getString(3));
			   u.setContact(rs.getString(4));
			   u.setPassword(rs.getString(5));

			   System.out.println(rs.getString(5));
		   }
			System.out.println(u);   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return u;
	}

	public static Boolean updateAdminProfile(String name,String email,String contact,String password){
		Boolean flag = false;
		String query = "UPDATE admins set admin_name=?,admin_email=?,admin_password=?"
				+ ",admin_contact=? WHERE admin_id=1";		
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
		   
		   ps.executeUpdate();
		   flag = true;
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}
	
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public void setContact(String contact){
		this.contact = contact;
	}
	public String getContact(){
		return contact;
	}

	
	
}

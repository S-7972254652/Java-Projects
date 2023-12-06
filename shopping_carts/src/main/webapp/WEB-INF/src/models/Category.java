package models;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Category {
	private Integer categoryId;
    private String name;
    
    public static final class MetaData{
		public static final String TABLE_NAME="categories";
		public static final String COLUMN_1="category_id";
		public static final String COLUMN_2="category";	
	}
	
	
	public Category(Integer categoryId, String name) {	
		this.categoryId = categoryId;
		this.name = name;
	}

	public Category(String name) {	
		this.name = name;
	}

	public Category(Integer categoryId) {	
		this.categoryId = categoryId;
	}

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    //utilities method
    public static void createTable(){
		String raw = "CREATE TABLE %s(%s integer not NULL  primary key AUTOINCREMENT,%s varchar(100))";
		Connection con=null;
		String query = String.format(raw,MetaData.TABLE_NAME,
		       MetaData.COLUMN_1
		       ,MetaData.COLUMN_2);
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

	public static Boolean DeleteCategory(Integer id){
		Boolean flag = false;
		Connection con=null;
		Item.deleteItem(id);
		String query = "DELETE from categories WHERE category_id=?";		
				
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

	public static Boolean updateCategory(Integer id,String name){
		Boolean flag = false;
		String query = "UPDATE categories set category=? where category_id=?";		
		Connection con=null;				
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setString(1,name);
		   ps.setInt(2,id);		   
		   
		   ps.executeUpdate();
		   flag = true;
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}

	public static void save(String category){
		String query = "INSERT INTO categories(category)values(?)";	
		Connection con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1,category);
           ps.executeUpdate();
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
        }
	}

	public static ArrayList<Category> collectAllCategories(){
		ArrayList<Category> list = new ArrayList();
		String query = "select category_id,category from categories order by category_id DESC";	
		Connection con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
           PreparedStatement ps = con.prepareStatement(query);
           
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()){
			   list.add(new Category(rs.getInt(1),rs.getString(2)));
		   }
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
        }
		return list;
	}
    
    public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}	
	
	
	
}

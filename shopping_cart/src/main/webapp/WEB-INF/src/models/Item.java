package models;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Item {
	private Integer itemId;	
	private Category category;
	private Integer price;
	private String description;
    private String itemName;
	private String imagePath;
    
    public static final class MetaData{
		public static final String TABLE_NAME="items";
		public static final String COLUMN_1="item_id";
		public static final String COLUMN_2="item_name";
		public static final String COLUMN_3="price";
		public static final String COLUMN_4="category_id";
		public static final String COLUMN_5="description";
	}    

	
	
	public Item(Category category,String itemName, String description,Integer price) {
		this.itemName = itemName;
		this.category = category;
		this.price = price;
		this.description = description;
	}

	public Item(Integer itemId, String itemName, Category category, Integer price, String description,String imagePath) {		
        this.itemId = itemId;
		this.imagePath = imagePath;
        this.itemName = itemName;
		this.category = category;
		this.price = price;
		this.description = description;
	}


	public Item(Integer itemId, String itemName, Category category, Integer price, String description) {		
        this.itemId = itemId;
        this.itemName = itemName;
		this.category = category;
		this.price = price;
		this.description = description;
	}

	// public Item(Integer itemId, String itemName, Category category, Integer price, String description) {		
    //     this.itemId = itemId;
    //     this.itemName = itemName;
	// 	this.category = category;
	// 	this.price = price;
	// 	this.description = description;
	// }

	public Item(){
		
	}

	public Item(Integer itemId){
		this.itemId	= itemId;
	}

	public static void deleteItem(Integer id){
		Connection con=null;
		
		String query = "DELETE from items WHERE category_id=?";		
				
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setInt(1,id);	   
		   
		   ps.executeUpdate();
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}

	public Boolean addItem(){
		Connection con=null;
		Boolean flag = false;
		String raw = "INSERT INTO %s(%s,%s,%s,%s)values(?,?,?,?)";
		
		String query = String.format(raw,MetaData.TABLE_NAME
		       ,MetaData.COLUMN_4
		       ,MetaData.COLUMN_2
		       ,MetaData.COLUMN_5
			   ,MetaData.COLUMN_3);
			   
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);

		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setInt(1,category.getCategoryId());
		   ps.setString(2,itemName);
		   ps.setString(3,description);
		   ps.setInt(4,price);
		   
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
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Boolean updateItemImage(Integer itemId,String path){
		Connection con=null;
		Boolean flag = false;
		System.out.println(path+" "+itemId);
		String query = "update items set image_path=? where item_id=?";
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {

		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);

		   PreparedStatement ps = con.prepareStatement(query);		   
		   
		   
		   ps.setString(1,path);
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

	public static void updateTable(){
		Connection con=null;
		String query = "ALTER TABLE items ADD COLUMN image_path varchar(300) DEFAULT null";
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   Boolean flag = ps.execute();
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}

	 
	public static void createTable(){
		String query = "CREATE table items(item_id integer not NULL primary key AUTOINCREMENT,item_name varchar(20) "+
        ",description varchar(2000),price Integer NOT NULL,category_id integer NOT NULL,CONSTRAINT "+ 
        "categories_items FOREIGN key(category_id) REFERENCES categories(category_id))";
		
		// String query = String.format(raw,MetaData.TABLE_NAME,
		//        MetaData.COLUMN_1
		//        ,MetaData.COLUMN_2
		//        ,MetaData.COLUMN_5
		//        ,MetaData.COLUMN_3
        //        ,Category.MetaData.COLUMN_1
        //        ,Cate
		//        );
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		Connection con=null;
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   Boolean flag = ps.execute();
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}

	public static ArrayList<Item> collectAllItem(){
		ArrayList<Item> items = new ArrayList();
		String query = "SELECT item_id,item_name,description,price,category,image_path FROM items as i inner "+
		"join categories as c where c.category_id=i.category_id ";
	
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		Connection con=null;
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()){
				// items.add(new Item(rs.getInt(1),rs.getString(2),new Category(rs.getString(5)),rs.getInt(4),rs.getString(3)));
				items.add(new Item(rs.getInt(1),rs.getString(2),new Category(rs.getString(5)),rs.getInt(4),rs.getString(3),rs.getString(6)));
		   }
		   con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeConnection(con);
		}
		return items;
	}

	public Item collectSuchItem(){
		Item item = null;
		String query = "SELECT item_id,item_name,description,price,category,image_path FROM items as i inner "+
		"join categories as c where c.category_id=i.category_id and item_id=?";
	
		Connection con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setInt(1,itemId);

		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
				item = new Item(rs.getInt(1),rs.getString(2),new Category(rs.getString(5)),rs.getInt(4),rs.getString(3),rs.getString(6));
		   }
		   con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeConnection(con);
		}
		return item;
	}


	public static Item collectSuchItem(Integer itemId){//3
		Item item = null;
		String query = "SELECT item_id,item_name,description,price,category FROM items as i inner "+
		"join categories as c where c.category_id=i.category_id and item_id=?";
	
		Connection con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setInt(1,itemId);

		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
				item = new Item(rs.getInt(1),rs.getString(2),new Category(rs.getString(5)),rs.getInt(4),rs.getString(3));
				//item = new Item(rs.getInt(1),rs.getString(2),new Category(rs.getString(5)),rs.getInt(4),rs.getString(3),rs.getString(6));
		   }
		   con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeConnection(con);
		}
		return item;
	}

	public static ArrayList<Item> collectSuchItems(Integer categoryId){
		ArrayList<Item> items = new ArrayList();
		String query = "SELECT item_id,item_name,description,price,category,image_path FROM items as i inner "+
		"join categories as c where c.category_id=i.category_id and i.category_id=? ";
	
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		Connection con=null;
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);

		   ps.setInt(1,categoryId);
		   
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()){
				items.add(new Item(rs.getInt(1),rs.getString(2),new Category(rs.getString(5)),rs.getInt(4),rs.getString(3),rs.getString(6)));
		   }
		   con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeConnection(con);
		}
		return items;
	}

	public static Boolean updateItem(Integer id,Integer price,String description,String name){
		Boolean flag = false;
		Connection con=null;
		String query = "UPDATE items set item_name=?,description=?,price=?"
				+ " WHERE item_id=?";		
				
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ps.setString(1,name);
		   ps.setString(2,description);			
		   ps.setInt(3,price);
		   ps.setInt(4,id);
		   
		   
		   ps.executeUpdate();
		   flag = true;
		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		return flag;
	}

	public static Boolean DeleteItem(Integer id){
		Connection con=null;
		Boolean flag = false;
		String query = "DELETE FROM items WHERE item_id=?";		
				
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

	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setImagePath(String imagePath){
		this.imagePath = imagePath;
	}
	public String getImagePath(){
		return imagePath;
	}
	
	
}

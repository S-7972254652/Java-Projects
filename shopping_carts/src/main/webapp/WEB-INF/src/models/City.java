package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class City {
	private Integer cityId;
	private String cityName;
	private State state;
	
	public static final class MetaData{
		public static final String TABLE_NAME="cities";
		public static final String COLUMN_1="city_id";
		public static final String COLUMN_2="city_name";
		public static final String COLUMN_3="state_id";
	}
	
	
	
	public City(Integer cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public City(Integer cityId, String cityName, State state) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.state = state;
	}
	
	
	
	public City(String cityName) {
		this.cityName = cityName;
	}

	public City(int int1) {
		// TODO Auto-generated constructor stub
	}

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void createTable(){
		String raw = "CREATE table %s(%s Integer not null primary KEY AUTOINCREMENT,"
				+ "%s varchar(100)not null,state_id Integer not null,"
				+ "CONSTRAINT fk_cities_states FOREIGN KEY (state_id) REFERENCES states(state_id))";
		Connection con=null;
		String query = String.format(raw,MetaData.TABLE_NAME,
		       MetaData.COLUMN_1
		       ,MetaData.COLUMN_2
		       ,State.MetaData.COLUMN_1
		       ,State.MetaData.COLUMN_1
		       ,State.MetaData.TABLE_NAME
		       ,State.MetaData.COLUMN_1);
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   Boolean flag = ps.execute();
		   System.out.println("cities    "+flag);
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}
	
	public static void addCities(){
		String raw = "INSERT into %s(%s,%s)values(?,?)";
		Connection con=null;
		String query = String.format(raw,MetaData.TABLE_NAME,
		       MetaData.COLUMN_2,
		       MetaData.COLUMN_3);
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   String[] cities = new String[5];
		   
		   cities[0] = "jabalpur";
		   cities[1] = "up city";
		   cities[2] = "pune";
		   cities[0] = "ahemdabad"; 
		   cities[0] = "ap city";
		   
		   for(int i=1;i<=cities.length;i++){
			   	
			   ps.setInt(1,i);
			   ps.setString(2,cities[i]);
		   		
			   	ps.executeUpdate();
		   }
		   con.close();
		   
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		
	}
	
	public static ArrayList<City> collectCities(){
		ArrayList<City> cities = new ArrayList();
		String raw = "SELECT %s,%s from %s";
		Connection con=null;
		String query = String.format(raw,MetaData.COLUMN_1
		       ,MetaData.COLUMN_2
		       ,MetaData.TABLE_NAME);
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   
		   ResultSet rs = ps.executeQuery();
		   
		   while(rs.next())
			   cities.add(new City(rs.getInt(1),rs.getString(2)));
		   
		   con.close();
		   
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		
		return cities;
	}
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCity(String cityName) {
		this.cityName = cityName;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
	
}

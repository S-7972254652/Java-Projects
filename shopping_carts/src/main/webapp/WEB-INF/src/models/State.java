package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import java.io.*;


public class State {
	private Integer stateId;
	private String stateName;
	
	public static final class MetaData{
		public static final String TABLE_NAME="states";
		public static final String COLUMN_1="state_id";
		public static final String COLUMN_2="state_name";
	}
	
	public State(Integer stateId,String stateName) {
		this.stateId = stateId;
		this.stateName = stateName;
	}

	public static void createDirectories(){
	
		File f = new File("E:","workspace");

		if(!f.exists())
			f.mkdir();

	}

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	public static void createTable(){
		String raw = "CREATE table %s(%s Integer not null PRIMARY key AUTOINCREMENT"
				+ ",%s varchar(100) not NULL)";
		String query = String.format(raw,MetaData.TABLE_NAME,
		       MetaData.COLUMN_1
		       ,MetaData.COLUMN_2);
		Connection con=null;
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   createDirectories();
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   Boolean flag = ps.execute();
		   System.out.println("models.Student.createStudentTable()"+flag);
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
	}
	
	public static void addStates(){
		String raw = "INSERT into %s(%s)values(?,?)";
		Connection con=null;
		
		String query = String.format(raw,MetaData.TABLE_NAME,
		       MetaData.COLUMN_2);
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
		   PreparedStatement ps = con.prepareStatement(query);
		   String[] states = new String[5];
		   
		   states[0] = "MP";
		   states[1] = "UP";
		   states[2] = "Maharastra";
           states[0] = "Gujrat"; 
		   states[0] = "Andhra Pradesh";
		   
		   for(int i=0;i<states.length;i++){
			   	ps.setString(1,states[i]);
		   		ps.executeUpdate();
		   }
		   con.close();
		   
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		
	}
	
	public static ArrayList<State> collectStates(){
		ArrayList<State> states = new ArrayList();
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
			   states.add(new State(rs.getInt(1),rs.getString(2)));
		   
		   con.close();
		   
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
		}
		
		return states;
	}
	//getter setters downword...................!

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	
	
}

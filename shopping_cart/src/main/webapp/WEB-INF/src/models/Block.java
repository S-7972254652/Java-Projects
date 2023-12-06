package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Block {
    private Integer blockId;
    private User user;

    public static class MetaData{
        public static final String TABLE_NAME="blocks";
        public static final String COLUMN_1="block_id";
        public static final String COLUMN_2="user_id";
    }
    
    public Block(Integer blockId, User user) {
		super();
		this.blockId = blockId;
		this.user = user;
	}
    
    public Block(){

    }

	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    
    public static void createTable(){
		String query = "CREATE table blocks(block_id integer NOT NULL PRIMARY KEY AUTOINCREMENT,user_id integer not NULL,"+
                   "constraint fk_users_block FOREIGN KEY(user_id) REFERENCES users(user_id))";
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
    
    public Boolean blockUser(Integer userId){
        Boolean flag = false;
        String query = "INSERT INTO blocks(user_id)values(?)";
		Connection con=null;
		
		String connectionURL = "jdbc:sqlite:/E:/workspace/shopping_cart.db";
		try {
		   Class.forName("org.sqlite.JDBC");
		   con = DriverManager.getConnection(connectionURL);
           PreparedStatement ps = con.prepareStatement(query);
           ps.setInt(1,userId);
           ps.executeUpdate();
           flag = true;		   
		   con.close();
		} catch (Exception e) {
		   e.printStackTrace();
		   closeConnection(con);
        }
        return flag;
    }
    
	public Integer getBlockId() {
		return blockId;
	}
	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    
    
}
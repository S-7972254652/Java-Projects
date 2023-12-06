package jdbcconnect1;

import java.sql.Connection;
import java.sql.DriverManager;

public class InsertPrepared {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:"+"mysql://localhost:3306/emp","root","");
		java.sql.Statement stmt=con.createStatement();
		int result=stmt.executeUpdate("INSERT INTO `empinfo`("
				+ " `EmpName`, `EmpAddress`)" 
				+ "VALUES ('Shrenik','Nashik')");
		System.out.println(result+" records affected");
		con.close();
		
	}

}

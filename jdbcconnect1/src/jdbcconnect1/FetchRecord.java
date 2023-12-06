package jdbcconnect1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class FetchRecord {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:"+ "mysql://localhost:3306/emp","root","");  
		java.sql.Statement stmt=con.createStatement();    
		int result=stmt.executeUpdate("delete from empinfo where Empid=3");  
		System.out.println(result+" records affected");  
		con.close();   
	}

}

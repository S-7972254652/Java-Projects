package jdbcconnect1;

import java.sql.Connection;
import java.sql.DriverManager;

public class UpdatePrepared {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:"+"mysql://localhost:3306/emp","root","");
		java.sql.Statement stmt=con.createStatement();
		int result=stmt.executeUpdate("UPDATE `empinfo` SET`EmpName`='Raj',`EmpAddress`='Pune' WHERE EmpId= 1");
		System.out.println(result+" records affected");
		con.close();
		
	}

}

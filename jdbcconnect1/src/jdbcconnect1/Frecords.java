package jdbcconnect1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Frecords {

	public static void main(String[] args) throws Exception {
		int EmpID;
		String EmpName,EmpAddress;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmpID,EmpName,EmpAddress");
		EmpName=sc.next();
		EmpAddress=sc.next();
		//Basic code end
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:"+"mysql://localhost:3306/emp","root","");
		java.sql.Statement stmt=con.createStatement();
		String str="INSERT INTO `empinfo`(`EmpName`, `EmpAddress`) VALUES ('"+EmpName+"','"+EmpAddress+"')";
		System.out.println(str);
		int result=stmt.executeUpdate(str);
		System.out.println(result+"records affected");
		con.close();

		
	}

}

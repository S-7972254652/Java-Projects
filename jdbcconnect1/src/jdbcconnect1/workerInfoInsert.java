package jdbcconnect1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class workerInfoInsert {

	public static void main(String[] args) throws Exception {
	String workerName,workingLocation;
	int workerSalary;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name,location and salary");
	workerName=sc.next();
	workingLocation=sc.next();
	workerSalary=sc.nextInt();	
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:"+"mysql://localhost:3306/emp","root","");
	java.sql.Statement stmt=con.createStatement();
	int result=stmt.executeUpdate("INSERT INTO `worker`( `workerName`, `workerSalary`, `workingLocation`) VALUES ('"+workerName+"','"+workerSalary+"','"+workingLocation+"')");
	System.out.println(result+"Record Affected");
	con.close();
	}

}

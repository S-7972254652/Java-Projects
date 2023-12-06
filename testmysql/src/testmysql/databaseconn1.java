package testmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class databaseconn1 {
	//static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
	
	static Connection conn = null;
	public static void main(String[] args) {
		try
		{
			
				conn =
					       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
					                                   "user=minty&password=greatsqldb");
			
		}
		catch(Exception ex){   System.out.println("SQLException: " + ex.getMessage());
	    System.out.println("SQLState: " + ex.getSQLState());
	    System.out.println("VendorError: " + ex.getErrorCode());}  
	
	}  

	}

}



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public void contextInitialized(ServletContextEvent e) { 
		 try{  
			// Class.forName("com.mysql.cj.jdbc.Driver");  
			  //Connection con=DriverManager.getConnection(  
				//	 "jdbc:mysql://localhost:3306/employee","root","");  
			           
			 //storing connection object as an attribute in ServletContext  
			  //ServletContext ctx=e.getServletContext();  
			 //ctx.setAttribute("mycon", con);  
			           
			 }catch(Exception ex){ex.printStackTrace();}  
		 
	 }
	 public void doGet(HttpServletRequest request, HttpServletResponse  
			   response)throws ServletException, IOException {
		 response.setContentType("text/html");  
		 PrintWriter out = response.getWriter();  
		       out.print("Hello from Doget");
		 try{  
		 //Retrieving connection object from ServletContext object  
		// ServletContext ctx=getServletContext();  
		 //Connection con=(Connection)ctx.getAttribute("mycon");  
		   
		 //retieving data  from emp32 table  
			 Class.forName("com.mysql.cj.jdbc.Driver");  
			  Connection con=DriverManager.getConnection(  
					 "jdbc:mysql://localhost:3306/employee","root","");  
			           
			 //storing connection object as an attribute in ServletContext  
			  ServletContext ctx=getServletContext();  
			 ctx.setAttribute("mycon", con);  
		 PreparedStatement ps=con.prepareStatement("select * from emp",  
		 ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		               
		 ResultSet rs=ps.executeQuery(); 
		 out.print("Hello from before while"); 
		 while(rs.next()){  
			 out.print("Hello from while"); 
		 out.print("<br>"+rs.getString(1)+" "+rs.getString(2));  
		 }  
		               
		 con.close();  
		 }catch(Exception e){
			 
			 String s=e.toString();
		out.print(s);	 
		 }  
		           
		 out.close();  
	 }
	 public void contextDestroyed(ServletContextEvent arg0) {  
		 System.out.println("project undeployed");  
		           
		 }  

}

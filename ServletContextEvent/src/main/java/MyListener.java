

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class MyListener implements ServletContextListener{
	Connection con;
	public void contextInitialized(ServletContextEvent event) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			 con=DriverManager.getConnection(  
					 "jdbc:mysql://localhost:3306/emp","root","");  
			          
			//storing connection object as an attribute in ServletContext  
			ServletContext ctx=event.getServletContext();  
			ctx.setAttribute("mycon", con);  
			          
			}catch(Exception e){e.printStackTrace();}  
	}
		public void contextDestroyed(ServletContextEvent arg0) {}
		public void doGet(HttpServletRequest request, HttpServletResponse response)  
		        throws ServletException, IOException {  
		  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		      
		try{  
		//Retrieving connection object from ServletContext object  
		
		  
		//retieving data  from emp32 table        
		PreparedStatement ps=con.prepareStatement("select * from emp32",  
		ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		              
		ResultSet rs=ps.executeQuery();  
		while(rs.next()){  
		out.print("<br>"+rs.getString(1)+" "+rs.getString(2));  
		}  
		              
		con.close();  
		}catch(Exception e){e.printStackTrace();}  
		          
		out.close();  
		}  
}


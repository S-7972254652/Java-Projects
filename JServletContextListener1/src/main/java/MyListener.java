

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
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


public class MyListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void contextInitialized(ServletContextEvent event) {  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");  
		            
		ServletContext ctx=event.getServletContext();  
		ctx.setAttribute("mycon", con);  
		          
		}catch(Exception e){System.out.println(e);}  
		}  
		  
		public void contextDestroyed(ServletContextEvent arg0) {}  
		 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		      
		try{  
		 
		ServletContext ctx=getServletContext();  
		Connection con=(Connection)ctx.getAttribute("mycon");  
		  
		      
		PreparedStatement ps=con.prepareStatement("select * from emp");  
        
		ResultSet rs=ps.executeQuery();    
		while(rs.next()){  
		out.print("<br>"+rs.getString(1)+" "+rs.getString(2));  
		}  
		              
		con.close();  
		}catch(Exception e){System.out.println(e);}  
		          
		out.close();  
	}

}

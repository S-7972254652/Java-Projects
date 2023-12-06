

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class MyListener
 */
public class MyListener extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public void contextInitialized(ServletContextEvent event) {  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xe","root","");

			ServletContext ctx=event.getServletContext();  
			ctx.setAttribute("mycon", con);
			
			PreparedStatement ps=con.prepareStatement("select * from emp",  
					ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
			
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
			out.print("<br>"+rs.getString(1)+" "+rs.getString(2));  
			}  
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

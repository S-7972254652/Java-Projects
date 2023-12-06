

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Servlet implementation class MyListener
 */
public class MyListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void contextInitialized(ServletContextEvent event) {  
	
	public void contextDestroyed(ServletContextEvent arg0) {}  
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			
			ServletContext ctx=event.getServletContext();  
			ctx.setAttribute("mycon", con);
			
		}catch(Exception e){e.printStackTrace();}  
	}
	}

}

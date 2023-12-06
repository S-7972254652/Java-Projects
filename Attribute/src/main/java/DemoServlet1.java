

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
	try {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		ServletContext context=getServletContext();  
		context.setAttribute("company","IBM");  
		  
		out.println("Welcome to first servlet");  
		out.println("<a href='servlet2'>visit</a>");  
		out.close();  
	}catch(Exception e) {
		System.out.println(e);	
	}
	}

}

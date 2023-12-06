

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	      
	        String n=request.getParameter("username");  
	        out.print("Welcome "+n);  
	          
	        HttpSession session=request.getSession();  
	        session.setAttribute("uname",n);  
	          
	        //retrieving data from ServletContext object  
	        ServletContext ctx=getServletContext();  
	        int t=(Integer)ctx.getAttribute("totalusers");  
	        int c=(Integer)ctx.getAttribute("currentusers");  
	        out.print("<br>total users= "+t);  
	        out.print("<br>current users= "+c);  
	          
	        out.print("<br><a href='logout'>logout</a>");  
	          
	        out.close();  
	}

}

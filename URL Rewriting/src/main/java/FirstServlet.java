

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String n=request.getParameter("userName");
	out.print("Welcome"+n);
	
	out.print("<a href='servlet2?uname="+n+"'>visit</a>");  
	
	out.close();
}catch(Exception e) {
	System.out.println(e);
}
	}

}

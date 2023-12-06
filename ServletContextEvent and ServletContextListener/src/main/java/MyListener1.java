

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class MyListener1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	try {
		ServletContext ctx=getServletContext();  
		Connection con=(Connection)ctx.getAttribute("mycon");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from emp");
		
		while(rs.next()) {
			out.print("<br>"+rs.getString(1)+" "+rs.getString(2));
		}
		con.close();  
	}catch(Exception e) {
		System.out.println(e);
	}
	out.close();

}

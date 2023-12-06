

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String myname=request.getParameter("name1");
	String myemail=request.getParameter("email1");
	String mypassword=request.getParameter("pass1");
	String mygender=request.getParameter("gender");
	String mycity=request.getParameter("city1");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql::localhost:3306/yt_demo","root","");
		
		PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, myname);
		ps.setString(2, myemail);
		ps.setString(3, mypassword);
		ps.setString(4, mygender);
		ps.setString(5, mycity);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		try(PrintWriter out=response.getWriter()) {
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		} catch (Exception e) {
			// TODO: handle exception
		}

}
}
















//PrintWriter out=response.getWriter();
//
//String email=request.getParameter("email");	
//String pass=request.getParameter("pass");
//HttpSession session=request.getSession();
//RequestDispatcher dispatcher=null;
//
//
//if(pass.equals("admin123") && email.equals("admin@gmail.com") ){  
//request.getRequestDispatcher("admin.jsp").include(request, response); 
//
//}else{  
//
//try {
//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food?useSSL=false","root","");
//PreparedStatement pst=con.prepareStatement("select * from foodregister where email=? and pass=?");
//pst.setString(1, email);
//pst.setString(2, pass);
//
//ResultSet rs= pst.executeQuery();
//
//if(rs.next()) {
//	session.setAttribute("name", rs.getString("name"));
//	dispatcher=request.getRequestDispatcher("home.jsp");
//}else {
//	request.setAttribute("status", "failed");
//	dispatcher=request.getRequestDispatcher("index.jsp");
//}
//dispatcher.forward(request, response);
//} catch (Exception e) {
//e.printStackTrace();
//}
//}
//}


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
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();
			
			String email=request.getParameter("email");	
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher=null;
		
		
  

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false","root","");
			PreparedStatement pst=con.prepareStatement("select * from log where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);
			
			ResultSet rs= pst.executeQuery();
			
			if(rs.next()) {
				session.setAttribute("name", rs.getString("email"));
				dispatcher=request.getRequestDispatcher("home.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher=request.getRequestDispatcher("index.jsp");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		

	

	}





import jakarta.servlet.RequestDispatcher;
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
import java.sql.SQLException;

@WebServlet("/Register")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		PrintWriter out=response.getWriter();
		out.print("name");
		out.print("phone");
		out.print("email");
		out.print("pass");
		
		RequestDispatcher dispatcher=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food?useSSL=false","root","");
			PreparedStatement pst=con.prepareStatement("insert into foodregister(name,phone,email,pass) values(?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, phone);
			pst.setString(3, email);
			pst.setString(4, pass);
			
		int rowCount=pst.executeUpdate();
		dispatcher=request.getRequestDispatcher("Register.jsp");
		if(rowCount>0) {
			request.setAttribute("status", "success");
		}else {
			request.setAttribute("status", "failed");
			
		}
		dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
					}finally {
						try {
							con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
	}

}

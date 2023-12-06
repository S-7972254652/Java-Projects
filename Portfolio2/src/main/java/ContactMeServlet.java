

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

@WebServlet("/Contact")
public class ContactMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		
		PrintWriter out=response.getWriter();
		out.print("name");
		out.print("email");
		out.print("subject");
		out.print("message");
		
		RequestDispatcher dispatcher=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","");
			PreparedStatement pst=con.prepareStatement("insert into users(uname,upwd,uemail,umobile) values(?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, subject);
			pst.setString(4, message);
			
		int rowCount=pst.executeUpdate();
		dispatcher=request.getRequestDispatcher("index.jsp");
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

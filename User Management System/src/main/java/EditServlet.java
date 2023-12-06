

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

@WebServlet("/editurl")

public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private static final String query="update USERDATA set NAME=?,EMAIL=?,MOBILE=?,DOB=?,CITY=? where id=?";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//Get the id of record
		int id=Integer.parseInt(req.getParameter("id"));

		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String Mobile=req.getParameter("Mobile");
		String DOB=req.getParameter("DOB");
		String City=req.getParameter("City");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		//Connection
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
			PreparedStatement ps=con.prepareStatement(query);){
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, Mobile);
			ps.setString(4, DOB);
			ps.setString(5, City);
			ps.setInt(6, id);
			
			int count=ps.executeUpdate();
			if(count==1) {
				pw.println("<h2>Record is updated</h2>");
			}
			else {
				pw.println("<h2>Record is not updated</h2>");
				
			}
						}
		catch(SQLException se){
					se.printStackTrace();
					pw.println("<h1>"+se.getMessage()+"</h2>");
					}
		
		catch(Exception e1) {
			e1.printStackTrace();
			pw.println("<h1>"+e1.getMessage()+"</h2>");
		}
		pw.println("<a href='index.html'>Home</a>");
		pw.println("<br>");
		pw.println("<a href='userList'>User List</a>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}



}

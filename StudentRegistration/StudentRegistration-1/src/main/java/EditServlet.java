

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
       

private static final String query="update STUDENTDATA set NAME=?,GENDER=?,ADDRESS=?,PHONE=?,EMAIL=?,DOB=?,QUALIFICATION=?,SPECIALIZATION=?,STATUS=?,COLLEGENAME=? where id=?";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//Get the id of record
		int id=Integer.parseInt(req.getParameter("id"));

		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		String phone=req.getParameter("phone");
		String email=req.getParameter("email");
		String DOB=req.getParameter("DOB");
		String qualification=req.getParameter("qualification");
		String specialization=req.getParameter("specialization");
		String status=req.getParameter("status");
		String collegename=req.getParameter("cname");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		//Connection
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			PreparedStatement ps=con.prepareStatement(query);){
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, address);
			ps.setString(4, phone);
			ps.setString(5, email);
			ps.setString(6, DOB);
			ps.setString(7, qualification);
			ps.setString(8, specialization);
			ps.setString(9, status);
			ps.setString(10, collegename);
			ps.setInt(11, id);
			
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
		pw.println("<a href='studentList'>User List</a>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}


}

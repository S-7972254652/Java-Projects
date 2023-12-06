

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

@WebServlet("/Details")
public class RegisterLecture extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String query="INSERT INTO COURSEDATA(NAME,COURSENAME,BATCH,DURATION,FEES)VALUES(?,?,?,?,?)";
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//String bookname=req.getParameter("bookname");
		String name=req.getParameter("name");
		String coursename=req.getParameter("coursename");
		String batch=req.getParameter("batch");
		String duration=req.getParameter("duration");
		String fees=req.getParameter("fees");
		
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
			ps.setString(2, coursename);
			ps.setString(3, batch);
			ps.setString(4, duration);
			ps.setString(5, fees);
			
			int count=ps.executeUpdate();
			if(count==1) {
				pw.println("<h2>Record is Registered Successfully</h2>");
			}else {
				pw.println("<h2>Record is not Registered Successfully</h2>");
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
		pw.println("<a href='register.html'>Home</a>");
		pw.println("<br>");
		pw.println("<a href='CourseList'>Course List</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}

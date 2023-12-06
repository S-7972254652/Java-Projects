

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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	private static final String query="INSERT INTO STUDENTDATA(NAME,GENDER,ADDRESS,PHONE,EMAIL,DOB,QUALIFICATION,SPECIALIZATION,STATUS,COLLEGENAME)VALUES(?,?,?,?,?,?,?,?,?,?)";
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//String bookname=req.getParameter("bookname");
		String Name=req.getParameter("name");
		String Gender=req.getParameter("gender");
		String Address=req.getParameter("address");
		String Phone=req.getParameter("phone");
		String Email=req.getParameter("Email");
		String DOB=req.getParameter("dob");
		String Qualification=req.getParameter("qualification");
		String Specialization=req.getParameter("specialization");
		String Status=req.getParameter("status");
		String CollegeName=req.getParameter("cname");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		//Connection
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		PreparedStatement ps=con.prepareStatement(query);){
			ps.setString(1, Name);
			ps.setString(2, Gender);
			ps.setString(3, Address);
			ps.setString(4, Phone);
			ps.setString(5, Email);
			ps.setString(6, DOB);
			ps.setString(7, Qualification);
			ps.setString(8, Specialization);
			ps.setString(9, Status);
			ps.setString(10, CollegeName);
			
			
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
		pw.println("<a href='studentList'>User List</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}

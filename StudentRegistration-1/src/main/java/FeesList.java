

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
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/FeesList")
public class FeesList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private static final String query="SELECT ID,NAME,amount,PAYMENTMODE,BALANCEDAMOUNT,AOUNTINWORDS FROM FEESDATA";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<link rel='stylesheet' href='css/bootstrap.css'></link>");
		pw.println("<script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\r\n"
				+ "<script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		//Connection
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			PreparedStatement ps=con.prepareStatement(query);){
			ResultSet rs=ps.executeQuery();
			pw.println("<table class='table table-hover table-striped table-bordered border'>");
			pw.println("<tr	>");
			pw.println("<th>Id</th>");
			pw.println("<th>Name</th>");
			pw.println("<th>Amount</th>");
			pw.println("<th>Payment Mode</th>");
			pw.println("<th>Balanced Amount</th>");
			pw.println("<th>Amount In Words</th>");
			pw.println("<th colspan='2'>Action</th>");
			pw.println("</tr>");
			while(rs.next()) {	
				pw.println("<tr>");
				pw.println("<td>"+rs.getInt(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
				pw.println("<td>"+rs.getString(4)+"</td>");
				pw.println("<td>"+rs.getString(5)+"</td>");
				pw.println("<td>"+rs.getString(6)+"</td>");
			
				//pw.println("<td>"+rs.getString(8)+"</td>");
				pw.println("<td><a href='editFeesScreen?id="+rs.getInt(1)+"'><ion-icon class='text-white rounded fs-5 bg-success p-2' name=\"pencil-outline\"></ion-icon></a></td>");
				pw.println("<td><a href='deleteFeesurl1?id="+rs.getInt(1)+"'><ion-icon class='text-white rounded fs-5 bg-danger p-2' name=\"trash-outline\"></ion-icon></a></td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
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
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req, res);	
	
	}

}

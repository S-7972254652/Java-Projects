

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

@WebServlet("/editFeesScreen")
public class FeesEditScreenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private static final String query="SELECT NAME,AMOUNT,PAYMENTMODE,BALANCEDAMOUNT,AOUNTINWORDS FROM FEESDATA where id=?";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<link rel='stylesheet' href='css/bootstrap.css'></link>");
		//Get the id of record
		int id=Integer.parseInt(req.getParameter("id"));

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		//Connection
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			PreparedStatement ps=con.prepareStatement(query);){
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			pw.println("<form action='editurl1?id="+id+"' method='post'>");
			pw.println("<table>");
			
			pw.println("<tr>");
			pw.println("<td>Name</td>");
			pw.println("<td><input type='text' name='name' value='"+rs.getString(1)+"'></td>");
			pw.println("</tr>");
			
			
			pw.println("<tr>");
			pw.println("<td>Amount</td>");
			pw.println("<td><input type='text' name='amount' value='"+rs.getString(2)+"'></td>");
			pw.println("</tr>");

			pw.println("<tr>");
			pw.println("<td>Payment Method</td>");
			pw.println("<td><input type='text' name='pmode' value='"+rs.getString(3)+"'></td>");
			pw.println("</tr>");
			
			pw.println("<tr>");
			pw.println("<td>Balanced Mode</td>");
			pw.println("<td><input type='text' name='bamount' value='"+rs.getString(4)+"'></td>");
			pw.println("</tr>");
			
			pw.println("<tr>");
			pw.println("<td>Amount Paid In Words</td>");
			pw.println("<td><input type='text' name='wamount' value='"+rs.getString(5)+"'></td>");
			pw.println("</tr>");

						
			pw.println("<tr>");
			pw.println("<td><input type='submit' value='Edit'></td>");
			pw.println("<td><input type='reset' value='cancel'></td>");
			pw.println("</tr>");
			
			pw.println("</table>");
			pw.println("</form>");
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
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req, res);	
	
	}


}

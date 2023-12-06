package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String cpassword=req.getParameter("cpassword");
			String check=req.getParameter("check");
			//System.out.println(fname+" "+lname+" "+email+" "+password+" "+cpassword);
			
			User us=new User();
			us.setFirstname(fname);
			us.setLastname(lname);
			us.setEmail(email);
			us.setPassword(password);
			us.setCpassword(cpassword);
			
			HttpSession session=req.getSession();
			
			if(check!=null) {
				
				UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
				boolean f=dao.userRegister(us);
				if(f) {
					//System.out.println("User Register Successfully");
					session.setAttribute("succMsg", "Register Success..");
					resp.sendRedirect("account.jsp");
				}else {
					//System.out.println("User Not Register Successfully");
					session.setAttribute("failedMsg", "User Not Register..");
					resp.sendRedirect("account.jsp");
				}
			}else {
				session.setAttribute("failedMsg", "Please Agree Terms & Conditions");
				resp.sendRedirect("account.jsp");
				//System.out.println("Please Agree Terms & Conditions");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}

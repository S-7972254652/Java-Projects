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
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name=req.getParameter("fname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String mobile=req.getParameter("mobile");
			String check=req.getParameter("check");
			
			//System.out.println(name+" "+email+" "+mobile+" "+password+" "+check);
			
			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPassword(password);
			us.setMobile(mobile);
			
			HttpSession session=req.getSession();
			
			
			if(check!=null)
			{
				UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
				boolean f=dao.userRegister(us);
				
				if(f) {
					//System.out.println("User Register Successfully");
					
					session.setAttribute("succMsg","Register Successfully..");
					resp.sendRedirect("Register.jsp");
				}
				else {
					
					//System.out.println("Something Went Wrong");
					
					session.setAttribute("failedMsg","Something Went Wrong..");
					resp.sendRedirect("Register.jsp");
				}	
			}else {
				//System.out.println("Please check Agree Terms & Conditions");
				session.setAttribute("failedMsg","Please check Agree Terms & Conditions..");
				resp.sendRedirect("Register.jsp");
				
			}
			
			
			
		} catch (Exception e) {
e.printStackTrace();
}
	}

}

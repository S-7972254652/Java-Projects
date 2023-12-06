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
		String name=req.getParameter("name");	
		String password=req.getParameter("password");	
		String email=req.getParameter("email");	
		String mobile=req.getParameter("mobile");
		
//		System.out.println(name+" "+password+" "+email+" "+mobile);
		
		User us=new User();
		us.setName(name);
		us.setPassword(password);
		us.setEmail(email);
		us.setMobile(mobile);
		
		
		
		UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
		boolean f=dao.userRegister(us);
		HttpSession session=req.getSession();
		
		if(f)
		{
			session.setAttribute("succMsg","Register Successfully..");
			resp.sendRedirect("register.jsp");
			
		}
		else {
			session.setAttribute("failedMsg","Something Went Wrong..");
			resp.sendRedirect("register.jsp");
			
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

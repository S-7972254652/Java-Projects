package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Admin;

/**
 * Servlet implementation class AdninLoginServlet
 */
@WebServlet("/AdninLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Admin admin = Admin.checkExist(email,password);
		
		if(admin!=null){
			session.setAttribute("admin",admin);
			request.getRequestDispatcher("admin_dashboard.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("admin_login.jsp").forward(request, response);
		}
		
		
	}

}

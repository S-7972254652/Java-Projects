package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.*;
import java.util.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class UserLoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String email = request.getParameter("email");
		String passw = request.getParameter("password");
        
        System.out.println(email+"!!"+passw);
		User user = User.checkExist(email,passw);

		if(user==null){
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}	
		else{
			ArrayList<Item> items = Item.collectAllItem();
			session.setAttribute("user", user);
			session.setAttribute("items",items);
			request.setAttribute("name",user.getUserName());

			request.getRequestDispatcher("user_dashboard.jsp").forward(request, response);
		}
	}

}

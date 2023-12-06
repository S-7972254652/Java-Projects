package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import java.util.*;

import models.*;

/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
		String email = request.getParameter("email");
        String password =request.getParameter("password");
        String contact = request.getParameter("contact");
        User user = null;
        
        ArrayList<Item> items = Item.collectAllItem();        
            
        if(contact!=null){
            user = new User(name,email,password,contact);
        }else{
            user = new User(name,email,password);
        }        
        user.saveInformation();
        session.setAttribute("user", user);
        session.setAttribute("items",items);                
        
        request.getRequestDispatcher("login.jsp").forward(request,response);
	}

}

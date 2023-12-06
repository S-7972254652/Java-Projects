package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

import models.*;
/**
 * Servlet implementation class BlockUserServlet
 */
@WebServlet("/BlockUserServlet")
public class UpdateUserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
            String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
            String password = request.getParameter("password");
            Integer userId = ((User)session.getAttribute("user")).getUserId();           
         
			Boolean flag = User.updateUserProfile(name,email,contact,password,userId);
			
			if(flag){
				request.setAttribute("message"," profile updated :)");
				request.getRequestDispatcher("success.jsp").forward(request,response);
			}else{
				request.setAttribute("message","sorry unable to update profile at this moment! :(");
				request.getRequestDispatcher("success.jsp").forward(request,response);
			}
			
		
	}

}

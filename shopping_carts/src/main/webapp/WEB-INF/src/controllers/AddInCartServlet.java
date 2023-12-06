package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

import java.util.*;

import models.*;

/**
 * Servlet implementation class BlockUserServlet
 */
@WebServlet("/CollectItemServlet")
public class AddInCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");
        Integer userId = user.getUserId();
        
        Integer itemId = Integer.parseInt(request.getParameter("id"));
        System.out.println(userId+"!!!!!!!!!!!!!!!!!!!!!!!!!"+itemId);

        Boolean flag = Cart.addItem(itemId,userId);

        if(flag){
            request.setAttribute("message","item added to your cart successfully :)");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            request.setAttribute("message","unable to process request at this moment :(");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
	}

}

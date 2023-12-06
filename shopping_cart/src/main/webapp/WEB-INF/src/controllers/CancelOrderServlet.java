package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

import models.*;

/**
 * Servlet implementation class BlockUserServlet
 */
@WebServlet("/CollectItemServlet")
public class CancelOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        Integer userId = Integer.parseInt(request.getParameter("user_id"));
        Integer itemId = Integer.parseInt(request.getParameter("item_id"));

        Boolean flag = Order.DeleteOrder(userId,itemId);
        
        if(flag){
            request.setAttribute("message"," your order cancelled suzccessfully :(");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            request.setAttribute("message","sorry unable process request at this moment! :(");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
        
	}

}

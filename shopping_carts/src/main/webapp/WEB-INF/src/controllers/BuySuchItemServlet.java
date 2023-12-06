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
public class BuySuchItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        HttpSession session = request.getSession();
        Integer itemId = Integer.parseInt(request.getParameter("item_id"));
        Integer userId = ((User)session.getAttribute("user")).getUserId();
        
        System.out.println(itemId+"################"+userId);
        Item myItems = new Item(itemId).collectSuchItem();        
        System.out.println(" my items ################"+myItems);
        
        if(myItems!=null){
            request.setAttribute("item",myItems);
            request.getRequestDispatcher("do_payement.jsp").forward(request,response);
            Order.updateOrder(userId,itemId);
        }else{
            request.setAttribute("message","unable to process request at this moment :(");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
	}

}

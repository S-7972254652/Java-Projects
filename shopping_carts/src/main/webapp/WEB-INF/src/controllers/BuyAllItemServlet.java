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
public class BuyAllItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        // HttpSession session = request.getSession();
        Integer userId = Integer.parseInt(request.getParameter("user_id"));
        
        ArrayList<Item> myItems = Cart.collectMyItems(userId);
        System.out.println(userId+"*************+++++++++++++++~~~~~~~~~"+ myItems.size());
        
        if(myItems!=null){
            request.setAttribute("item",myItems);
            request.getRequestDispatcher("buy_all_items.jsp").forward(request,response);
        }else{
            request.setAttribute("message","unable to process request at this moment :(");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
	}

}

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
public class CollectItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ArrayList<Item> items = Item.collectAllItem();
			ArrayList<Category> categories = Category.collectAllCategories();
			if(items!=null){
			
				request.setAttribute("items",items);
				request.setAttribute("categories",categories);
				request.getRequestDispatcher("show_items.jsp").forward(request,response);
			}else{
				request.setAttribute("message","sorry unable to process request at this moment! :(");
				request.getRequestDispatcher("success.jsp").forward(request,response);
			}
			
		
	}

}

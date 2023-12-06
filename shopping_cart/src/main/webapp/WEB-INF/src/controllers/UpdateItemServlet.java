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
public class UpdateItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Integer price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String name=request.getParameter("name");
        Integer id = Integer.parseInt(request.getParameter("id"));

        Boolean flag = Item.updateItem(id,price,description,name);
        
        if(flag){
            request.setAttribute("message"," items updated successfully:)");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            request.setAttribute("message","sorry unable to update items at this moment! :(");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }

        System.out.println(price+"%%%%%%%%%%");
	}

}

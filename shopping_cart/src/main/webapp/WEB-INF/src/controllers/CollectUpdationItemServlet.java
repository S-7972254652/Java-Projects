package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.*;

import models.*;

/**
 * Servlet implementation class CollectCategoryServlet
 */
@WebServlet("/CollectCategoryServlet")
public class CollectUpdationItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer itemId = Integer.parseInt(request.getParameter("id"));
        Item item = Item.collectSuchItem(itemId);

        if(item!=null){
            request.setAttribute("item",item);
            request.getRequestDispatcher("update_item.jsp").forward(request,response);
        }else{
            System.out.println("error is generated in CollectUpdationItemServlet");
        }
       
	}

}

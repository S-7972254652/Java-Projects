

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
    request.getRequestDispatcher("index.html").include(request, response);  
          
        String name=request.getParameter("Email");  
        String password=request.getParameter("Password");  
          
        if(password.equals("admin123")){  
            out.print("You are successfully logged in!");  
            out.print("<br>Welcome,"+name);  
              
            Cookie ck=new Cookie("name",name);  
            response.addCookie(ck);  
            
        }else{  
            out.print("sorry, username or password error!");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }  
          
        out.close();  
	}

}

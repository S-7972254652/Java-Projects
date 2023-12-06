import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{
	public void init(FilterConfig arg0) throws ServletException {}  
	
	public void doFilter(ServletRequest req, ServletResponse resp,  
	        FilterChain chain) throws IOException, ServletException {
		PrintWriter out=resp.getWriter();	
		String password=req.getParameter("password");
		if(password.equals("admin")) {
			chain.doFilter(req, resp);
		}
		else {
			out.print("username or password error!");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");  
		    rd.include(req, resp); 
		}
	}
		
	public void destroy() {}  
	  
	

}

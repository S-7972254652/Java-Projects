package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.Iterator;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;

import models.*;

public class UserProfileServlet extends HttpServlet{
	String uploadRealPath,updated;
	File file;
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session = request.getSession(); 
        User user = (User)session.getAttribute("user");
        Integer userId = user.getUserId();
        String userName = user.getUserName();

		//System.out.println("enter into servet 1;");

		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);

            
			try{
				List<FileItem> fileItem = sfu.parseRequest(request);
				Iterator<FileItem> itr = fileItem.iterator();

				while(itr.hasNext()){
					FileItem fi = itr.next();
					String fileName = fi.getName();
					uploadRealPath = getServletContext().getRealPath("/data/user");

					file = new File(uploadRealPath,fileName);
					updated = uploadRealPath+"\\"+fileName;
					fi.write(file);

					System.out.println("enter into method 4;");
					Boolean flag = new User().updateProfile(userId,updated);//this method will change the image path in database 

				}
			}catch(FileUploadException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}


			}
	}
}	

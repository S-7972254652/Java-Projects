package snippet;

public class Snippet {
	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Your JSP Page</title>
	    <!-- Bootstrap 5 CDN -->
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	    <!-- Bootstrap 5 CDN -->
	</head>
	<body>
	
	<!-- Your existing navbar code -->
	<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e6f7ff">
	  <!-- ... Your existing navbar code ... -->
	</nav>
	
	<%
	String driverName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String dbName = "login";
	String userId = "root";
	String password = "";
	
	try {
	    Class.forName(driverName);
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	try {
	    connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
	    statement = connection.createStatement();
	    String sql = "SELECT * FROM log";
	    resultSet = statement.executeQuery(sql);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	%>
	
	<table class="table table-hover" style="margin-top: 20px" align="center" cellpadding="5" cellspacing="5" border="1">
	    <tr class="bg-danger text-white">
	        <td><b>id</b></td>
	        <td><b>First Name:</b></td>
	        <td><b>Last Name</b></td>
	        <td><b>Email</b></td>
	        <td><b>Password</b></td>
	        <td><b>Edit</b></td>
	    </tr>
	    <%
	    while (resultSet.next()) {
	        String id = resultSet.getString("id");
	        String fname = resultSet.getString("fname");
	        String lname = resultSet.getString("lname");
	        String email = resultSet.getString("email");
	        String password = resultSet.getString("password");
	    %>
	    
	    <tr>
	        <td><%=id%></td>
	        <td><%=fname%></td>
	        <td><%=lname%></td>
	        <td><%=email%></td>
	        <td><%=password%></td>
	        <td>
	            <form action="<%=request.getRequestURI()%>" method="post">
	                <input type="hidden" name="editId" value="<%=id%>">
	                <button type="submit" name="edit">Edit</button>
	            </form>
	        </td>
	    </tr>
	    
	    <%
	    }
	    %>
	</table>
	
	<%
	String editId = request.getParameter("editId");
	
	if (editId != null) {
	    String updateSql = "UPDATE log SET fname=?, lname=?, email=?, password=? WHERE id=?";
	    PreparedStatement updateStatement = connection.prepareStatement(updateSql);
	    
	    String id = editId;
	    String fname = request.getParameter("fname");
	    String lname = request.getParameter("lname");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	
	    updateStatement.setString(1, fname);
	    updateStatement.setString(2, lname);
	    updateStatement.setString(3, email);
	    updateStatement.setString(4, password);
	    updateStatement.setString(5, id);
	    
	    updateStatement.executeUpdate();
	    
	    updateStatement.close();
	    
	    // Redirect to refresh the page after updating
	    response.sendRedirect(request.getRequestURI());
	}
	%>
	
	</body>
	</html>
	
}


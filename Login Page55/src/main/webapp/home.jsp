<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <!-- Bootstrap 5 CDN -->
</head>
<body>

<!-- ... Your navbar code ... -->
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e6f7ff">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
       </ul>
       <ul class="ms-auto d-flex">
        <li class="nav-item list-style-none mx-0 mx-lg-1" style="background-color: #0099e6
;border: 2px solid;border-radius: 20px;height: 60px;list-style-type:none">
        <a class="nav-link py-3 px-0 px-lg-3 text-white fw-bold rounded" href="#"><%=session.getAttribute("name") %></a></li>
        
        <%
        if(session.getAttribute("emailSession")==null)
        {
        	response.sendRedirect("index.jsp");
        }
        %>
        <li class="nav-item mx-0 mx-lg-1" style="list-style-type:none"><a style="color: black"
		class="nav-link py-3 px-0 px-lg-3  rounded text-decoration-none" href="Logout">Logout</a></li>
      </ul>
    </div>
  </div>
</nav>







<!-- Table Code -->
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
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
    </tr>
    <%
    while (resultSet.next()) {
    %>
    
    <!-- TABLE DATA START -->
    <tr bgcolor="#fff" data-bs-toggle="modal" data-bs-target="#exampleModal<%=resultSet.getString("id") %>">
        <td><%=resultSet.getString("id") %></td>
        <td><%=resultSet.getString("fname") %></td>
        <td><%=resultSet.getString("lname") %></td>
        <td><%=resultSet.getString("email") %></td>
        <td><%=resultSet.getString("password") %></td>
    </tr>
    <!-- TABLE DATA START -->
    <!-- Modal Start-->
    <div class="modal fade" id="exampleModal<%=resultSet.getString("id") %>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">ID : <%=resultSet.getString("id") %></h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>First Name: <%=resultSet.getString("fname") %></p>
                    <p>Last Name: <%=resultSet.getString("lname") %></p>
                    <p>Email: <%=resultSet.getString("email") %></p>
                    <p>Password: <%=resultSet.getString("password") %></p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary">Edit</button>
                    <button type="button" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Modal Ends -->
    <%
    }
    %>
</table>
<!-- Table Code Ended -->










































<script type = "text/javascript" >
function preventBack() { window.history.forward(); }
setTimeout("preventBack()", 0);
window.onunload = function () { null };
</script>
</body>
</html>
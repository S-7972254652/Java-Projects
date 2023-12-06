<%@include file="admin_dashboard_header.jsp"%>
<%@ page import="java.util.*"%>
<%@ page import="models.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
   
</head>
<body><br>
    <%
        ArrayList<User> data = (ArrayList)request.getAttribute("users");        
    %>
    <div  style="text-align: center;">
        <span style="background-color:rgb(216, 134, 51);color:white; padding:10px 60px;margin-bottom:20px;border-radius: 10px;"><b>Registered Users</b></span>
    </div>
    <div><br>
        <table class="table">
            <thead class="thead-light">
              <tr>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
                <th>contact</th>
                <th>Block/Remove</th>
              </tr>
            </thead>
            <tbody>
            <%for(User u:data){%>    
              <tr>
                <td><%=u.getUserId()%></td>
                <td><%=u.getUserName()%></td>
                <td><%=u.getEmail()%></td>
                <td><%=u.getContact()%></td>
                
                <td>
                    <a href="block_user.do?id=<%=u.getUserId()%>" class="btn btn-primary"><b>block</b></a>            
                    <a href="remove_user.do?id=<%=u.getUserId()%>" class="btn btn-danger"><b>remove</b></a>            
                </td>                
              </tr>
              <!-- later can add js for this purpose -->
              
        <%}%>
            </tbody>
          </table>
    </div>
</body>
</html>

<%@include file="footer.jsp"%>
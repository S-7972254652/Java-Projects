<%@include file="admin_dashboard_header.jsp"%>
<%@page import="models.*"%>

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
    <style>
        .heading{
            background-color: orange;
            color:white;
            font-size: 20px;            
            padding:5px;
        }

        .containers{
            text-align: center;
            border: 2px solid rgb(210, 214, 211);
            margin:auto;
            width:400px;  
            box-shadow: 3px 3px 23px rgb(156, 152, 152);          
        }
    </style>

</head>
<body>

    <%Admin admin = (Admin)session.getAttribute("admin");%>
    <br>
    <div class="containers">
        <div class="heading"><b>*Update Profile*</b></div><br>
        <form action="update_admin_credentials.do" method="POST">
            <div class="input-group mb-3" class="damp">
              <div class="input-group-prepend">
                <span class="input-group-text">name</span>
              </div>
              <input type="text" class="form-control" id="tmp" name="name" value="<%=admin.getName()%>">
            </div>

            <div class="input-group mb-3">
                <div class="input-group-prepend">
                  <span class="input-group-text">Email</span>
                </div>
                <input type="text" class="form-control" id="tmp" name="email" value="<%=admin.getEmail()%>">
              </div>

              <div class="input-group mb-3">
                <div class="input-group-prepend">
                  <span class="input-group-text">contact</span>
                </div>
                <input type="text" class="form-control" id="tmp" name="contact" value="<%=admin.getContact()%>">
              </div>

              <div class="input-group mb-3">
                <div class="input-group-prepend">
                  <span class="input-group-text">password</span>
                </div>
                <input type="text" class="form-control" id="tmp" name="password" value="<%=admin.getPassword()%>">
              </div>

            <input type="submit" class="btn btn-primary" value="save changes">
        </form>
    </div>

</body>
</html>

<%@include file="footer.jsp"%>
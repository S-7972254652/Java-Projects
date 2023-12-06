<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body{
background-color: #b3e6ff;
}
	.center{
	display: flex;
	justify-content: center;
	align-items: center;
}
	.login-card {
    background-color: #f8f8f8;
    border-radius: 10px;
    box-sizing: border-box;
    padding: 20px;
    height: 400px;
    max-width: 400px;
    box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.1);
}

.card-header {
  text-align: center;
  margin-bottom: 20px;
}

.card-header h1 {
  font-size: 2em;
  color: #333;
  text-shadow: 1px 1px #ddd;
}

.form-group {
  margin-bottom: 10px;
}

.form-group label {
  display: block;
  font-size: 1.2em;
  color: #555;
  margin-bottom: 10px;
}

input[type="text"],
input[type="email"],
input[type="password"] {
  box-sizing: border-box;
  padding: 10px;
  border-radius: 5px;
  border: none;
  background-color: #f0f0f0;
  font-size: 1.2em;
  color: #555;
  box-shadow: inset 0px 2px 5px rgba(0, 0, 0, 0.1);
  transition: box-shadow 0.3s ease;
}

input[type="text"]:focus,
input[type="email"]:focus,
input[type="password"]:focus {
  box-shadow: inset 0px 2px 5px rgba(0, 0, 0, 0.3);
  outline: none;
}

input[type="submit"] {
  background-color: #007bff;
  border: none;
  border-radius: 5px;
  color: #fff;
  cursor: pointer;
  font-size: 1.2em;
  padding: 10px;
  transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
  background-color: #0069d9;
}

.login-button {
  background-color: #007bff;
  border: none;
  border-radius: 5px;
  color: #fff;
  cursor: pointer;
  font-size: 1.2em;
  padding: 10px;
  width: 100%;
  transition: background-color 0.3s ease;
  transition: 0.25s;
}

.login-button:hover {
  background-color: #0069d9e7;
  -webkit-box-shadow: 0px 0px 30px 0px rgba(0,105,217,1);
  -moz-box-shadow: 0px 0px 30px 0px rgba(0,105,217,1);
  box-shadow: 0px 0px 30px 0px rgba(0,105,217,1);
}

</style>

</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">

<div class="center">
<form action="Login" method="post">	
<div class="login-card">
  <div class="card-header">
    <h1>Login</h1>
  </div>
  <div class="card-body">
    <form>
      <div class="form-group">
        <label for="username">Email</label>
        <input type="email" id="username" name="email" required="">
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required="">
      </div>
      <div class="form-group">
        <button type="submit" class="login-button">Login</button>
      </div>
      <a href="Registration.jsp">Register Here</a>
    </form>
  </div>
</div>
</form>
</div>


<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	
		<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">

<script type="text/javascript">
var status=document.getElementById("status").value;
if(status=="failed"){
	swal("Sorry","Wrong User Name or Password","error");
}

</script>
<script>
    history.forward();
</script>
</body>
</html>
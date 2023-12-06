<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<header>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">

        <div class="row">
            <div class="col-6">
                <div class="food-img">
                    <img src="images/login-half-block.jpg" alt="">
                </div>
            </div>
            <div class="col-6">
            <form action="Login" method="post">
                <div class="bg-1">
                    <div class="content">
                        <div class="logo">
                            <img src="images/logo (1).png" alt="">
                        </div>
                        <h6>Lorem ipsum dolor sit amet</h6>
                        <h3>Get more things, done with Loggin platform.</h3>
                        <p>Access to the most powerfull tool in the entire design and web industry.</p>
                        <input type="text" placeholder="Email Address" id="UserEmail" required="" name="email">
                        <input type="password" placeholder="Password" id="UserPassword" required="" name="pass">
                        <div class="buttons">
                            <button>login</button>
                            <a href="Register.jsp">Not Register Yet?</a>
                        </div>
                    </div>
                    <footer>
                        <ul>
                            <li><a href="#">Browse Food</a></li>
                            <li><a href="#">Download App</a></li>
                            <li><a href="#">About Us</a></li>
                        </ul>
                    </footer>
                </div>
                </form>
            </div>
        </div>
    </header>




		<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">

<script type="text/javascript">
var status=document.getElementById("status").value;
if(status=="failed"){
	swal("Sorry","Wrong User Name or Password","error");
}

</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Register.css">
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>">
    <header>
		<form action="Registered" method="post">
        <div class="row">
            <div class="col-6">
                <div class="left-bg">
                    <div class="left-bg-text">
                        <div class="logo">
                            <img src="images/logo (1).png" alt="">
                        </div>
                        <h6 class="sub-heading">Lorem ipsum dolor sit amet</h6>
                        <h3 class="mb-3 heading">Get more things, done with Registeration platform.</h3>
                        <p>Access to the most powerfull tool in the entire design and web industry.</p>
                        <div class="row">
                            <input type="text" placeholder="Full Name" name="name">
                            <input type="phone" placeholder="Phone Number" name="phone">
                        </div>
                        <input type="email" placeholder="Email Address" name="email">
                        <input type="password" placeholder="Password" name="pass">
                        <div class="btn">
                            <button type="submit">REGISTER</button>
                            <a id="an" href="index.html">Already registered! Login here?</a>
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
            </div>
            <div class="col-6">
                <div class="right">
                <img src="images/reg-half-block.jpg" alt="">
                </div>
            </div>
        </div>
        </form>
    </header>

  
  
  
  <!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
	
	<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
	
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
	<script>
		var status=document.getElementById("status").value;
		if(status=="success"){
			swal("Congrats","Account Generated Successfully","success");
		}
	</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
<link rel="stylesheet" href="register.css">
</head>
<body>
	<div class="back">
		<div data-aos="zoom-in-right" data-aos-duration="3000" class="one">
			<form action="register" method="post">

				<h4 class="py-3 fw-bolder text-white">Register</h4>
				<input type="text" placeholder="Enter Your Name.." name="name"><br>
				<input type="password" placeholder="Enter Your Password.." name="password"><br>
				<input type="email" placeholder="Enter Your Email.." name="email"><br>
				<input type="mobile" placeholder="Enter Your Mobile No.." name="mobile"><br>
				<button class="text-white" >
					Register
				</button>
				<br> <a class="text-decoration-none text-white"
					href="login.jsp">Login?</a>
			</form>
		</div>
	</div>


	<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
	<script>
		AOS.init();
	</script>
</body>
</html>
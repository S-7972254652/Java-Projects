<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Account</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"
	integrity="sha512-tS3S5qG0BlhnQROyJXvNjeEM4UpMXHrQfTGmbQ1gKmelCxlSEBUaxhRBj/EFTzpbP4RVSrpEikbmdJobCvhE3g=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css"
	integrity="sha512-sMXtMNL1zRzolHYKEujM2AqCLUR9F2C4/05cdbxjjLSRvMQIciEPCQZo++nk7go3BtSuK9kfa/s+a4f4i5pLkw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="Style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Fira+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Nova+Square&display=swap')
	;

@import
	url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Fira+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Nova+Square&display=swap')
	;

.form {
	display: flex;
	flex-direction: column;
	gap: 10px;
	max-width: 350px;
	background-color: #fff;
	padding: 20px;
	border-radius: 20px;
	position: relative;
}

.title {
	font-size: 28px;
	color: royalblue;
	font-weight: 600;
	letter-spacing: -1px;
	position: relative;
	display: flex;
	align-items: center;
	padding-left: 30px;
}

.title::before, .title::after {
	position: absolute;
	content: "";
	height: 16px;
	width: 16px;
	border-radius: 50%;
	left: 0px;
	background-color: orangered;
}

.title::before {
	background-color: orange;
	width: 18px;
	height: 18px;
}

.title::after {
	width: 18px;
	height: 18px;
	animation: pulse 2s linear infinite;
}

.message, .signin {
	color: rgba(88, 87, 87, 0.822);
	font-size: 14px;
}

.signin {
	text-align: center;
}

.signin a {
	color: royalblue;
}

.signin a:hover {
	text-decoration: underline royalblue;
}

.flex {
	display: flex;
	width: 100%;
	gap: 6px;
}

.form label {
	position: relative;
}

.form label .input {
	width: 100%;
	padding: 10px 10px 20px 10px;
	outline: 0;
	border: 1px solid rgba(105, 105, 105, 0.397);
	border-radius: 10px;
}

.form label .input+span {
	position: absolute;
	left: 10px;
	top: 15px;
	color: grey;
	font-size: 0.9em;
	cursor: text;
	transition: 0.3s ease;
}

.form label .input:placeholder-shown+span {
	top: 15px;
	font-size: 0.9em;
}

.form label .input:focus+span, .form label .input:valid+span {
	top: 30px;
	font-size: 0.7em;
	font-weight: 600;
}

.form label .input:valid+span {
	color: green;
}

.submit {
	border: none;
	outline: none;
	background-color: royalblue;
	padding: 10px;
	border-radius: 10px;
	color: #fff;
	font-size: 16px;
	transform: .3s ease;
}

.submit:hover {
	background-color: rgb(56, 90, 194);
}

@
keyframes pulse {from { transform:scale(0.9);
	opacity: 1;
}

to {
	transform: scale(1.8);
	opacity: 0;
}
}
</style>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
</head>
<body style="background-color: rgb(241, 235, 235);">
	<nav class="navbar navbar-expand-lg shadow-lg p-3 mb-5 bg-body rounded">
		<div class="container ">
			<a class="navbar-brand"
				style="font-weight: 700; font-size: 30px; color: orange;" href="#"
				id="logo">Foody</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item mx-5" style="font-weight: bolder;"><a
						class="nav-link active text-decoration-none text-dark"
						aria-current="page" href="search.jsp"><i
							class="bi bi-search me-2"></i>Search</a></li>
					<li class="nav-item  mx-5 " style="font-weight: bolder;"><a
						class="nav-link text-decoration-none text-dark" href="#"><i
							class="bi bi-percent me-2"></i>Offers</a></li>
					<li class="nav-item  mx-5 " style="font-weight: bolder;"><a
						class="nav-link text-decoration-none text-dark" href="help.jsp"><i
							class="bi bi-patch-question me-2"></i>Help</a></li>
					<li class="nav-item  mx-5 " style="font-weight: bolder;">

						<div class="pt-2" type="" data-bs-toggle="offcanvas"
							data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">
							<i class="bi bi-person-circle me-2"></i>Sign In
						</div>

						<div class="offcanvas offcanvas-end" tabindex="-1"
							id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
							<div class="offcanvas-header">
								<div class="d-flex flex-column">
									<h2 id="offcanvasRightLabel">Login</h2>
									<br>
									<p>
										or <a class="text-decoration-none" style="color: orange;"
											href="account.jsp">Create Account</a>
									</p>
								</div>
								<img src="images/ig.webp" width=100px height="100px" alt="">
								<button type="button" class="btn-close text-reset"
									data-bs-dismiss="offcanvas" aria-label="Close"></button>
							</div>
							<div class="offcanvas-body">
								<form action="">
									<input type="text" placeholder="Enter Your Name.."> <input
										type="email" name="" placeholder="Enter Your Email Id.."><br>
									<button>
										<a href="#">Login</a>
									</button>
									<p style="font-size: 10px; max-width: 297px;">By clicking
										on Login, I accept the Terms & Conditions & Privacy Policy</p>
								</form>
							</div>
						</div>
					</li>
					<li class="nav-item  mx-5 " style="font-weight: bolder;"><a
						class="nav-link text-decoration-none text-dark" href="#"><i
							class="bi bi-bag me-2"></i>Cart</a></li>
				</ul>
			</div>
		</div>
	</nav>


	<div class="d-flex justify-content-center">
		<form action="register" method="post" class="form"
			onsubmit="return validateForm()">
			<p class="title" style="color: orange;">Register</p>
		<c:if test="${not empty succMsg }">
		<p class="text-center text-success">${succMsg}</p>
		<c:remove var="succMsg" scope="session"/>
		</c:if>
		<c:if test="${not empty failedMsg }">
		<p class="text-center text-danger">${failedMsg}</p>
		<c:remove var="failedMsg" scope="session"/>
		</c:if>

			<p class="message">Signup now and get full access to our app.</p>
			<div class="flex">
				<label> <input name="fname" required="" placeholder=""
					type="text" class="input"> <span>Firstname</span>
				</label> <label> <input name="lname" required="" placeholder=""
					type="text" class="input"> <span>Lastname</span>
				</label>
			</div>

			<label> <input name="email" required="" placeholder=""
				type="email" class="input"> <span>Email</span>
			</label> <label> <input name="password" required="" id="password"
				placeholder="" type="password" class="input"> <span>Password</span>
			</label> <label> <input name="cpassword" required="" id="cpassword"
				placeholder="" type="password" class="input"> <span>Confirm
					password</span>
			</label>
			<p id="passwordError" class="error" style="color: red;"></p>
			<div class="d-flex"
				style="color: rgb(88 87 87/ 82%); font-size: 14px">
				<input class="me-2" name="check" type="checkbox">Agree Terms
				& Conditions
			</div>

			<button class="submit" style="background-color: orange;">Submit</button>
			<p class="signin">
				Already have an acount ? <a style="color: orange;" href="index.jsp">Login</a>
			</p>
		</form>
	</div>













	<script>
		function validateForm() {
			var password = document.getElementById("password").value;
			var cpassword = document.getElementById("cpassword").value;
			var errorElement = document.getElementById("passwordError");

			if (password !== cpassword) {
				errorElement.textContent = "Password and Confirm Password must be the same.";
				return false;
			} else {
				errorElement.textContent = ""; // Clear the error message if the passwords match.
			}

			return true;
		}
	</script>
</body>
</html>
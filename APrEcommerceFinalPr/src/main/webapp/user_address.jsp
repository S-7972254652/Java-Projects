<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Address</title>
<link rel="icon" href="images/Runstore.png">
<link rel="stylesheet" href="style.css">
<!-- Bootstrap CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<!-- Bootstrap CDN -->

<!-- IonIcons CDN -->
<script type="module"
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.0/font/bootstrap-icons.css">
<!-- IonIcons CDN -->
<style type="text/css">
	.icon i:hover{
	color: goldenrod;
	}
        ul{
            list-style-type: none;
        }
        ul li{
            padding: 5px;
        }
        ul li a{
            text-decoration: none;
            text-transform: uppercase;
            color: black    ;
        }
.card {
	transition: all 0.5s;
}

.card:hover {
	box-shadow: rgba(100, 100, 111, 0.2) 0px 7px 29px 0px !important;
}

#toast {
	min-width: 300px;
	position: fixed;
	bottom: 30px;
	left: 50%;
	margin-left: -125px;
	background: #333;
	padding: 10px;
	color: white;
	text-align: center;
	z-index: 1;
	font-size: 18px;
	visibility: hidden;
	box-shadow: 0px 0px 100px #000;
}

#toast.display {
	visibility: visible;
	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;
}

@keyframes fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@keyframes fadeOut {form { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg shadow  bg-body rounded"
		style="color: #fff;">
		<div class="container-fluid" id="main-logo">
			<a class="navbar-brand" href="index.jsp"><img src="images/rg.png"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">MEN</a></li>
					<li class="nav-item"><a class="nav-link" href="#">WOMEN</a></li>
					<li class="nav-item"><a class="nav-link" href="#">KIDS</a></li>
					<li class="nav-item"><a class="nav-link" href="#">HOME
							LIVING </a></li>
					<li class="nav-item"><a class="nav-link" href="#">STUDIO</a></li>
				</ul>
				<!-- !Search Bar -->
				<div class="main">
					<!-- !Another variation with a button -->
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Search for product,brand and more..">
						<div class="input-group-append">
							<button class="btn btn-secondary btn-outline-none" type="button">
								<i class="fa fa-search"></i>
							</button>
						</div>
					</div>
				</div>

				<!-- !Search Bar -->
				<div class="one pe-4">
					<img src="images/profile.png" class="btn" type="button"
						data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight"
						aria-controls="offcanvasRight" style="width: 40px; height: 40px;"
						alt="">
					<p style="color: black;">Profile</p>
				</div>
				<div class="one pe-5">
					<a href="checkout.jsp"><img src="images/wishlist.png"
						style="width: 40px; height: 40px;" alt=""></a>
					<p style="color: black;">Cart</p>


					<div class="offcanvas offcanvas-start" style="width: 300px;"
						tabindex="-1" id="offcanvasRight"
						aria-labelledby="offcanvasRightLabel">
						<div class="offcanvas-header">
							<h5 id="offcanvasRightLabel">Offcanvas right</h5>
							<button type="button" class="btn-close text-reset"
								data-bs-dismiss="offcanvas" aria-label="Close"></button>
						</div>
						<div class="offcanvas-body">
							<div
								class="d-flex justify-content-center align-items-center flex-column">
								<img src="images/profile.png" alt=""><br>
								<%@ page import="com.entity.User"%>
								<%
								User user = (User) session.getAttribute("userobj");
								if (user != null) {
								%>
								<h5 class="text-center pt-4 text-danger">
									Welcome,
									<%=user.getName()%></h5>
								<%
								} else {
								// Handle the case where the user object is not found in the session.
								}
								%>
							</div>
							<div class="d-flex justify-content-center flex-column ms-5">
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="#"><img
										src="images/Order.png" style="width: 30px; height: 30px;"
										alt=""> Orders</a>
								</div>
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="#"><img
										src="images/wishlist.png" style="width: 30px; height: 30px;"
										alt=""> Cart</a>
								</div>
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="#"><img
										src="images/gift.jpg" style="width: 30px; height: 30px;"
										alt=""> Gift Cards</a>
								</div>
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="#"><img
										src="images/contact_us.png" style="width: 30px; height: 30px;"
										alt=""> Contact Us</a>
								</div>
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="setting.jsp"><img
										src="images/setting.png" style="width: 30px; height: 30px;"
										alt="">Setting</a>
								</div>
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="Logout"><img
										src="images/logout.png" style="width: 30px; height: 30px;"
										alt=""> Logout</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<button
					style="padding: 5px 35px; border: none; background-color: #ff2648; color: #fff; border-radius: 5px;">
					<a class="text-decoration-none text-white" href="login.jsp">
						Login</a>
				</button>
			</div>
		</div>
	</nav>



	<div class="container mt-5">
	<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d15000.05662539101!2d73.78308580000001!3d19.9659069!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1695700960570!5m2!1sen!2sin" width="100%" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
	</div>
<footer style="background-color: #fafbfc;margin-top: 150px">
        <div class="container-fluid row" style="padding-top: 50px">
            <div class="col-3">
               <ul>
                <a href="#" style="text-transform: uppercase;mar;text-decoration: none;font-weight: bolder;" class="fs-3">online shopping</a>
            <li><a href="#">Men</a></li>
            <li><a href="#">Women</a></li>
            <li><a href="#">Kids</a></li>
            <li><a href="#">Home & Living</a></li>
            <li><a href="#">Beauty</a></li>
            <li><a href="#">Gift Cards</a></li>
            <li><a href="#">Runstore Insider</a></li>
            </ul>
            </div>
            <div class="col-3">
                <ul>
                    <a href="#" style="text-transform: uppercase;text-decoration: none;font-weight: bolder;" class="fs-3">Customer Policies</a>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">FAQ</a></li>
                <li><a href="#">T & C</a></li>
                <li><a href="#">Terms Of Use</a></li>
                <li><a href="#">Track Orders</a></li>
                <li><a href="#">Shipping</a></li>
                <li><a href="#">Cancellation</a></li>
                <li><a href="#">Returns</a></li>
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Grievence Officer</a></li>
                </ul>
            </div>
            <div class="col-3">
                <ul>
                    <li class=""><a style="font-weight: bolder;" class="fs-3 text-primary" href="#">Keep In Touch</a></li>
                    <div class="d-flex icon">
                       <a href="#"><i class="bi bi-facebook p-2 fs-4 text-center" style="color: black;"></i></a> 
                        <a href="#"><i class="bi bi-twitter p-2 fs-4 text-center" style="color: black"></i></a>
                        <a href="#"></a><i class="bi bi-youtube p-2 fs-4 text-center" style="color: black"></i></a>
                        <a href="#"><i class="bi bi-instagram p-2 fs-4 text-center" style="color: black"></i></a>
                    </div>
                </ul>
            </div>
            <div class="col-3">
            	<div class="d-flex justify-content-center align-items-center">
            	<img alt="" src="images/100.png" style="width: 100px;height: 100px">
            	<p><span style="font-weight: bolder;"> 100% ORIGINAL guarantee</span> for all products at runstore.com</p>
            	</div>
            	<div class="d-flex justify-content-center align-items-center" style="text-align: left;">
            	<img alt="" src="images/14.png" style="width: 100px;height: 100px;">
            	<p>Return Within <span style="font-weight: bolder;"> 14 Days only</span> only in runstore.com</p>
            	</div>
            </div>
        </div>
        <hr>
        <div class="text-center p-2">
        <a class="text-decoration-none text-secondary fw-bold" style="margin-top: 10px" href="#">&copy; www.runstore.com.All Rights Reserved</a>
        </div>
                

    </footer>























</body>
</html>
<%@page import="com.entity.ProductDtls"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.ProductDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

</head>
<body style="background-color: #f0f1f2">
	<nav class="navbar navbar-expand-lg shadow  bg-body rounded"
		style="color: #fff;">
		<div class="container-fluid" id="main-logo">
			<a class="navbar-brand" href="#"><img src="images/rg.png"></a>
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
					<img src="images/wishlist.png" style="width: 40px; height: 40px;"
						alt="">
					<p style="color: black;">Wishlist</p>


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
										alt=""> Wishlist</a>
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
										class=" text-decoration-none pt-2" href="#"><img
										src="images/Edit.png" style="width: 30px; height: 30px;"
										alt=""> Edit Profile</a>
								</div>
								<div class="d-flex justify-content-start">
									<a style="color: black; font-weight: bold;"
										class=" text-decoration-none pt-2" href="#"><img
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

<%
int pid=Integer.parseInt(request.getParameter("pid"));
ProductDAOImpl dao=new ProductDAOImpl(DBConnect.getConn());
ProductDtls p=dao.getProductById(pid);



%>


	<div class="container">
		<div class="row p-5 mt-5">
			<div class="col-md-6 text-center bg-white border p-5">
				<img alt="" src="product/<%=p.getPhotoName() %>" style="height: 150px; width: 150px"><br>
				<h4>Product Name:<%=p.getProductname() %></h4>
				<h4>Category:<%=p.getProductCategory() %></h4>
			</div>
			<div class="col-md-6 text-center border bg-white p-5">
				<h2><%=p.getProductname() %></h2>

				<div class="text-center row" >
					<div class="col-md-4 text-danger text-center p-2">
						<img src="images/COD.png"
							style="width: 100px; height: 100px; margin-left: 20px; padding: 15px">
							<p class="text" style="font-weight: bolder;">Cash On Delivery</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<img src="images/Cancel.png"
							style="width: 100px; height: 100px; margin-left: 20px; padding: 15px">
							<p class="text" style="font-weight: bolder;">Retun Available</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<img src="images/FD.png"
							style="width: 100px; height: 100px; margin-left: 20px; padding: 15px">
							<p class="text" style="font-weight: bolder;">Free Shipping</p>
					</div>
					<div class="text-center p-3">
					<a href="" class="btn btn-sm p-2 btn-primary"><i class="bi bi-cart-plus-fill"></i>Add To Cart</a>
					<a href="" class="btn btn-sm p-2 btn-danger"><%=p.getPrice() %><i class="bi bi-currency-rupee"></i></a>
					<a href="index.jsp" class="btn btn-sm p-2 btn-danger"><i class="bi bi-house-fill p-2"></i>Back</a>
					</div>
				</div>
			</div>
		</div>
	</div>




































</body>
</html>
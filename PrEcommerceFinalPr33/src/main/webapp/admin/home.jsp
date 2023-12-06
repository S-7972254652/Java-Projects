<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"	 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Panel</title>
<link rel="icon" href="images/Runstore.png">
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

<link
	href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css"
	rel="stylesheet">
<!-- Bootstrap CDN -->

<!-- IonIcons CDN -->
<script type="module"
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="login.css">
<!-- IonIcons CDN -->
<style type="text/css">
body {
	font-family: 'Fira Sans', sans-serif;
	background-color: #fff;
}

.card {
	transition: all 0.9s;
}

.card:hover {
	box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px
		-12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px
		12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px !important;
}

a{
text-decoration: none;
}
</style>

</head>
<body>
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
							<div class="d-flex justify-content-center align-items-center flex-column" >
								<img src="images/profile.png" alt=""><br>
								<%@ page import="com.entity.User" %>
							<%
User user = (User) session.getAttribute("userobj");
if (user != null) {
%>
<h5 class="text-center pt-4 text-danger">Welcome, <%= user.getName() %></h5>
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
									<a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" data-bs-toggle="modal" data-bs-target="#staticBackdrop" href="../Logout"><img src="images/logout.png" style="width: 30px; height: 30px;" alt=""> Logout</a>
								</div>
								
								
								<!-- Logout Modal -->
<!-- Button trigger modal -->



								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</nav>

<!-- code For Security -->

<c:if test="${empty userobj }">
<c:redirect url="../login.jsp"/>
</c:if>

<!-- code For Security -->






	<div class="container mt-5">
		<div class="row p-5">
			<div class="col-md-3 ">
			<a href="add_product-c.jsp">
				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="images/add.jpg"
							style="width: 128px; height: 128px"> <br>
						<h4 class="mt-2">Add Products</h4>
					</div>
				</div>
				</a>
			</div>
			<div class="col-md-3">
			<a href="all_products.jsp">
				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="images/Products.png">
						<h4 class="mt-2">All Products</h4>

					</div>
				</div>
				</a>
			</div>
			<div class="col-md-3">
			<a href="order.jsp">
				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="images/Parcel.png">
						<h4 class="mt-2">Order</h4>

					</div>
				</div>
				</a>
			</div>
			<div class="col-md-3">
				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="images/logout.png"
							style="width: 128px; height: 128px">
						<h4 class="mt-2"><a data-bs-toggle="modal" data-bs-target="#staticBackdrop" >Logout</a></h4>

					</div>
				</div>
			</div>
		</div>
	</div>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="staticBackdropLabel"></h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      <div class="text-center">
       <h4 class="text-dark">Do You Want To Logout</h4>
       
       <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary"><a class="text-white" href="../Logout" >Logout</a></button>
      </div>
      </div>
      <div class="modal-footer">
        
      </div>
    </div>
  </div>
</div>								
								
								
								<!-- Logout Modal -->


</body>
</html>
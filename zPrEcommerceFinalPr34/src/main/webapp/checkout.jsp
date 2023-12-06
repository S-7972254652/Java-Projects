<%@page import="com.entity.Cart"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.CartDAOImpl"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart Page</title>
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
</head>
<body style="background-color: #f2f2f2">
	<nav class="navbar navbar-expand-lg shadow  bg-body rounded"
		style="color: #fff;">
		<div class="container-fluid" id="main-logo">
			<a class="navbar-brand" href="index.jsp"><img
				src="images/rg.png"></a>
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
										class=" text-decoration-none pt-2" href="Logout"><img
										src="images/logout.png" style="width: 30px; height: 30px;"
										alt=""> Logout</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</nav>


	<c:if test="${empty userobj }">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>


	<c:if test="${not empty succMsg }">
		<div class="alert alert-warning" role="alert">${succMsg }</div>
			<c:remove var="succMsg" scope="session"/>
	</c:if>

<c:if test="${not empty failedMsg }">
		<div class="alert alert-danger" role="alert">${failedMsg}</div>
			<c:remove var="failedMsg" scope="session"/>
	</c:if>

	<div class="container">
		<div class="row mt-5">
			<div class="col-md-6">
				<div class="card bg-white">
					<div class="card-body">
						<h3 class="text-center text-secondary">Your Cart Items</h3>
						<table class="table table-hover table-striped">
							<thead>
								<tr>
									<th scope="col">Product Name</th>
									<th scope="col">Price</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>

								<%
								User u = (User) session.getAttribute("userobj");
								CartDAOImpl dao = new CartDAOImpl(DBConnect.getConn());
								List<Cart> cart = dao.getProductByUser(u.getId());
								Double totalPrice = 0.00;
								for (Cart c : cart) {
									totalPrice = c.getTotalPrice();
								%>
								<tr>
									<td><%=c.getProductName()%></td>
									<td><%=c.getPrice()%></td>
									<td><a href="remove_product?pid=<%=c.getPid()%>"
										class="btn btn-sm btn-danger">Remove</a></td>
								</tr>
								<%
								}
								%>
								<tr>
									<td>Total Price</td>


									<td><%=totalPrice%></td>
								</tr>


							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Your Order Details</h3>
						<form action="order" method="post">
						
						<input type="hidden" value="${userobj.id}" name="id">
						
							<div class="form-row d-flex">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Name</label> <input type="text" name="username"
										class="form-control" value="${userobj.name}" required="required" >
								</div>
								<div class="form-group col-md-6 ms-2">
									<label for="inputPassword4">Email</label> <input type="email" name="email"
										class="form-control"  value="${userobj.email}" required="required">
								</div>
							</div>
							<div class="form-row d-flex">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Phone Number</label> <input name="mobile"
										type="number" class="form-control"  value="${userobj.mobile}" required="required">
								</div>
								<div class="form-group col-md-6 ms-2">
									<label for="inputPassword4">Address</label> <input type="text" name="address"
										class="form-control" id="inputPassword4" required="required">
								</div>
							</div>
							<div class="form-row d-flex">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Landmark</label> <input type="text" name="landmark"
										class="form-control" id="inputEmail4" required="required">
								</div>
								<div class="form-group col-md-6 ms-2">
									<label for="inputPassword4">City</label> <input type="text" name="city"
										class="form-control" id="inputPassword4" required="required">
								</div>
							</div>
						
							<div class="form-row d-flex">
								<div class="form-group col-md-6">
									<label for="inputEmail4">State</label> <input type="text" name="state"
										class="form-control" id="inputEmail4" required="required">
								</div>
								<div class="form-group col-md-6 ms-2">
									<label for="inputPassword4">Pincode</label> <input name="pincode"
										type="number" class="form-control" id="inputPassword4" required="required">
								</div>
							</div>

							<div class="form-group">
								<label>Payment Mode</label> <select class="form-control" name="payment" >
									<option value="noselect">--Select--</option>
									<option value="COD">--Cash On Delivery--</option>
								</select>
							</div>

							<div class="mt-2 text-center">
								<button class="btn btn-warning">Order Now</button>
								<button class="btn btn-success" ><a class="text-decoration-none text-white" href="index.jsp"> Continue Shopping</a></button>
							</div>

						</form>
					</div>
				</div>
			</div>
	</div>









































</body>
</html>
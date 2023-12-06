<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="ADD_Product.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="Home.css">
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
<style type="text/css">
.card:hover{
trnsition:all 0.8s;
box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
}
</style>
</head>
<body>
	<div class="d-flex align-item-center justify-content-start"
		style="background-color: #412236;">
		<div class="logo ms-5 p-3">
			<img src="../images/logo-1.webp" width=133px height="77px" alt="">
		</div>
		<div class="nav-items">
			<ul>
				<li><a href="../home.jsp">home</a></li>
				<li><a href="../about.jsp">about</a></li>
				<li><a href="../Programs.jsp">pages</a></li>
				<li><a href="">blog</a></li>
				<li><a href="../contact.jsp">contact</a></li>
				<li><a href="../product.jsp">Shop</a></li>
			</ul>
		</div>
	</div>
	<div class="container">
		<div class="d-flex justify-content-between align-items-center mt-5">
		<a href="ADD_Product.jsp" class="text-decoration-none" >
			<div class="col-3">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title text-center">
							<img alt="" src="../images/add.jpg" width="128px" height="128px">
						</h5>
						<h2 class="text-center card-subtitle mb-2 text-muted">
							Add Products
							</h2>
					</div>
				</div>
			</div>
			</a>
			<a href="View_Products.jsp" class="text-decoration-none">
			<div class="col-3">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title text-center">
							<img alt="" src="../images/Products.png" width="128px" height="128px">
						</h5>
						<h2 class="text-center card-subtitle mb-2 text-muted">
							All Products
							</h2>
					</div>
				</div>
			</div>
			</a>
			<a href="Order.jsp" class="text-decoration-none">
			<div class="col-3">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title text-center">
							<img alt="" src="../images/Parcel.png" width="128px" height="128px">
						</h5>
						<h2 class="text-center card-subtitle mb-2 text-muted">
							Order
							</h2>
					</div>
				</div>
			</div>
			</a>
			<div class="col-3">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title text-center">
							<img alt="" src="../images/logout.png" width="128px" height="128px">
						</h5>
						<h2 class="text-center card-subtitle mb-2 text-muted">
							Logout
							</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
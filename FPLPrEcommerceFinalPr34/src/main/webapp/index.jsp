<%@page import="com.entity.ProductDtls"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.ProductDAOImpl"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Runstore-Shopping</title>
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
.icon i:hover {
	color: goldenrod;
}

ul {
	list-style-type: none;
}

ul li {
	padding: 5px;
}

ul li a {
	text-decoration: none;
	text-transform: uppercase;
	color: black;
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

@
keyframes fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@
keyframes fadeOut {form { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}
</style>
</head>
<body style="">
	<c:if test="${not empty addCart}">
		<div id="toast">${addCart}</div>

		<script type="text/javascript">
		showToast();
		function showToast(content)
		{
		    $('#toast').addClass("display");
		    $('#toast').html(content);
		    setTimeout(()=>{
		        $("#toast").removeClass("display");
		    },2000)
		}	
</script>
	</c:if>
	<%
	User u = (User) session.getAttribute("userobj");
	%>
	<nav class="navbar navbar-expand-lg shadow mb-5  bg-body rounded"
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
						aria-current="page" href="Men.jsp">MEN</a></li>
					<li class="nav-item"><a class="nav-link" href="#">WOMEN</a></li>
					<li class="nav-item"><a class="nav-link" href="#">KIDS</a></li>
					<li class="nav-item"><a class="nav-link" href="#">HOME
							LIVING </a></li>
					<li class="nav-item"><a class="nav-link" href="#">STUDIO</a></li>
				</ul>
				<!-- !Search Bar -->
				<div class="main">
					<!-- !Another variation with a button -->
					<form action="search.jsp" class="" method="post">
						<div class="input-group">
							<input type="text" class="form-control" type="search" name="ch"
								placeholder="Search for product,brand and more..">
							<div class="input-group-append">
								<button class="btn btn-secondary btn-outline-none "
									style="padding: 10px" type="submit">
									<i class="fa fa-search"></i>
								</button>
							</div>
						</div>
					</form>
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
										class=" text-decoration-none pt-2" href="checkout.jsp"><img
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
										class=" text-decoration-none pt-2" href="helpline.jsp"><img
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
	<!-- !Carosuel Start -->
	<div id="carouselExampleFade" class="carousel slide carousel-fade"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="images/2 (1).jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/2 (2).jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/2 (3).jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/2 (4).jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/2 (5).jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/2 (6).jpg" class="d-block w-100" alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<!-- !Carosuel End -->







	<div class="container-fluid">
		<h3 class="text-center mt-4 mb-4">All Products</h3>
		<!-- SORT BY HIGH TO LOW AND VICE VERSA -->
		<div class="dropdown mb-5" style="">
			<button class="btn btn-danger text-white dropdown-toggle"
				type="button" id="sortDropdown" data-bs-toggle="dropdown"
				aria-expanded="false">Sort by Price</button>
			<ul class="dropdown-menu" aria-labelledby="sortDropdown">
				<li><a class="dropdown-item" href="?sort=asc">Price Low to
						High</a></li>
				<li><a class="dropdown-item" href="?sort=desc">Price High
						to Low</a></li>

			</ul>
		</div>



		<div class="row">
			<%@ page import="java.util.ArrayList"%>
			<!-- Filter Section (Left Side) -->
			<div class="col-md-2 mb-3">
				<div class="filter-p">
					<form action="" method="post" id="priceFilterForm">
						<!-- Add your filter options here -->
						<label class="mt-5 pt-3"><input type="checkbox"
							name="priceFilter" value="200"> Below 200 RS</label><br> <label><input
							type="checkbox" name="priceFilter" value="500"> Below 500
							RS</label><br> <label><input type="checkbox"
							name="priceFilter" value="1000"> Below 1000 RS</label><br> <label><input
							type="checkbox" name="priceFilter" value="5000"> Below
							5000 RS</label><br> <label><input type="checkbox"
							name="priceFilter" value="10000"> Below 10000 RS</label><br>
						<input type="submit" class="btn btn-danger rounded mt-3 "
							value="Apply Filter"> <input type="button"
							class="btn btn-danger rounded mt-3 " value="Clear Filter"
							onclick="clearFilter()">
					</form>
				</div>
			</div>






			<div class="col-md-10">
				<div class="row">



					<%
					String sortParam = request.getParameter("sort");
					final String sortOrder = (sortParam != null && sortParam.equals("desc")) ? "DESC" : "ASC"; // Default sorting order (Low to High)

					String[] priceFilters = request.getParameterValues("priceFilter");

					ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
					List<ProductDtls> list = dao.getProduct();

					if (priceFilters != null && priceFilters.length > 0) {
						List<ProductDtls> filteredList = new ArrayList<>();
						for (ProductDtls p : list) {
							double price = Double.parseDouble(p.getPrice());
							for (String filter : priceFilters) {
						double filterValue = Double.parseDouble(filter);
						if (price < filterValue) {
							filteredList.add(p);
							break;
						}
							}
						}
						list = filteredList; // Use the filtered list
					}

					list.sort((p1, p2) -> {
						double price1 = Double.parseDouble(p1.getPrice());
						double price2 = Double.parseDouble(p2.getPrice());
						if (sortOrder.equals("ASC")) {
							return Double.compare(price1, price2); // Price Low to High
						} else {
							return Double.compare(price2, price1); // Price High to Low
						}
					});
					for (ProductDtls p : list) {
					%>








					<div class="col-md-3 mb-3">








						<div class="card crd-ho" style="height: 380px">
							<div class="card-body text-center">
								<!-- Display product information here -->
								<img src="product/<%=p.getPhotoName()%>" alt=""
									style="width: 100px; height: 150px;" class="img-thumbnil">
								<p>
									<span style="font-weight: bolder;">Product Name:</span><%=p.getProductname()%></p>
								<p>
									<span style="font-weight: bolder;">Category:</span><%=p.getProductCategory()%></p>
								<p>
									<span style="font-weight: bolder;">Available Quantities:</span><%=p.getQuantity()%></p>
								<%
								if (u == null) {
								%>
								<a href="login.jsp" class="btn btn-danger btn-sm ml-2">Add
									Cart</a>
								<%
								} else {
								%>
								<a href="cart?pid=<%=p.getProductId()%>&&uid=<%=u.getId()%>"
									class="btn btn-danger btn-sm ml-2">Add Cart</a>
								<%
								}
								%>
								<a href="view_product.jsp?pid=<%=p.getProductId()%>"
									class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1"><%=p.getPrice()%><i
									class="bi bi-currency-rupee"></i></a>
							</div>
						</div>
					</div>
					<%
					}
					%>
				</div>
			</div>










































			<footer style="background-color: #fafbfc; margin-top: 150px">
				<div class="container-fluid row" style="padding-top: 50px">
					<div class="col-3">
						<ul>
							<a href="#"
								style="text-transform: uppercase; mar; text-decoration: none; font-weight: bolder;"
								class="fs-3">online shopping</a>
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
							<a href="#"
								style="text-transform: uppercase; text-decoration: none; font-weight: bolder;"
								class="fs-3">Customer Policies</a>
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
							<li class=""><a style="font-weight: bolder;"
								class="fs-3 text-primary" href="#">Keep In Touch</a></li>
							<div class="d-flex icon">
								<a href="#"><i class="bi bi-facebook p-2 fs-4 text-center"
									style="color: black;"></i></a> <a href="#"><i
									class="bi bi-twitter p-2 fs-4 text-center" style="color: black"></i></a>
								<a href="#"></a><i class="bi bi-youtube p-2 fs-4 text-center"
									style="color: black"></i></a> <a href="#"><i
									class="bi bi-instagram p-2 fs-4 text-center"
									style="color: black"></i></a>
							</div>
						</ul>
					</div>
					<div class="col-3">
						<div class="d-flex justify-content-center align-items-center">
							<img alt="" src="images/100.png"
								style="width: 100px; height: 100px">
							<p>
								<span style="font-weight: bolder;"> 100% ORIGINAL
									guarantee</span> for all products at runstore.com
							</p>
						</div>
						<div class="d-flex justify-content-center align-items-center"
							style="text-align: left;">
							<img alt="" src="images/14.png"
								style="width: 100px; height: 100px;">
							<p>
								Return Within <span style="font-weight: bolder;"> 14 Days
									only</span> only in runstore.com
							</p>
						</div>
					</div>
				</div>
				<hr>
				<div class="text-center p-2">
					<a class="text-decoration-none text-secondary fw-bold"
						style="margin-top: 10px" href="#">&copy; www.runstore.com.All
						Rights Reserved</a>
				</div>
			</footer>













			<script>
function clearFilter() {
    var checkboxes = document.getElementsByName("priceFilter");
    for (var i = 0; i < checkboxes.length; i++) {
        checkboxes[i].checked = false;
    }
    // Submit the form to clear the filter and display all products
    document.getElementById("priceFilterForm").submit();
}
</script>
</body>
</html>

<!DOCTYPE html>
<%@page import="java.sql.Connection"%>
<%@page import="com.DB.DBConnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Order Food</title>
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
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Fira+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Nova+Square&display=swap')
	;

@import
	url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Fira+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Nova+Square&display=swap')
	;
</style>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

</head>

<body>



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
							<c:if test="${not empty failedMsg}">
								<h5 class="text-start text-danger">${failedMsg}</h5>
								<c:remove var="failedMsg" scope="session" />
							</c:if>
							<div class="offcanvas-body">
								<form action="Login" method="post">
									<input type="email" name="email"
										placeholder="Enter Your Email.."> <input
										style="width: 287px; height: 46px; border-radius: 6px; border: solid 1px gray; margin-bottom: 20px;"
										type="password" name="password"
										placeholder="Enter Your Password.."><br>
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




	<div class="container">
		<h4 style="font-weight: bolder;">Best Offers For You</h4>
		<div class="owl-carousel owl-theme">
			<div class="item">
				<img src="images/k.webp" width=425px height="252px" alt="">
			</div>
			<div class="item">
				<img src="images/bur.webp" width=425px height="252px" alt="">
			</div>
			<div class="item">
				<img src="images/chicken.webp" width=425px height="252px" alt="">
			</div>
			<div class="item">
				<img src="images/125.webp" width=425px height="252px" alt="">
			</div>
			<div class="item">
				<img src="images/30.webp" width=425px height="252px" alt="">
			</div>
			<div class="item">
				<img src="images/masala.webp" width=425px height="252px" alt="">
			</div>
			<!-- <div class="item">
            <img src="images/Biryani_2.png" alt="">
        </div> -->
		</div>
	</div>

	<div class="container d-flex mt-5">
		<div class="col-3">
			<h4 style="font-weight: bolder;">What's on your mind?</h4>
			<div class="owl-carousel-1 owl-theme">
				<div class="item">
					<img src="images/p.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/B.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/bger.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/sh.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/am.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/cb.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/NI.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/pb.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/pt.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/idl.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/R.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/ch.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/pc.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/ds.webp" width=144px height="180px" alt="">
				</div>
				<div class="item">
					<img src="images/ic.webp" width=144px height="180px" alt="">
				</div>
			</div>
		</div>
		<div class="col-8">
			<h2>Top Restaurant's In Nashik</h2>
			<div class="d-flex justify-content-between">
				<div class="col-4">
					<div class="card " style="width: 18rem; border: none;">
						<img src="images/HD.webp" width=273px height="182px"
							class="card-img-top" style="border-radius: 18px;" alt="...">
						<div class="card-body">
							<h5 class="card-title">Haldirams</h5>
							<p class="card-text">Sweet,Bakery,Dessart,Doodh</p>
						</div>
					</div>
				</div>
				<div class="col-4 ms-5">
					<div class="card " style="width: 18rem; border: none;">
						<img src="images/HD.webp" width=273px height="182px"
							class="card-img-top" style="border-radius: 18px;" alt="...">
						<div class="card-body">
							<h5 class="card-title">Haldirams</h5>
							<p class="card-text">Sweet,Bakery,Dessart,Doodh</p>
						</div>
					</div>
				</div>
				<div class="col-4 ms-5">
					<div class="card " style="width: 18rem; border: none;">
						<img src="images/HD.webp" width=273px height="182px"
							class="card-img-top" style="border-radius: 18px;" alt="...">
						<div class="card-body">
							<h5 class="card-title">Haldirams</h5>
							<p class="card-text">Sweet,Bakery,Dessart,Doodh</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"
		integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"
		integrity="sha512-bPs7Ae6pVvhOSiIcyUClR7/q2OAsRiovw4vAkX+zJbw3ShAeeqezq50RIIcIURq7Oa20rW2n2q+fyXBNcU9lrw=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script>
		$('.owl-carousel').owlCarousel({
			loop : true,
			margin : 10,
			// nav:true,
			dots : false,
			autoplay : true,
			autoplayTimeout : 1500,
			responsive : {
				0 : {
					items : 1
				},
				600 : {
					items : 2
				},
				1000 : {
					items : 3
				}
			}
		})
	</script>
</body>

</html>
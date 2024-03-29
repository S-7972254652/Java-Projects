<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="about.css">
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
</head>
<body>
	<div class="back">
		<div class="nav-1 d-flex justify-content-between align-items-center"
			id="one" style="background-color: #44233B; opacity: 0.8;">
			<a href="home.jsp"> <img src="images/logo-1.webp" width=133px
				height="77px"
				style="padding-left: 30px; padding-top: 10px; padding-bottom: 10px;"
				alt=""></a>
			<ul>
				<li><a href="home.jsp">Home</a></li>
				<li><a href="about.jsp">About</a></li>
				<li><a href="Programs.jsp">Pages</a></li>
				<li><a href="">Blog</a></li>
				<li><a href="contact.jsp">Contact</a></li>
			</ul>
		</div>

		<div
			class="d-flex justify-content-center flex-column align-items-center"
			style="margin-top: 100px;">
			<h1 class="text-white fw-bolder" style="font-size: 80px;">About</h1>
			<h6 style="color: #fff; font-size: 25px;">Home/about</h6>
		</div>
	</div>

	<div class="welcome-pr">
		<div class="container d-flex">
			<div class="col-6">
				<h6>WELCOME</h6>
				<h2>Practice Yoga At Our Vihara Ashram Community</h2>
				<p>We welcome newcomers to join us at any of our daily yoga
					classes and morning meditation on weekdays, or join one of our
					vibrant evening discussion groups.</p>
				<button>
					<a href="#">Read More</a>
				</button>
			</div>
			<div class="col-6" style="padding-top: 50px;">
				<div class="wb">
					<img src="images/welcomeh2.png" width=170px height="170px" alt="">
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row" style="background-color: #5d3151; padding: 20px;">
			<div class="col-3">
				<div class="one">
					<h1 style="padding-top: 389px; padding-left: 50px; color: #fff;">Hatha
						Yoga Session</h1>
				</div>
			</div>
			<div class="col-3">
				<div class="two">
					<h1 style="padding-top: 389px; padding-left: 50px; color: #fff;">Kundali
						Session</h1>
				</div>
			</div>
			<div class="col-3">
				<div class="three">
					<h1 style="padding-top: 389px; padding-left: 50px; color: #fff;">Mantra
						Yoga Session</h1>
				</div>
			</div>
			<div class="col-3">
				<div class="four">
					<h1
						style="padding-top: 389px; padding-left: 100px; color: #fff; font-weight: bolder;">Nidra
						Yoga Session</h1>
				</div>
			</div>
		</div>
	</div>
	<div class="" style="background-color: #FFEFE2;">
		<div class="container" style="margin-bottom: 150px;">
			<div class="scheduled">
				<div class="row mt-5">
					<div class="col-6">
						<img data-aos="fade-right" data-aos-duration="3000" class="my-5"
							src="images/t1.jpg" width=570px height="380px" alt=""> <img
							data-aos="fade-right" data-aos-duration="3000"
							src="images/t2.jpg" width=570px height="380px" alt="">
					</div>
					<div class="col-6 sc">
						<h6 id="h">SCHEDULE</h6>
						<h3>Our Daily Schedule</h3>
						<p style="max-width: 455px;">Temple is open every day from
							8.00 A.M. to 8.00 P.M. Except on Friday, where it is open from
							8:00 A. M. till 8:30 P.M. If it is necessary to perform</p>
						<p style="color: red; font-weight: bold; font-size: 20px;">
							7:00<br> <span style="color: black;">Morning Buddha
								Pooja followed by Chanting of Seth</span>
						</p>
						<p style="color: red; font-weight: bold; font-size: 20px;">
							7:30<br> <span style="color: black;">Breakfast for
								Monks</span>
						</p>
						<p style="color: red; font-weight: bold; font-size: 20px;">
							8:00<br> <span style="color: black;">Preferred
								appointment taking time</span>
						</p>
						<p style="color: red; font-weight: bold; font-size: 20px;">
							11:00<br> <span style="color: black;">Blessing
								service for devotees after lunch followed by<br> Dhamma
								talk
							</span>
						</p>
						<button id="btn1">
							<a href="#">Contact Us</a>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<footer>
		<ul>
			<li><a href="home.jsp">Home</a></li>
			<li><a href="about.jsp">About</a></li>
			<li><a href="Programs.jsp">Program</a></li>
		</ul>
		<img src="images/logo-1.webp" width=132px height="76px" alt="">
		<footer>
			<ul>
				<li><a href="">Features</a></li>
				<li><a href="">Blog</a></li>
				<li><a href="conntact.jsp">Contact</a></li>
			</ul>
		</footer>

		<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
		<script>
			AOS.init();
		</script>
</body>
</html>
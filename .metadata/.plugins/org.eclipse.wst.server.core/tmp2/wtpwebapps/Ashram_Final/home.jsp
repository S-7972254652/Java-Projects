<%@page import="com.DB.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
</head>
<body>


	<div class="d-flex align-item-center justify-content-start"
		style="background-color: #412236;">
		<div class="logo ms-5 p-3">
			<img src="images/logo-1.webp" width=133px height="77px" alt="">
		</div>
		<div class="nav-items d-flex">
			<ul>
				<li><a href="home.jsp">home</a></li>
				<li><a href="about.jsp">about</a></li>
				<li><a href="Programs.jsp">pages</a></li>
				<li><a href="">blog</a></li>
				<li><a href="contact.jsp">contact</a></li>
				<li><a href="product.jsp">Shop</a></li>
				<li class=""><a href="login.jsp"><i class="bi bi-person-circle"></i></a>
					<%@ page import="com.entity.User"%> <%
 User user = (User) session.getAttribute("userobj");
 if (user != null) {
 %>
					<span class="text-center ps-1 text-white fw-bold">

						<%=user.getName()%></span> <%
 } else {
 // Handle the case where the user object is not found in the session.
 }
 %></li>
			</ul>
		</div>
	</div>
	<div class="image-nav d-flex justify-content-center align-item-center">
		<div class="container">
			<img data-aos="zoom-in" data-aos-duration="3000"
				src="images/buddha-statue-culture-faith-heritage-meditation-PXC4V5Q.jpg"
				width=100% height="600px" alt="">
		</div>
	</div>
	<div class=""
		style="background-color: #FFF0E3; height: auto; padding-bottom: 50px;">
		<div
			class="container d-flex justify-content-between align-item-center"
			style="padding-top: 200px;">
			<div class="l-para">
				<p id="wel">WELCOME</p>
				<h3>Practice Mindfulness At Our Ashram</h3>
			</div>
			<div class="r-para">
				<h6>We welcome newcomers to join us at any of our daily yoga
					classes and morning meditation on weekdays, or join one of our
					vibrant evening discussion groups.</h6>
				<h6>Stay at the Ashram and immerse yourself in our spiritual
					yogic lifestyle program with other like minded seekers.</h6>
			</div>
		</div>

		<div
			class="container-1 mt-5 d-flex justify-content-between align-item-center">
			<div class="card text-center" style="width: 18rem;">
				<div class="text-center">
					<img src="images/ashram.webp" width=116px height="116px"
						class="m-5" alt="...">
				</div>
				<div class="card-body">
					<h5 class="card-title">Meditation</h5>
					<p class="card-text">Tall, lofty mountains, lush green valleys
						and a starlit sky are the silent keepers of this ashram</p>
				</div>
			</div>
			<div class="card text-center" style="width: 18rem;">
				<div class="text-center">
					<img src="images/involve.webp" width=116px height="116px"
						class="m-5" alt="...">
				</div>
				<div class="card-body">
					<h5 class="card-title">Yoga</h5>
					<p class="card-text">The ashram is involved in a number of
						social causes for the local villagers, most of whom remain below</p>
				</div>
			</div>
			<div class="card text-center" style="width: 18rem;">
				<div class="text-center">
					<img src="images/donation.webp" width=116px height="116px"
						class="m-5" alt="...">
				</div>
				<div class="card-body">
					<h5 class="card-title">Culture</h5>
					<p class="card-text">You can get involved by donating to any of
						our programs. We would like to thank you for your contribution.</p>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="program">
			<p>PROGRAMS</p>
			<h1>Free Programs For Every Level Of Experience</h1>
		</div>
		<div class="mt-5 d-flex justify-content-center align-item-center ig">
			<img class=""
				src="images/offerings-tibetan-water-bowls-in-lamayuru-gompa-CJSVBYP.jpg"
				alt="">
			<div class="content">
				<h3 style="" id="b">The Beginner's Program</h3>
				<p style="margin-left: 50px; max-width: 466px; margin-top: 20px;">Powerful
					breathing techniques and wisdom that will transform your life.
					Equip yourself with practical knowledge and techniques to unlock
					your true potential and bring fullness to your life.</p>

			</div>
		</div>
		<div class="mt-5 d-flex justify-content-center align-item-center">
			<img src="images/one.jpg" width=570px height="380px" alt="">
			<div class="content">
				<h3 style="margin-top: 110px; margin-left: 50px; max-width: 500px;"
					id="b">Becoming a Guru Program</h3>
				<p style="margin-left: 50px; max-width: 466px; margin-top: 20px;">Go
					beyond your usually active mind and experience an extraordinary
					sense of peace and renewed vitality through guided meditations and
					other processes.</p>

			</div>
		</div>
	</div>


	<div class="back" style="text-align: center;">
		<p>JOIN</p>
		<h2>Learn To Be Consciously Happy!</h2>
		<h6>Vihara Ashram is an ideal place for every person who is
			looking for personal development and rest from anxieties of modern
			life.</h6>
		<button>
			<a href="#">more about us</a>
		</button>
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
				<li><a href="conntact.jsp">Contactt</a></li>
			</ul>
		</footer>


		<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
		<script>
			AOS.init();
		</script>
</body>
</html>
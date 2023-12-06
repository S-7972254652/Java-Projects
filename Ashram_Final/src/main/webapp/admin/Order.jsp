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
</head>
<body>
	<div class="d-flex align-item-center justify-content-start"
		style="background-color: #412236;">
		<div class="logo ms-5 p-3">
			<img src="../images/logo-1.webp" width=133px height="77px" alt="">
		</div>
		<div class="nav-items">
			<ul>
				<li><a href="home.html">home</a></li>
				<li><a href="about.html">about</a></li>
				<li><a href="Programs.html">pages</a></li>
				<li><a href="">blog</a></li>
				<li><a href="contact.html">contact</a></li>
				<li><a href="product.html">Shop</a></li>
			</ul>
		</div>
	</div>

	<table class="table table-lg mt-5">
		<thead>
			<tr class="bg-danger text-white">
				<th scope="col">id</th>
				<th scope="col">Product Name</th>
				<th scope="col">Photo</th>
				<th scope="col">Price</th>
				<th scope="col">Quantity</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>Mark</td>
				<td><img src="../images/four.jpg" width="100px" height="100px"></td>
				<td>Otto</td>
				<td>@mdo</td>
				<td><div class="d-grid gap-2 d-sm-block">
						<button class="btn btn-danger" type="button">
							<i class="bi bi-pencil p-1"></i>Edit
						</button>
						<button class="btn btn-success" type="button">
							<i class="bi bi-trash-fill p-1"></i>Delete
						</button>
					</div></td>
			</tr>
			
			<tr>
				<th scope="row">3</th>
				<td>Mark</td>
				<td><img src="../images/four.jpg" width="100px" height="100px"></td>
				<td>100</td>
				<td>2</td>
				<td><div class="d-grid gap-2 d-sm-block">
						<button class="btn btn-danger" type="button">
							<i class="bi bi-pencil"></i>Edit
						</button>
						<button class="btn btn-success" type="button">
							<i class="bi bi-trash-fill"></i>Delete
						</button>
					</div></td>
			</tr>

		</tbody>
	</table>
</body>
</html>
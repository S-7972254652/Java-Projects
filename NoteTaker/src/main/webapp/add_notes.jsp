<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
<link href="css/style.css" rel="stylesheet">
<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</head>
<body>
	<%@include file="navbar.jsp"%>

	<h2 class="ms-5">Please Fill Note Details</h2>
	<br>


	<form action="SaveNoteServlet" method="post" class="ms-5 me-5">
		<div class="mb-3">
			<label for="title" class="form-label">Note Title</label> <input
				type="text" name="title" class="form-control" required="required"
				id="title" aria-describedby="emailHelp"
				placeholder="Enter the Title..">
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">Write a note</label>
			<textarea name="content" class="form-control" required="required"
				style="height: 300px" id="content" placeholder="Write Notes Here..."></textarea>
		</div>
		<div class="text-center">
			<button type="submit" class="btn-lg btn-outline-danger">ADD</button>
		</div>
	</form>



</body>
</html>
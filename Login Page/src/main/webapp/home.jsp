<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<!-- Bootstrap 5 CDN -->
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e6f7ff">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
       </ul>
       <ul class="ms-auto d-flex">
        <li class="nav-item list-style-none mx-0 mx-lg-1" style="background-color: #0099e6
;border: 2px solid;border-radius: 20px;height: 60px;list-style-type:none">
        <a class="nav-link py-3 px-0 px-lg-3 text-white fw-bold rounded" href="#"><%=session.getAttribute("name") %></a></li>
        <li class="nav-item mx-0 mx-lg-1" style="list-style-type:none"><a style="color: black"
		class="nav-link py-3 px-0 px-lg-3  rounded text-decoration-none" href="Logout">Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
<script>
    history.forward();
</script>
</body>
</html>
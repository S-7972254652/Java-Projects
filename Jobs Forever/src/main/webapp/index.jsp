<%
if(session.getAttribute("name")==null){
	response.sendRedirect("index.jsp");
}
%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
  <link rel="stylesheet" href="style.css">
  <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-transparent bg-transparent">
    <div class="container-fluid">
      <a class="navbar-brand" href="#"><img src="images/logo-g.png" style="width: 350px;"></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse d-flex justify-content-center align-items-between" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <div class="dropdown">
              <button class="dropbtn">Community</button>
              <div class="dropdown-content">
                <div class="d-flex justify-content-center align-items-center">
                  <p class="m-4">Your work people are here<br>
                    Connect anonymously with<br> professionals about work, pay, life<br> and more.</p>
                  <img src="images/job-search.png" style="width: 100px;height: 100px;" alt="">
                </div>
              </div>
            </div>
          </li>
          <li class="nav-item">
            <div class="dropdown">
              <button class="dropbtn">Jobs</button>
              <div class="dropdown-content">
                <div class="d-flex justify-content-center align-items-center">
                  <p class="m-4">Find the right job<br>
                    Millions of jobs. Search by what<br> matters to you and find the one<br> that's right for you.</p>
                  <img src="images/jobs.jpg" style="width: 100px;height: 100px;" alt="">
                </div>
              </div>
            </div>
          </li>
          <li class="nav-item">
            <div class="dropdown">
              <button class="dropbtn">companies</button>
              <div class="dropdown-content">
                <div class="d-flex justify-content-center align-items-center">
                  <p class="m-4">Read millions of reviews<br>
                    Read anonymous reviews on over<br> 600,000 companies worldwide<br> from the people that work there.
                  </p>
                  <img src="images/companies.png" style="width: 100px;height: 100px;" alt="">
                </div>
              </div>
            </div>
          </li>
          <li class="nav-item">
            <div class="dropdown">
              <button class="dropbtn">Saleries</button>
              <div class="dropdown-content">
                <div class="d-flex justify-content-center align-items-center">
                  <p class="m-4">Read millions of reviews<br>
                    Read anonymous reviews on over<br> 600,000 companies worldwide<br> from the people that work there.
                  </p>
                  <img src="images/salary.jpg" style="width: 100px;height: 100px;" alt="">
                </div>
              </div>
            </div>
          </li>
          <li class="nav-item">
            <div class="dropdown">
              <button class="dropbtn">For Employees</button>
              <div class="dropdown-content">
                <div class="d-flex justify-content-center align-items-center">
                  <p class="m-4">Read millions of reviews<br>
                    Read anonymous reviews on over<br> 600,000 companies worldwide<br> from the people that work there.
                  </p>
                  <img src="images/emp.png" style="width: 100px;height: 100px;" alt="">
                </div>
              </div>
            </div>
          </li>
        </ul>
        <button class="btn fw-bold btn-outline-success ms-5 outline-none" data-bs-toggle="modal" data-bs-target="#exampleModal">Sign In</button>
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog modal-dialog modal-dialog-centered">
            <div class="modal-content">
              <div class="modal-header">
				  <form action="register" method="post">
                <h5 class="modal-title" id="exampleModalLabel" style="color: #00a264;">New User</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                <label for="Name" >Name</label>
                <input type="text" name="Name">
                <label for="Name">Email</label>
                <input type="text" name="Email">
                <label for="Name">Password</label>
                <input type="password" name="Password">
                
              </div>
              
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" class="btn btn-success">Register</button>
              </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </nav>
  <hr>
  <!-- Main Content -->
  <div class="container-fluid main-img">
    <div class="row">
      <div class="col-md-4">
        <img src="images/emp.png" style="width: 100%; height: 500px;margin-left: -21px;" alt="">
      </div>
      <div class="col-md-4">
        <h1 class="text-capitalize fw-bold fs-1" style="color: #00a264;">Your work people are here</h1>
        <p class="text-center text-secondary" style="    margin-left: -30px;
        font-size: 11px;">Create an account or sign in. By continuing, you agree to our <a href="#"
            style="color: #00a264;">Terms of Use</a> and <a href="#" style="color: #00a264;">Privacy Policy</a>.</p>
        <label for="Name" id="name">Name :</label><br>
        <input type="text" placeholder="Enter Your Name..">
        <label for="Name" id="name">Email :</label><br>
        <input type="email" placeholder="Enter Your Email..">
        <div class="text-start mt-3 bt">
          <div class="d-flex justify-content-between align-items-center mt-5">
            <button >Log In</button>
            <a href="#" style="color: #00a264; font-weight: bolder;" data-bs-toggle="modal" data-bs-target="#exampleModal">New User?</a>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <img src="images/emp.png" style="width: 100%;height: 500px;" alt="">

      </div>
    </div>
    <div class="text-center">
      <h3 class="mt-5">Get ahead with Jobs Forever</h3>
      <p class="text-center">We're serving up trusted insights and anonymous conversation, so you'll have the goods you
        need to succeed.</p>
      <div class="row mt-5">
        <div class="col-3">
          <ion-icon name="chatbubbles-outline" class="fs-1"></ion-icon>
          <p>Join Your Community</p>
        </div>
        <div class="col-3">
          <ion-icon name="medkit-outline" class="fs-1"></ion-icon>
          <p>Find and Apply Jobs</p>
        </div>
        <div class="col-3">
          <ion-icon name="call-outline" class="fs-1"></ion-icon>
          <p> Direct Talk With HR
          </p>
        </div>
        <div class="col-3">
          <ion-icon name="cash-outline" class="fs-1"></ion-icon>
          <p>Direct Compaires salary</p>
        </div>
      </div>
    </div>
  </div>
  <!-- Main Content -->
  <hr>
<footer>
  <p class="text-center " style="background-color: #0000;padding: 10px ;color:gray;">Copyright &copy; 2023 Are Reserved By Jobs Forever</p>
</footer>






</body>

</html>

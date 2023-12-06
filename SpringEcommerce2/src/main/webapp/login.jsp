<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="icon" href="images/Runstore.png">
        <!-- Bootstrap CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <!-- Bootstrap CDN -->

    <!-- IonIcons CDN -->
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="login.css">
    <!-- IonIcons CDN -->   
</head>
<body>
    <nav class="navbar navbar-expand-lg shadow  bg-body rounded" style="color: #fff;">
        <div class="container-fluid" id="main-logo">
            <a class="navbar-brand" href="#"><img src="images/rg.png"></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">MEN</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">WOMEN</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">KIDS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">HOME LIVING </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">STUDIO</a>
                    </li>
                </ul>
                <!-- !Search Bar -->
                <div class="main">
                    <!-- !Another variation with a button -->
                    <div class="input-group">
                      <input type="text" class="form-control" placeholder="Search for product,brand and more..">
                      <div class="input-group-append">
                        <button class="btn btn-secondary btn-outline-none" type="button">
                          <i class="fa fa-search"></i>
                        </button>
                      </div>
                    </div>
                  </div>
               
                <!-- !Search Bar -->
                  <div class="one pe-4">
                    <img src="images/profile.png" class="btn" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight" style="width: 40px;height: 40px;" alt="">
                    <p style="color: black;">Profile</p>
                  </div>
                  <div class="one pe-5">
                    <img src="images/wishlist.png" style="width: 40px;height: 40px;" alt="">
                    <p style="color: black;">Wishlist</p>

                    <div class="offcanvas offcanvas-start" style="width: 300px;" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
                        <div class="offcanvas-header">
                          <h5 id="offcanvasRightLabel">Offcanvas right</h5>
                          <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                        </div>
                        <div class="offcanvas-body">
                            <div class="d-flex justify-content-center align-items-center">
                            <img src="images/profile.png" alt="">
                            <h6 class="text-dark ps-4">User Name</h6>
                            </div>
                           <div class="d-flex justify-content-center flex-column ms-5">
                            <div class="d-flex justify-content-start" ><a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" href="#"><img src="images/Order.png" style="width: 30px;height: 30px;" alt=""> Orders</a></div>
                            <div class="d-flex justify-content-start" > <a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" href="#"><img src="images/wishlist.png"  style="width: 30px;height: 30px;" alt=""> Wishlist</a></div>
                             <div class="d-flex justify-content-start" ><a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" href="#"><img src="images/gift.jpg"  style="width: 30px;height: 30px;" alt=""> Gift Cards</a></div>
                             <div class="d-flex justify-content-start" ><a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" href="#"><img src="images/contact_us.png"  style="width: 30px;height: 30px;" alt=""> Contact Us</a></div>
                             <div class="d-flex justify-content-start" ><a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" href="#"><img src="images/Edit.png"  style="width: 30px;height: 30px;" alt=""> Edit Profile</a></div>
                             <div class="d-flex justify-content-start" ><a style="color: black; font-weight: bold;" class=" text-decoration-none pt-2" href="#"><img src="images/logout.png"  style="width: 30px;height: 30px;" alt=""> Logout</a></div>
                           </div>
                        </div>
                    </div>
                  </div>
            </div>
        </div>
    </nav>

    <!-- !Login Form Start -->
<div class="login-center d-flex flex-column justify-content-center align-items-center">
<img src="images/POSTER.png" class="mt-5" width="500px" height="200px" alt="">
<form action="Login" class="bg-white" style="width: 500px;">
  <h5 class="text-center mt-3 mb-4">Login OR Signup</h5>
  <label for="name" class="ms-3">Name:</label>
  <input style="width: 300px;margin-left: 54px;margin-bottom: 20px;" name="fname" type="text" placeholder="Enter Your Name.." required="required"><br>
  <label for="name" class="ms-3">Password:</label>
  <input style="width: 300px;margin-left: 30px;" name="fname" type="password" placeholder="Enter Your Password.." required="required">
  <p style="font-size: 13px; text-align: center;margin-top: 20px;">By Continung, I agree with the <a href="#" style="color: #d1025e;font-weight: bolder;">Terms Of Use</a> & <a href="#" style="color: #d1025e;font-weight: bolder;">Privacy Policy</a></p>
  <div style="text-align: center;">
  <button style="border: none;background-color: #d1025e;width: 300px;text-align: center;padding: 10px;color: #fff;margin-bottom: 60px;margin-top: 20px;">Login</button>
  </div>
  <a href="Register.jsp">New User ?</a>
</form>
</div>
    <!-- !Login Form End -->
</body>
</html>
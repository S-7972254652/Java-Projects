<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="home.css">
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</head>
<body>
<header>
        <div class="hero-bg">
            <div class="container">
                <div class="nav">
                    <div class="logo">
                        <img src="images/logo (1).png" alt="">
                    </div>
                    <ul>
                        <li><a href="#browse">Browse Food</a></li>
                        <li><a href="#download">Download App</a></li>
                        <li><a href="#about">About Us</a></li>
                    
                    </ul>
                    <div class="icons">
                        <ion-icon name="bag-outline" style="color: #fff;font-size: 25px;padding-left: 15px;"></ion-icon>
                        <div class="dropdown">
                            <button class="dropbtn"> <ion-icon name="person-outline"
                                    style="color: #fff;font-size: 25px;padding-left: 15px;"></ion-icon>
                            </button>
                            <div class="dropdown-content">
                                <a href="index.html">Login</a>
                                <hr>
                                <a href="Register.html">Register</a>
                                <hr>
                                <a href="#">Account</a>
                                <hr>
                                <a href="index.html" onclick="myFunction()">Logout</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-2">
                        <div id="myDIV">
                            <img src="images/slider-ele1.png" alt="">
                        </div>
                    </div>
                    <div class="col-8">
                        <div class="text">
                            <p>Lorem ipsum dolor sit amet.</p>
                            <h1>Delicious food at your door step.</h1>
                            <h6>"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vitae egestas mi,
                                veldapibus diam. Mauris malesuada, nisl non rutrum commodo, sem magna."</h6>
                            <div class="input-group">
                                <div class="icon-l">
                                    <ion-icon name="location"></ion-icon>
                                </div>
                                <input type="text" placeholder="Your Address">
                                <button><a href="#">check food delivery</a></button>
                            </div>
                        </div>
                    </div>
                    <div class="col-2">
                        <div id="myDIV-1">
                            <img src="images/slider-ele5.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- !Image Gallery -->
    <div class="image-gallery" id="browse">
        <div class="container">
            <div class="image-text">
                <div class="image-text-1">
                    <h5>Basic info about online food.</h5>
                    <h4 class="heading">delicious food is our aim.</h4>
                </div>
                <div class="brush">
                    <ion-icon name="brush" id="br-1"></ion-icon>
                    <h2>1052+</h2>
                    <p>Online Orders</p>
                </div>
                <div class="brush">
                    <ion-icon name="pizza" id="br-1"></ion-icon>
                    <h2>1052+</h2>
                    <p>Online Orders</p>
                </div>
                <div class="brush">
                    <ion-icon name="cafe-outline" id="br-1"></ion-icon>
                    <h2>1052+</h2>
                    <p>Online Orders</p>
                </div>
            </div>
            <div class="row">
                <div class="col-4">
                    <div class="card">
                        <img src="images/item1.png" alt="">
                        <h6>25<br>mins</h6>
                        <div class="st">
                            <h3>Mega Restaurant</h3>
                            <div class="star">
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                            </div>
                        </div>
                        <p>Lorem ipsum dolor sit...</p>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card">
                        <img src="images/item2.png" alt="">
                        <h6>25<br>mins</h6>
                        <div class="st">
                            <h3>The Fast Food</h3>
                            <div class="star">
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                            </div>
                        </div>
                        <p>Lorem ipsum dolor sit...</p>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card">
                        <img src="images/item3.png" alt="">
                        <h6>25<br>mins</h6>
                        <div class="st">
                            <h3>Green Bakery</h3>
                            <div class="star">
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                            </div>
                        </div>
                        <p>Lorem ipsum dolor sit...</p>
                    </div>
                </div>
            </div>
            <div class="row" style="margin-top: 30px;">
                <div class="col-4">
                    <div class="card">
                        <img src="images/item4.png" alt="">
                        <h6>25<br>mins</h6>
                        <div class="st">
                            <h3>Eat Frio</h3>
                            <div class="star">
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                            </div>
                        </div>
                        <p>Lorem ipsum dolor sit...</p>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card">
                        <img src="images/item5.png" alt="">
                        <h6>25<br>mins</h6>
                        <div class="st">
                            <h3>Turkish Cousine</h3>
                            <div class="star">
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                            </div>
                        </div>
                        <p>Lorem ipsum dolor sit...</p>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card">
                        <img src="images/item6.png" alt="">
                        <h6>25<br>mins</h6>
                        <div class="st">
                            <h3>Pizzario</h3>
                            <div class="star">
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                                <ion-icon name="star"></ion-icon>
                            </div>
                        </div>
                        <p>Lorem ipsum dolor sit...</p>
                    </div>
                </div>
            </div>
            <div class="butt">
                <button><a href="#">browse more food option</a></button>
            </div>
            <div class="colrful-text" id="about">
                <div class="row">
                    <div class="col-6">
                        <h4 class="sub-heading">Basic info about food delivery.</h4>
                        <h4 class="heading">we are behind the delicious food delivery.</h4>
                    </div>
                    <div class="col-6">
                        <div class="para">
                            <p class="text1">
                                Curabitur mollis bibendum luctus. Duis suscipit vitae dui sed suscipit. Vestibulum
                                auctor nunc vitae diam eleifend, in maximus metus sollicitudin. Quisque vitae sodales
                                lectus. Nam porttitor justo sed mi finibus, vel tristique risus faucibus.
                            </p>
                            <p class="text2">
                                Curabitur mollis bibendum luctus. Duis suscipit vitae dui sed suscipit. Vestibulum
                                auctor nunc vitae diam eleifend, in maximus metus sollicitudin. Quisque vitae sodales
                                lectus.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="collapse">
                    <div class="row">
                        <div class="col-4">
                            <div class="b-101">
                                <div class="bulb1">
                                    <ion-icon name="bulb" id="blb"></ion-icon>
                                    <p>We have new ideas for your food business.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-4">
                            <div class="b-101">
                                <div class="bulb1">
                                    <ion-icon name="bicycle" id="blb"></ion-icon>
                                    <p>Join our amazing delivery staff.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-4">
                            <div class="b-101">
                                <div class="bulb1">
                                    <ion-icon name="heart" id="blb"></ion-icon>
                                    <p>We love our valued food customers.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="white-bg-img" id="download">
        <div class="container">
            <h6 class="sub-heading-1">Better experience on obile ordering.</h6>
            <h4 class="heading1">download our latest app from mobile stores.</h4>
            <div class="app" style="margin-top: 50px;">
                <img src="images/app1.png"width=200px height="200px" style="padding-right: 20px;" alt="">
                <img src="images/app2.png"width=200px height="200px" alt="">
            </div>
        </div>
    </div>
   
    <!-- !Image Gallery -->
    <footer>
        <div class="group-1">
            <ion-icon name="logo-facebook" style="padding: 10px;"></ion-icon>
            <ion-icon name="logo-twitter" style="padding: 10px;"></ion-icon>
            <ion-icon name="logo-google" style="padding: 10px;"></ion-icon>
            <ion-icon name="logo-linkedin" style="padding: 10px;"></ion-icon>
            <ion-icon name="logo-instagram" style="padding: 10px;"></ion-icon>
        </div>
        <div class="group-2">
            <p>© 2023 MegaOne. Made With Love By Themesindustry</p>
        </div>
    </footer>

</body>
</html>
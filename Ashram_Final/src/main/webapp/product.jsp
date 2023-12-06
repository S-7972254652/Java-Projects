<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product</title>
    <link rel="stylesheet" href="Product.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="Home.css">
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Fira+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Nova+Square&family=Roboto+Serif:ital,opsz,wght@0,8..144,100;0,8..144,200;0,8..144,300;0,8..144,400;0,8..144,500;1,8..144,100;1,8..144,200;1,8..144,300;1,8..144,400;1,8..144,500&display=swap');

        .card:hover {
            box-shadow: rgba(100, 100, 111, 0.2) 0px 7px 29px 0px;
        }
    </style>
</head>

<body>
    <div class="d-flex align-item-center justify-content-start" style="background-color: #412236;">
        <div class="logo ms-5 p-3">
            <img src="images/logo-1.webp" width=133px height="77px" alt="">
        </div>
        <div class="nav-items">
            <ul>
                <li><a href="home.jsp">home</a></li>
                <li><a href="about.jsp">about</a></li>
                <li><a href="Programs.jsp">pages</a></li>
                <li><a href="">blog</a></li>
                <li><a href="contact.jsp">contact</a></li>
                <li><a href="product.">Shop</a></li>
            </ul>
        </div>
    </div>
    <hr>
    <h2 class="text-center">All Products</h2>
    <hr>
    <div class="container-fluid">
        <div class="row">
            <div class="col-3">
                <div class="card" style="width: 18rem;">
                    <img src="images/i1.webp"  width=218px height="218px" class="card-img-top" alt="...">
                    <div class="card-body text-center">
                        <h4 class="card-title fs-5 text-secondary">Vilewadi Leham</h4>
                        <p class="card-text fs-6 text-secondary">For Stomach Ache and Food Poisoning.</p>
                        <p class=" text-secondary fw-bold"><span
                                style="font-weight: bold;font-size: 20px;color: black;">₹</span> 50</p>
                        <div class="d-grid gap-2">
                            <button class="btn  btn-outline-warning" type="button">Buy Now</button>
                            <button class="btn btn-warning" type="button">Add to cart</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-3">
                <div class="card" style="width: 18rem;">
                    <img src="images/i1.webp" width=218px height="218px" class="card-img-top" alt="...">
                    <div class="card-body text-center">
                        <h4 class="card-title fs-5 text-secondary">Vilewadi Leham</h4>
                        <p class="card-text fs-6 text-secondary">For Stomach Ache and Food Poisoning.</p>
                        <p class=" text-secondary fw-bold"><span
                                style="font-weight: bold;font-size: 20px;color: black;"><i class="bi bi-currency-rupee"></i></span> 50</p>
                        <div class="d-grid gap-2">
                            <button class="btn  btn-outline-warning" type="button">Buy Now</button>
                            <button class="btn btn-warning" type="button">Add to cart</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-3">
                <div class="card" style="width: 18rem;">
                    <img src="images/i1.webp"  width=218px height="218px" class="card-img-top" alt="...">
                    <div class="card-body text-center">
                        <h4 class="card-title fs-5 text-secondary">Vilewadi Leham</h4>
                        <p class="card-text fs-6 text-secondary">For Stomach Ache and Food Poisoning.</p>
                        <p class=" text-secondary fw-bold"><span
                                style="font-weight: bold;font-size: 20px;color: black;">₹</span> 50</p>
                        <div class="d-grid gap-2">
                            <button class="btn  btn-outline-warning" type="button">Buy Now</button>
                            <button class="btn btn-warning" type="button">Add to cart</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-3">
                <div class="card" style="width: 18rem;">
                    <img src="images/i1.webp"  width=218px height="218px" class="card-img-top" alt="...">
                    <div class="card-body text-center">
                        <h4 class="card-title fs-5 text-secondary">Vilewadi Leham</h4>
                        <p class="card-text fs-6 text-secondary">For Stomach Ache and Food Poisoning.</p>
                        <p class=" text-secondary fw-bold"><span
                                style="font-weight: bold;font-size: 20px;color: black;"><i class="bi bi-currency-rupee"></i></span> 50</p>
                        <div class="d-grid gap-2">
                            <button class="btn  btn-outline-warning" type="button">Buy Now</button>
                            <button class="btn btn-warning" type="button">Add to cart</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>

</html>
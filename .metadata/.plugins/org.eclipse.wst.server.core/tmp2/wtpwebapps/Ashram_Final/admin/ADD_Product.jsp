<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Products</title>
    <link rel="stylesheet" href="ADD_Product.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="Home.css">
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
</head>
<body>
    <div class="d-flex align-item-center justify-content-start" style="background-color: #412236;">
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
    <div class="d-flex justify-content-center align-items-center mt-5"  >
        <form action="/add_products" method="post" style="border: 2px solid; padding: 50px;" enctype="multipart/form-data">

            <h3 class="text-center">Add Product</h3>
            <label for="pname" class="fw-5 mt-4">Product Name:</label><br>
            <input type="text" name="name"><br>
            <label for="pname">Description</label><br>
            <input type="text" name="description"><br>
            <label for="pname">Price:</label><br>
            <input type="text" name="price"><br>
            <label for="pname">Quantity:</label><br>
            <input type="number" name="quantity"><br>
            <label for="photo" class="mt-3">Upload Photo</label><br>
            <input type="file" name="photo">
            <div class="d-grid gap-2 mt-4 d-md-block">
                <button class="btn" style="background-color: #C2185B;color: #fff" >ADD</button>
                <button class="btn" type="button">Cancel</button>
              </div>
        </form>
    </div>
</body>
</html>
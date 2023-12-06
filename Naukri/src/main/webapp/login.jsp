<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
    <link rel="stylesheet" type="text/css" href="login.css">
    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</head>
<body>
    <div class="container-1">
        <div class="container">
            <div class="row">
                <div class="logo-top">
                    <img src="css/images/naukri_Logo.png" width=181px height="31px" alt="">
                </div>
                <p style="padding-left: 800px;font-size:18px">New User? </p>
                <div class="link">
                    <div class="row">
                        <a href="index1.jsp">Register</a>
                        <p style="margin-left: 5px;font-size: 18px;margin-top: 0px;margin-left: 5px;">Here</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <div class="bg">
        <div class="container">
            <div class="boxes" style="padding-top: 50px;">
                <div class="col-4" style="background-color: #fff;height: auto;box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px; " >
                    <div class="box-1">
                        <p style="font-size: 20px;font-weight: bold;letter-spacing: 2px; padding: 10px;">New To Naukri?
                        </p>
                        <div class="con">
                            <div style="display: flex;justify-content: space-around;align-items: center;max-width: 300px;">
                                <ion-icon name="checkmark-outline" style="color: blue;"></ion-icon>
                                <p>One click apply using naukri profile.</p>
                            </div>
                            <div style="display: flex;justify-content: space-around;align-items: center;max-width: 300px;">
                                <ion-icon name="checkmark-outline" style="color: blue;"></ion-icon>
                                <p>Get relevant job recommendations.</p>
                            </div>
                            <div style="display: flex;justify-content: space-around;align-items: center;max-width: 400px;">
                                <ion-icon name="checkmark-outline" style="color: blue;"></ion-icon>
                                <p>Showcase profile to top companies and consultants.</p>
                            </div>
                            <div style="display: flex;justify-content: space-around;align-items: center;max-width: 320px;">
                                <ion-icon name="checkmark-outline" style="color: blue;"></ion-icon>
                                <p>Know application status on applied jobs.</p>
                            </div>
                        </div>
                        <button style="background-color: transparent;padding: 14px 34px;text-align: center;margin-left: 20px;border: 1px solid blue; margin-bottom: 20px;"><a style="text-decoration: none;font-weight: bolder;" href="index1.jsp">Register For Free</a></button>
                    </div>
                </div>
                <div class="col-4">
                    <div class="box-2" style="background-color: #fff;height: 400px;box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px; ">
                        <h2 style="font-weight: 400;padding: 20px;">Login</h2>
                        <form action="">
                        <label style="padding-left: 15px;color: #000;" for="email">Email ID / Username</label><br>
                            <input type="email" placeholder="Enter Email ID / Username" style="margin-left: 15px;margin-top: 10px;padding: 10px;width: 90%;margin-bottom: 15px;"><br>
                        <label style="padding-left: 15px;color: #000;" for="password">Password</label><br>
                            <input type="email" placeholder="Enter Password" style="margin-left: 15px;margin-top: 10px;padding: 10px;width: 90%;"><br>
                            <button style="margin-left: 15px;margin-top: 15px;padding: 10px 24px;width: 90%;background-color: blue;color: #fff;border: none;text-align: center;">Login</button>
                            <img src="css/images/register.png"width=150px height="100px" style="text-align: right;" alt="">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
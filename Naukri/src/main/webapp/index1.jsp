<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">

    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" /></head>
<body>
<div class="container-1">
        <div class="container">
            <div class="row">
                <div class="logo-top">
                    <img src="css/images/naukri_Logo.png" width=181px height="31px" alt="">
                </div>
                <p style="padding-left: 800px;font-size:18px">already register? </p>
                <div class="link">
                    <div class="row">
                        <a href="index.jsp">Login</a>
                        <p style="margin-left: 5px;font-size: 18px;margin-top: 0px;margin-left: 5px;">Here</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="divider-1"></div>
        <div class="container-1"></div>
        <div class="container">
            <div class="row">
                <div class="col-3">
                    <div class="border-top-margin">
                        <div class="border-big">
                            <div class="center-green">
                                <img src="css/images/green-boy.c8b59289.svg" width=125px height="109px" alt="">
                                <div class="bor-top">
                                    <div class="border">
                                        <h3 style="padding-top:40px">On registering, you can</h3>
                                        <div class="row">
                                            <div class="left">
                                                <div class="row">
                                                    <div class="icon">
                                                        <a href="#"><i class="fa-solid fa-circle-check"></i></a>
                                                    </div>
                                                    <p style="margin-top: -1px;margin-left: 5px;">Build your profile and
                                                        let<br> recruiters find you</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="left">
                                                <div class="row">
                                                    <div class="icon">
                                                        <a href="#"><i class="fa-solid fa-circle-check"></i></a>
                                                    </div>
                                                    <p style="margin-top: -1px;margin-left: 5px;">Get job postings
                                                        delivered<br>
                                                        right to your email</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="left">
                                                <div class="row">
                                                    <div class="icon">
                                                        <a href="#"><i class="fa-solid fa-circle-check"></i></a>
                                                    </div>
                                                    <p style="margin-top: -1px;margin-left: 5px;">Find a job and grow
                                                        your<br> career</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-6">
                   <form action="register" method="post" enctype="multipart/form-data">
                    <div class="border-white">
                        <h1 style="margin-left:100px">Find a job & grow your career</h1>
                        <div class="row">
                            <div class="col-8">
                                <div class="form-l">
                                    <div class="label">
                                        <label for="fname">Full Name</label><br>
                                    </div>
                                    <input type="text" placeholder="what is your name?" name="name" required="">
                                </div>
                                <div class="form-l">
                                    <div class="label">
                                        <label for="fname">Email id</label><br>
                                    </div>
                                    <input type="text" placeholder="Tell us your Email ID" name="email"  required="">
                                    <p style="font-size: 15px;margin-top:3px;color:gray;">We'll send you relevant jobs
                                        in your mail</p>
                                </div>
                                <div class="form-l">
                                    <div class="label">
                                        <label for="fname">Password</label><br>
                                    </div>
                                    <input type="password" placeholder="Create a password for your account" name="password"  required="">
                                    <p style="font-size: 15px;margin-top:3px;color:gray;">Minimum 6 characters required
                                    </p>
                                </div>
                                <div class="form-ll">
                                    <div class="form-l">
                                        <div class="label">
                                            <label for="fname">Mobile Number</label><br>
                                        </div>
                                        <div class="main-2">
                                            <div class="row">
                                                <div class="button-91" >+91</div>
                                                <input type="mobile" placeholder="Mobile No" name="mobile"  required="">
                                            </div>
                                        </div>
                                        <p style="font-size: 15px;margin-top:3px;color:gray;">Recruiters will call you
                                            on this number</p>
                                        <p style="color: gray;">Work Status</p>
                                        <div class="row">
                                            <div class="col-6">
                                                <div class="border-w">
                                                    <div class="row">
                                                        <div class="bag-top">
                                                            <img src="css/images/Screenshot 2022-11-30 175300 asa.png"
                                                                alt="">
                                                        </div>
                                                        <p style="padding-left: 5px;padding-top:9px;color:blue;" name="Ex">I'm
                                                            Experienced</p>
                                                    </div>
                                                    <p style="margin-top: -7px;padding-left: 35px;color: gray;" name="fresher">I have
                                                        work experience<br> (excluding
                                                        internships)</p>
                                                </div>
                                            </div>
                                            <div class="col-6">
                                                <div class="border-w">
                                                    <div class="row">
                                                        <div class="bag-top">
                                                            <img src="css/images/Screenshot 2022-11-30 180546bjh.png"
                                                                alt="">
                                                        </div>
                                                        <p style="padding-left: 5px;padding-top:9px;color:blue;">I'm
                                                            a fresher</p>
                                                    </div>
                                                    <p style="margin-top: -7px;padding-left: 35px;color: gray;">I am a
                                                        student/ Haven't<br> worked after graduation</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <p style="margin-left: 50px;margin-top:15px;color:gray;">Resume</p>
                                    <div class="pdf-margin">
                                        <div class="pdf-upload">
                                            <div class="row">
                                                <div class="button-upload">
                                                   <input type="file" name="file" required="">
                                                </div>
                                                <p style="margin-top: 10px;margin-left:55px;color:gray;">DOC,DOCx,PDF,RTF
                                                </p>
                                                <p style="margin-top: 10px;margin-left:75px;color:gray;">Max:2MB</p>
                                            </div>
                                            <p style="color:gray">Recruiters give first preference to candidates who
                                                have a resume</p>
                                            <div class="row">
                                                <input type="checkbox">
                                                <p style="padding-left: 5px;color:gray;">Send me important updates on
                                                </p>
                                                <div class="row">
                                                    <div class="whatsapp">
                                                        <a href="#"><i class="fa-brands fa-whatsapp"></i></a>
                                                    </div>
                                                    <p style="padding-left: 10px;padding-top: 5px;">Whatsapp</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                               
                            </div>
                            <div class="row">
                                <div class="t">
                                    <div class="row">
                                        <div class="circle-m">
                                            <div class="circle"><a href="#">OR</a></div>
                                        </div>
                                        <p style="font-size: 18px;padding-top:60px;color:gray;margin-left:0px;">Continue
                                            With</p>
                                        <div class="google-margin">
                                            <div class="google">
                                                <div class="row">
                                                    <div class="google-img">
                                                        <img src="css/images/google-icon.9273ac87.svg" width=22px
                                                            height="22px" alt="">
                                                    </div>
                                                    <div class="google-img-1">
                                                        <p><a href="#">Google</a></p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="last">
                        <p style="margin-top: 120px;margin-left:50px;font-size: 13px;">By clicking Register, you agree to the <a href="#">Terms and Conditions</a>  & <a href="#">Privacy Policy</a>  of Naukri.com</p>
                        <div class="button-last-margin">
                        <div class="button-last">
                          <input type="submit" value="register">  
                        </div>
                    </div>
                    </div>
                    </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
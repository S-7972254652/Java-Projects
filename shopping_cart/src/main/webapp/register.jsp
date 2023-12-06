<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    <style>
        #box{
            margin-left: auto;
            margin-right: auto;
            width:400px;
            text-align: center;
            border: 2px solid rgb(172, 166, 166);
            border-radius: 5px;
            padding: 20px;
            margin-top:40px
        }

        #disp{
            font-size: 25px;
            color:rgb(88, 85, 85)
        }

        #msg-box{
            text-align: center;
            color: red;
        }
    </style>

    
</head>
<body>
        

    <form action="register.do" method="post">
        
        <div id="box">
            
            <span id="disp">User-Registration</span><br><br>
        <!-- bootstrap form start-->
        <div class="input-group mb-3">
            <div class="input-group-prepend">
              <span class="input-group-text">name</span>
            </div>
            <input type="text" class="form-control" name="name" required>
          </div> 

        <div class="input-group mb-3">
            <div class="input-group-prepend">
              <span class="input-group-text">email</span>
            </div>
            <input type="email" class="form-control" name="email" required>
          </div> 

          <div class="input-group mb-3">
            <div class="input-group-prepend">
              <span class="input-group-text">contact</span>
            </div>
            <input type="contact" class="form-control" name="contact" required>
          </div> 

            <div class="input-group mb-3">
              <div class="input-group-prepend">
                <span class="input-group-text">password</span>
              </div>
              <input type="password" class="form-control" name="password" required>
            </div>
            <!-- bootstrap form end -->
            <input type="submit" class="btn btn-outline-primary">
            <a href="login.jsp" class="btn btn-outline-primary"> already a member</a></div>
          </form>
</body>
</html>
<%@include file="footer.jsp"%>
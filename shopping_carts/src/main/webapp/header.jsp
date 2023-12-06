<style>
    #header{
        text-align: right;    
        background-color: orange;
        color: white;
        font-size: 20px;
        border-bottom:2px solid rgb(179, 114, 16);
        
        
    }

    #login{
        text-align: right;
        padding-left:70%       
    }

    #login,#register,#admin,#home{
        cursor: pointer;
    }

    
</style>

<div class="navbar" id="header">
    <span><b style="color:black;">SHOPPING CART</b></span>
    
    <a id="login" onclick="document.location='login.jsp'">login </a>
    <a id="home" onclick="document.location='index.jsp'">Home </a>
    <a id="register" onclick="document.location='register.jsp'">register </a>
    <a id="admin" onclick="document.location='admin_login.jsp'">admin </a>
</div>

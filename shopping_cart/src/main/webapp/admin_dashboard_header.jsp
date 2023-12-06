<style>
    #header{
        text-align: right;    
        background-color: orange;
        color: white;
        font-size: 20px;
        border-bottom:2px solid black;
        overflow: hidden;        
        position: fixed;
        top: 0;
        width: 100%;
    }

    #home{
        text-align: right;
        padding-left:50%       
    }

    #login,#register,#admin,#home,#category{
        cursor: pointer;
    }

    #head{
        color:black;
    }

    
</style>

<div class="navbar" id="header">
    <span id="head"><b>SHOPPING CART</b></span>
    
    
    <a id="home" onclick="document.location='index.jsp'">home</a>
    <a id="category" onclick="document.location='categories.do'">categories</a>
    <a id="register" onclick="document.location='show_users.do'">users</a>
    <a id="admin" onclick="document.location='admin_profile.jsp'">profile</a>
    <a id="admin" onclick="document.location='collect_categories.do'">items</a>
    <a id="login" onclick="document.location='index.jsp'">logout </a>
</div><br><br><br><br>  


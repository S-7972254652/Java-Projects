<%@page import="models.*"%>    
<%@page import="java.util.*"%>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>



<style>
    #header{
        text-align: right;    
        background-color: orange;
        color: white;
        font-size: 20px;
        border-bottom:2px solid #c6cacc
        
    }

    #home{
        text-align: right;
        padding-left:30%       
    }

   a{
        cursor: pointer;
    }

    input{
        width:400px;        
        border-radius: 5px;
        font:12px;
    }

    table{
        border-collapse: collapse;
    }

    #logo{
        color:black;
    }

    
</style>

<div class="navbar" id="header">
    <span><b>SHOPPING CART</b></span>
    <% ArrayList<Category> cat = (ArrayList)application.getAttribute("categories");%>
    <table>
        <tr>
            <td>
                 <select id="cat">
                    <%for(Category c:cat){%>
                        <option value="<%=c.getCategoryId()%>"><%=c.getName()%></option>
                    <%}%>
                </select>
            </td>
            
            <td>
                <input type="text" id="search" class="input" placeholder="search your items here">
            </td>
        </tr>
    </table>
    

    <a id="home" onclick="document.location='index.jsp'">home</a>
    <a id="category" onclick="document.location='cart_items.do'">my cart</a>
    <a id="category" onclick="document.location='my_order.do'">my orders</a>
    <%-- <a id="category" onclick="document.location='failure.jsp'">my orders</a> --%>
    <a id="admin" onclick="document.location='user_profile.jsp'">profile</a>    
    <a id="logout" onclick="document.location='index.jsp'">logout </a>
</div>

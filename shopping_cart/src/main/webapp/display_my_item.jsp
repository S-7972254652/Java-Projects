<%@include file="user_dashboard_header.jsp"%>
<%@ page import="java.util.*"%>
<%@ page import="models.*"%>

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
       .heading{
            background-color: orange;
            color:white;
            font-size: 20px;            
            padding:5px;
        }

        .footing{
            background-color: #bab9b5;
            color:black;           
        }

        .containers{
            text-align: center;
            border: 2px solid rgb(210, 214, 211);
            margin:auto;
            width:900px;  
            /* height: 500px; */
            box-shadow: 3px 3px 23px rgb(156, 152, 152);                      
        }

        td{
            color: #9c9a95;
            text-align: center;
        }
    </style>
   
</head>
<body><br>
    <%
        Item item = (Item)request.getAttribute("item");
    %>
    

    <div class="containers">
        <div class="heading"><b>product :> <%=item.getItemName()%></b></div><br>
        <form action= method="">
            <table class="table">
                <td>    
                    <tr>
                        <td><b>item id</b></td>
                        <td><b>00129922<%=item.getItemId()%>1233</b></td>
                    </tr>

                    <tr>
                        <td><b>description</b></td>
                        <td><b><%=item.getDescription()%></b></td>
                    </tr>

                    <tr>
                        <td><b>price</b></td>
                        <td><b><%=item.getPrice()%> rupees only </b></td>
                    </tr>

                    <tr>
                        <td><b>day of delivery</b></td>
                        <td><b>6 to 10 days</b></td>
                    </tr>
                </td>
            </table>
            <a href="buy_item.do?item_id=<%=item.getItemId()%>" class="btn btn-primary"  style="width:100px;">buy now</a>
  
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="add_to_cart.do?id=<%=item.getItemId()%>" class="btn btn-primary">add to cart</a>
        </form>
        <div class=""><b><a href="#">&copy; 2020 all terms and conditions applied</a></b></div><br>
        
    </div>
    
</body>
</html>

<%@include file="footer.jsp"%>
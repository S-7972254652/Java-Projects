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
        <form action="confirmation.jsp">
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
                        <td><b>Total payble Amount</b></td>
                        <td><b><%=item.getPrice()%>&#8377;only </b></td>
                    </tr>

                    <tr>
                        <td><b>day of delivery</b></td>
                        <td><b>your item will deliver between 6 to 10 days.</b></td>
                    </tr>

                    <tr>
                        <td><b>payment option</b></td>
                        <td><select name="payment" id="pay">
                            <option value="1">cash on delivery</option>
                            <option value="2">UPI</option>
                            <option value="3">Net banking</option>
                            <option value="4">card</option>
                        </select></td>
                    </tr>
                    
                    <tr>
                        <td><b>quantity</b></td>
                        <td><b>
                            <input type="number" name="quantity" value="1" max="5" min="1">
                        </b></td>
                    </tr>

                    <tr>
                        <td><b>address</b></td>
                        <td><b>
                            <textarea name="address" id="" cols="50" rows="5"></textarea>
                        </b></td>
                    </tr>
                </td>
            </table>
            <input type="submit" value="place order" class="btn btn-primary"  style="width:100px;">&nbsp;            
        </form>
        <div class=""><b><a href="#">thanks a lot for using our service please visit again:)</a></b></div><br>
        
    </div>
    
</body>
</html>

<%@include file="footer.jsp"%>
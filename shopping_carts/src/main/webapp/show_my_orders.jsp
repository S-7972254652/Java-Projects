<%@include file="admin_dashboard_header.jsp"%>
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
       .id{
           width:30px;
       }
   </style>
</head>
<body><br>

    <%
        User user = (User)session.getAttribute("user");
        ArrayList<Order> data = (ArrayList)request.getAttribute("item");        
    %>
    <div  style="text-align: center;">
        <span style="background-color:rgb(216, 134, 51);color:white; padding:10px 60px;margin-bottom:20px;border-radius: 10px;"><b>Items on Sale</b></span>
    </div><br>

    <div>
        <table class="table">
            <thead class="thead-light">
                  <tr>
                <th>item id</th>
                <th>Item name</th>
                <th>price</th>
                <th>details</th>
                <th>ordered on</th>
                <th>cancel</th>
              </tr>              
            </thead>
            <tbody>
            <%for(Order u:data){%>    
            <%if(u.getItem()!=null){%>
              <tr>
                <td>1233456<%=u.getItem().getItemId()%>445</td>
                <td><%=u.getItem().getItemName()%></td>
                <td><%=u.getItem().getPrice()%>&#8377;</td>
                <td><%=u.getItem().getDescription()%></td>                
                <td><%=u.getOrderOn()%></td>                
                <td>
                    <a href="cancel_item.do?item_id=<%=u.getItem().getItemId()%>&user_id=<%=user.getUserId()%>"class="btn btn-danger">cancel order</a>
                    
                </td>                              
              </tr>
              
              <%}%>
            </form> 
              <!-- later can add js for this purpose -->              
        <%}%>
            </tbody>
          </table>
          
    </div>
</body>
</html>

my pending orders

<%@include file="footer.jsp"%>
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
       .id{
           width:30px;
       }
   </style>
</head>
<body><br>

    <%
        User user = (User)session.getAttribute("user");
        ArrayList<Item> data = (ArrayList)request.getAttribute("item");        
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
                <th>update</th>
              </tr>              
            </thead>
            <tbody>
            <%for(Item u:data){%>    
            <%if(u!=null){%>
              <tr>
                <td>1233456<%=u.getItemId()%>445</td>
                <td><%=u.getItemName()%></td>
                <td><%=u.getPrice()%>&#8377;</td>
                <td><%=u.getDescription()%></td>                
                <td>
                    <a href="buy_item.do?item_id=<%=u.getItemId()%>"class="btn btn-primary">buy now</a>
                    <a href="delete_item_from_cart.do?item_id=<%=u.getItemId()%>&user_id=<%=user.getUserId()%>" class="btn btn-danger">remove</a>                                    
                </td>                              
              </tr>
            </form> 
              <!-- later can add js for this purpose -->              
              <%}%>
        <%}%>
            </tbody>
          </table>
          <a href="buy_all_items.do?user_id=<%=user.getUserId()%>" class="btn btn-primary">buy all</a>
    </div>
</body>
</html>

<%@include file="footer.jsp"%>
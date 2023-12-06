<%@include file="admin_dashboard_header.jsp"%>
<%@ page import="java.util.*"%>
<%@ page import="models.*"%>

<%-- show items  --%>
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
  <%@include file="alert.jsp"%>

    <%
        ArrayList<Item> data = (ArrayList)request.getAttribute("items");        
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
                <th>addimage</th>
                <th>update/remove</th>
              </tr>              
            </thead>
            <tbody>
            <%for(Item u:data){%>    
            
                <form action="update_item.do?id=<%=u.getItemId()%>">
              <tr>
                <td><input type="text" name="id" value="<%=u.getItemId()%>" class="id" readonly></td>
                <td><input type="text" name="name" value="<%=u.getItemName()%>"></td>
                <td><input type="number" name="price" value="<%=u.getPrice()%>"></td>
                <td><input type="text" name="description" value="<%=u.getDescription()%>"></td>              

                <td>
              </form>  
              <div>
                  <form action="item_image.do?item_id=<%=u.getItemId()%>" method="post" enctype="multipart/form-data">
                    <input type="file" value="change profile" name="change" id="browse">
                    <input type="submit" value="upload" id="" class="btn btn-success" style="width:20%;">
                  </form>
              </div> 

              </td>

              <td>
                  <input type="submit" value="update" class="btn btn-primary">
                  <a href="delete_item.do?id=<%=u.getItemId()%>" class="btn btn-danger">remove</a>
              </td>                              
              
              </tr>
            
              <!-- later can add js for this purpose -->              
        <%}%>
            </tbody>
          </table>
    </div>
</body>
</html>

///////////////////add category .jsp
<%@include file="admin_dashboard_header.jsp"%>
<%@ page import="models.*"%>
<%@ page import="java.util.*"%>

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
        #heading{
            background-color: orange;
            color:white;
            font-size: 20px;            
            padding:5px;
        }

        #container{
            text-align: center;
            border: 2px solid rgb(210, 214, 211);
            margin:auto;
            width:600px;        
            box-shadow: 3px 3px 23px rgb(156, 152, 152);    
        }

        #id{
          width:20px;
        }
        
    </style>
</head>
<body>
    <%ArrayList<Category> cat = (ArrayList)request.getAttribute("categories"); %>
    <br>
    <div id="container">
        <div id="heading"><b>add new category</b></div><br>
        <form action="add_category.do">
            <div class="input-group mb-3">
              <div class="input-group-prepend">
                <span class="input-group-text">Category</span>
              </div>
              <input type="text" class="form-control" id="tmp" name="category">
            </div>
            <input type="submit" class="btn btn-primary">
        </form>
    </div>

    <br>
    <table class="table">
        <thead class="thead-light">
          <tr>
            <th>category id</th>
            <th>name</th>
            <th>edit/remove</th>           
          </tr>
          <%for(Category c:cat){%>
            <form action="update_categories.do">
              <tr>
                  <td><input type="text" value="<%=c.getCategoryId()%>" name="id" readonly id="id"></td>
                  <td><input type="text" value="<%=c.getName()%>" name="name"></td>
                  <td>
                    <input type="submit" value="update" class="btn btn-primary">
                    <a href="delete_category.do?id=<%=c.getCategoryId()%>" class="btn btn-danger">delete</a>  
                  </td>
              </tr>
            </form>
            <%}%>
        </thead>
        <tbody>     

          
        </tbody>
      </table>

</body>
</html>

<%@include file="footer.jsp"%>


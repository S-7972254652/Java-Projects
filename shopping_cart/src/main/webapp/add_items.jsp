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
        .heading{
            background-color: orange;
            color:white;
            font-size: 20px;            
            padding:5px;
        }

        .containers{
            text-align: center;
            border: 2px solid rgb(210, 214, 211);
            margin:auto;
            width:600px;            
            box-shadow: 3px 3px 23px rgb(156, 152, 152);
        }

        #items{
            width: 70%;
        }
        
        textarea{
            resize: none;
        }
    </style>
</head>
<body>
    <%ArrayList<Category> cat = (ArrayList)request.getAttribute("all_categories"); %>
    <br>

   
            <div class="containers">
                <div class="heading"><b>add new Item</b></div><br>
                <form action="add_item.do">
                    <span>
                        select Item Category:<select name="cat" id="items">
                            <%for(Category c:cat){%>
                                <option value="<%=c.getCategoryId()%>"><%=c.getName()%></option>
                            <%}%>    
                        </select><br><br>
                    </span>

                    <div class="input-group mb-3">
                      <div class="input-group-prepend">
                        <span class="input-group-text">item name</span>
                      </div>
                      <input type="text" class="form-control" id="tmp" name="item_name" required>
                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                          <span class="input-group-text">item price</span>
                        </div>
                        <input type="number" class="form-control" id="tmp" name="item_price" required>
                    </div>

                    <div class="input-group mb-3">
                        <div c  lass="input-group-prepend">
                          <span class="input-group-text">Description</span>
                        </div>
                        <textarea name="item_desc" id="" cols="60" rows="5" required></textarea>
                      </div>
                    <input type="submit" class="btn btn-primary" value="add">
                </form>
            </div><br>
            <div style="border: 1px solid rgb(214, 212, 208);"></div>
            <br>
            <div style="text-align: center;">
                <a href="collect_all_item.do" class="btn btn-primary">show all items</a>
            </div>
            <br>
            <div style="border: 1px solid rgb(214, 212, 208);"></div>
    

</body>
</html>

<%@include file="footer.jsp"%>
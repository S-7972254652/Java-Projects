<%@include file="footer.jsp"%>

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
  <%@include file="alert.jsp"%>

    <%
        ArrayList<Item> data = (ArrayList)request.getAttribute("items");  
        ArrayList<Category> cat = (ArrayList)request.getAttribute("categories");  

    %>
    <select id="cat">
      <%for(Category c:cat){%>
        <option value="<%=c.getCategoryId()%>"><%=c.getName()%></option>
      <%}%>
    </select>
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
                <th>update/remove</th>
                <%-- <th>addimage</th> --%>
              </tr>              
            </thead>
            <tbody  id="table">
            <%for(Item u:data){%>    
            
                
              <tr>
                <td>077ii21<%=u.getItemId()%></td>
                <td><%=u.getItemName()%></td>
                <td><%=u.getPrice()%></td>
                <td><%=u.getDescription()%></td>              
            
                <td>                  
                  <a href="update_item_by_id.do?id=<%=u.getItemId()%>" class="btn btn-primary">update</a>
                  <a href="delete_item.do?id=<%=u.getItemId()%>" class="btn btn-danger">remove</a>
                </td>                              
                
                <td>              
              <%-- <div>
                  <form action="item_image.do?item_id=<%=u.getItemId()%>" method="post" enctype="multipart/form-data">
                    <input type="file" value="change profile" name="change" id="browse">
                    <input type="submit" value="upload" id="" class="btn btn-success" style="width:20%;">
                  </form>
              </div>  --%>

              </td>
              </tr>
            
              <!-- later can add js for this purpose -->              
        <%}%>
            </tbody>
          </table>
    </div>
</body>

<script>
  let req = null;
  let sel = document.getElementById("cat");
  sel.onchange = check;

  function check(){
    collectAllSuchItems(this.value)
  }

  function collectAllSuchItems(id){
    req = new XMLHttpRequest();

    req.open('get','collect_such_items.do?cat_id='+id,true)
    req.onreadystatechange = displayResult;
    req.send();
  }

  function displayResult(){    
    if(req.status==200&&req.readyState==4){
      let arr = eval(req.responseText)
      
      document.getElementById("table").innerHTML=""
   		
      //here we are going to create a columns usign js 
      for(i=0;i<arr.length;i++){
		  	var row = document.createElement("tr");

                var cell1 = document.createElement("td");
                var cell2 = document.createElement("td");
                var cell3 = document.createElement("td");
                var cell4 = document.createElement("td");
                var cell5 = document.createElement("td");
                
                cell1.innerHTML="077ii21"+arr[i].id;
                cell2.innerHTML=arr[i].item_name;
                cell4.innerHTML=arr[i].description;
                cell3.innerHTML=arr[i].price;
                let url = "update_item_by_id.do?id="+arr[i].id
                let deleteURL = "delete_item.do?id="+arr[i].id
                cell5.innerHTML="<a class='btn btn-primary' href="+url+">update</a>&nbsp;<a class='btn btn-danger' href="+deleteURL+"> remove</a>"
                
                row.appendChild(cell1);
                row.appendChild(cell2);
                row.appendChild(cell3);
                row.appendChild(cell4);
                row.appendChild(cell5);
            
            document.getElementById("table").appendChild(row)
		  }

    }
  }
</script>
</html>

<%@include file="footer.jsp"%>


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
    <h3 id="disp">TOTAL <%=cat.size()%> IN CATEGORY</h3>
    <br>
    <div id="container">
        <div id="heading"><b>add new category</b></div><br>
        
            <div class="input-group mb-3">
              <div class="input-group-prepend">
                <span class="input-group-text">Category</span>
              </div>
              <input type="text" class="form-control" id="tmp" name="category" required>
            </div>
            <button class="btn btn-primary" id="btn">save</button>
        
    </div>

    <br>
    <table class="table" id="table">
        <thead class="thead-light">
          <tr>
            <th>category id</th>
            <th>name</th>
            <th>edit/remove</th>           
          </tr>
          </thead>
          <tbody id="details">     
          <%for(Category c:cat){%>
            <form action="update_categories.do">
              <tr>
                  <td>12ca334<%=c.getCategoryId()%></td>
                  <td><%=c.getName()%></td>
                  <td>                    
                    <a id="delete" href="delete_category.do?id=<%=c.getCategoryId()%>" class="btn btn-danger">delete</a>  
                  </td>
              </tr>
            </form>
            <%}%>
        </tbody>
      </table>
<script>
  let req=null,details=null;
  let btn = document.getElementById('btn')
  let disp = document.getElementById('disp')
  let tmp = document.getElementById('tmp')//add_category.do
  details = document.getElementById('details');

  btn.onclick = saveData;

  function saveData(){
    req = new XMLHttpRequest();

    req.open('get','add_category_ajax.do?category='+tmp.value,true)
    req.onreadystatechange = checkUpdated;
    req.send()
  }

  function checkUpdated(){
    details.innerHTML = "";
    if(req.status==200&&req.readyState==4){
      var arr = eval(req.responseText)
      disp.innerHTML = "TOTAL "+arr.length+" IN CATEGORY";
        for(var i=0;i<arr.length;i++){
          var row = document.createElement("tr");
            row.textAlign="center";

                  var cell1 = document.createElement("td");
                  var cell2 = document.createElement("td");
                  var cell3 = document.createElement("td");
                  
                  cell1.innerHTML="12ca334"+arr[i].id;
                  cell2.innerHTML=arr[i].cat;                
                  let url = "update_cat_by_id.do?id="+arr[i].id
                  let deleteURL = "delete_category.do?id="+arr[i].id
                  cell3.innerHTML="<a class='btn btn-danger' href="+deleteURL+"> remove</a>"
                  
                  row.appendChild(cell1);
                  row.appendChild(cell2);
                  row.appendChild(cell3);
              
              details.appendChild(row)
              }
      }

  }
</script>
</body>
</html>

<%@include file="footer.jsp"%>
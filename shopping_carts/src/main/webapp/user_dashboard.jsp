<%@include file="user_dashboard_header.jsp"%>
<%@page import="models.*"%>
<%@page  import="java.util.*"%>

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
        .card{
            float: left;
            margin: 11px;
            box-shadow: 3px 3px 20px #c2c0b8;        
        }

        body{
            background-color: #e8e6e1;
        }
    </style>
</head>
<body>
    
    <%ArrayList<Item> items = (ArrayList)session.getAttribute("items");
      User user = (User)session.getAttribute("user");  
    %>   
        <%int s=0;%>
    <div class="container-fluid">
    <h5> welcome <%=user.getUserName()%></h5>
    <table align="center" id="ttable">
        
        <tr>
            <%for(Item i:items){s++;%>
                <%if(s%8==0){%>
                <tr>
                    
                </tr>
            <%}else{%>
                <%String image = i.getImagePath();
                String set=null;
                    if(image!=null){
                        String rep = image.replace("\\","/");
                        set = rep.substring(36,rep.length());
                    }
                %>
                <td style="padding:7px;text-align: center;"><div class="card" style="width:153px;" class="">
                    <%if(set!=null){%>
                        <img class="card-img-top" src="<%=set%>" alt="Card image" style="width:100%">
                    <%}else{%>
                        <img class="card-img-top" src="images/mine.jpg" alt="please add image" style="width:100%">
                    <%}%>
                    <div class="card-body">
                      <h5 class="card-title"><%=i.getItemName()%></h5>
                      <% String tempDesc = i.getDescription();%>
                      <%String toDisp = tempDesc.substring(0,5);%>
                      <p class="card-text"><%=toDisp%>...</p>
                      <p class="card-text"><%=i.getPrice()%></p>
                      <a href="collect_all_desc.do?id=<%=i.getItemId()%>" class="btn btn-primary">buy</a>
                    </div>
                  </div></td>
            <%}}%>
                          
        </tr>
    </table>

   <%-- display table --%>
    <table class="table" id="head">
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
           
            </tbody>
          </table>
    
    </div>   

<script>
    window.onload = changes;

    function changes(){
        document.getElementById("head").hidden=true;
        let req = null;
        let sel = document.getElementById("cat");
        sel.onchange = check;
    }
  
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

      document.getElementById("ttable").innerHTML=""      
      document.getElementById("table").innerHTML=""
      document.getElementById("head").hidden=false;
      
   		
      //here we are going to create a columns usign js 
      for(i=0;i<arr.length;i++){
		  	var row = document.createElement("tr");

                var cell1 = document.createElement("td");
                var cell2 = document.createElement("td");
                var cell3 = document.createElement("td");
                var cell4 = document.createElement("td");
                var cell5 = document.createElement("td");
                var cell6 = document.createElement("td");
                
                var path = arr[i].image
                cell1.innerHTML="<img src='"+path+"' alt='image' height='50px' width='80px'>"
                cell2.innerHTML=arr[i].item_name;
                cell4.innerHTML=arr[i].description; 
                cell3.innerHTML=arr[i].price;

                let url = "collect_all_desc.do?id="+arr[i].id                 
                cell5.innerHTML="<a class='btn btn-primary' href="+url+">buy now</a>"
                
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
</body>
</html>


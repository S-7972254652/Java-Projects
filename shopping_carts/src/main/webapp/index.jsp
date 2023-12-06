<%@include file="header.jsp"%>
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
    
    <%ArrayList<Item> items = (ArrayList)application.getAttribute("items");%>   
        <%int s=0;%>
    <div class="container-fluid">
        
    <table align="center">
        
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
                      <a href="collect_all_desc_check.do?id=<%=i.getItemId()%>" class="btn btn-primary">buy</a>
                    </div>
                  </div></td>
            <%}}%>
                          
        </tr>
    </table>
    
    </div>   

</body>
</html>


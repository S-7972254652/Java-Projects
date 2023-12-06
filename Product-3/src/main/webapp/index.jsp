<%@page import="com.mysql.cj.jdbc.Blob"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
if(session.getAttribute("name")==null){
	response.sendRedirect("login.jsp");
}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Online Shopping</title>
<style>
    .image-cards {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 20px;
    
        margin-top: 200px;
    }

    .image-card {
        width: 300px;
        <!--text-align: center;-->
        border: 2px solid;
    }
    .image-card p:hover{
    color:golden; 
    }
   
</style>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/index-styles.css" rel="stylesheet" />
<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>


<body id="page-top">
	<!-- Navigation-->
	<nav
		class="navbar navbar-expand-lg bg-info text-uppercase fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand text-white fw-bold" href="#page-top">Online Shopping</a>
			<button
				class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded"
				type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded text-white fw-bold" href="#beauty">Beauty</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded text-white fw-bold" href="cart.jsp"><ion-icon name="cart-outline"></ion-icon></a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="Logout">Logout</a></li>
					<li class="nav-item mx-0 mx-lg-1 bg-danger"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="Logout"><%=session.getAttribute("name") %></a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	
	
	
<div class="container-fluid d-flex justify-content-between align-items-start">	
<div class="col-md-2">
	<!-- Categories -->
	
	<%
try {

String connectionURL = "jdbc:mysql://localhost:3306/user";

Connection connection = null;

Statement statement = null;

ResultSet rs = null;

Class.forName("com.mysql.jdbc.Driver").newInstance();

connection = DriverManager.getConnection(connectionURL, "root", "");

statement = connection.createStatement();

String QueryString = "SELECT * from productdata";
rs = statement.executeQuery(QueryString);
%>
<TABLE style="margin-top: 180px;width:300px; background-color: #fff;color:black" cellpadding="15" border="1">
<%
while (rs.next()) {
%>
<TR>
<TD><p style="font-size: 18px;text-align: center;"><a class="text-decoration-none text-dark" href="#"><%=rs.getString(2)%></a></p>

</TD>
</TR>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
</font>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}
%>
</TABLE>
	
	
</div>	
	
	
	
	
	
	
	
<div class="col-md-10">
	
	<!-- Categories -->


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "user";
String userId = "root";
String password = "";

try {
    Class.forName(driverName);
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


<div class="image-cards">
    <%
    try {
        connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
        statement = connection.createStatement();
        String sql = "SELECT * FROM aproductdata";
        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String imageFilename = resultSet.getString("image");
            String imagePath = request.getContextPath() + "/images/" + imageFilename;
    %>
    <div class="image-card" style="margin-top: 0px;padding: 10px;box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;">
        <img style="background-color: #f7f7f7" src="<%= imagePath %>" alt="Image" width="100%" height="200">
        
        
        <p style="font-weight: bolder;">Name: <span style="font-weight: bold;color: gray"><%= resultSet.getString("name") %></span> </p>
        <p style="font-weight: bolder;">Description: <span style="font-weight: bold;color: gray"><%= resultSet.getString("description") %></span></p>
        <p style="font-weight: bolder;">Price: <span>Rs.</span> <span style="font-weight: bold;color: gray"><%= resultSet.getString("price") %>/-</span>	</p>
        <p style="color: red; font-weight: bold">Discount:<span style="margin-left: 10px"><%= resultSet.getString("Discount") %>%</span> </p>
        <div class="d-flex justify-content-between align-items-center">
        <button class="bg-info p-2 border-0 text-white"><a class="text-decoration-none text-white" href="addToCart?productID=<%= resultSet.getInt("id") %>">Add To Cart</a></button>
        <button class="bg-info p-2 border-0 text-white"><a class="text-decoration-none text-white" href="#">Buy Now</a></button>
        </div>
    </div>
    <%
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    %>
    </div>
</div>
</div>






		
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
	
	<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>

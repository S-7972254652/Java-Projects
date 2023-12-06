<%@page language="java"%>
<%@page import="java.sql.*"%>
<form method="post" action="update.jsp">
<table border="1">
<tr><th>fname</th>
<th>lname</th>
<th>email No</th>
<th>password</th></tr><%
String id=request.getParameter("id");
int no=Integer.parseInt(id);
int sumcount=0;
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
String query = "select * from log where id='"+no+"'";
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()){
%>
<tr>
<td><input type="text" name="fname" value="<%=rs.getString("fname")%>"></td>
<td><input type="text" name="lname" value="<%=rs.getString("lname")%>"></td>
<td><input type="text" name="email" value="<%=rs.getString("email")%>"></td>
<td><input type="text" name="password" value="<%=rs.getString("password")%>"></td>
<td><input type="hidden" name="id" value="<%=rs.getString(1)%>"></td>
</tr>
<tr>
<td><input type="submit" name="Submit" value="Update" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>
</tr>
<%
}
}
catch(Exception e){}
%>
</table>
</form>
<%@ page import="java.sql.*" %> 
<html>
    <head>
<title>Login</title>
</head>
<body>
<%! String userdbName;
String userdbPsw;
String dbUsertype;
%>
<%
Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;

String driverName = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String dbpsw = "gj123";

String sql = "select name,password from faculty where name=? and password=? ";
String sql1 = "select name,password from student where name=? and password=? ";
String name = request.getParameter("name");
String password = request.getParameter("password");
String usertype = request.getParameter("usertype");



if( usertype.equals("student"))
{
try{
Class.forName(driverName);
con = DriverManager.getConnection(url, user, dbpsw);
ps = con.prepareStatement(sql1);
ps.setString(1, name);
ps.setString(2, password);

rs = ps.executeQuery();
if(rs.next())
{ 
userdbName = rs.getString("name");
userdbPsw = rs.getString("password");
if(name.equals(userdbName) && password.equals(userdbPsw))
{
session.setAttribute("name",userdbName);
response.sendRedirect("wel.jsp"); 
} 
}
else
    out.println("wrong");

rs.close();
ps.close(); 
}
catch(SQLException sqe)
{
out.println(sqe);
} 
}
if(usertype.equals("faculty"))
{
    try{
Class.forName(driverName);
con = DriverManager.getConnection(url, user, dbpsw);
ps = con.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, password);

rs = ps.executeQuery();
if(rs.next())
{ 
userdbName = rs.getString("name");
userdbPsw = rs.getString("password");
if(name.equals(userdbName) && password.equals(userdbPsw))
{
session.setAttribute("name",userdbName);
response.sendRedirect("welfac.jsp"); 
} 
}
else
    out.println("wrong");

rs.close();
ps.close(); 
}
catch(SQLException sqe)
{
out.println(sqe);
} 
}
%>


</body>
</html>
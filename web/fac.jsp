<%@ page import ="java.sql.*" %>
<%
    String user= request.getParameter("name");    
    String pwd = request.getParameter("psw");
    String mail = request.getParameter("email");
     String sub = request.getParameter("subject");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
            "system", "gj123");
   // Statement st = con.createStatement();
    //ResultSet rs;
   PreparedStatement stmt=con.prepareStatement("insert into faculty values(?,?,?,?)");  
   stmt.setString(1,user);  
   stmt.setString(2,pwd);  
 stmt.setString(3,mail);
 stmt.setString(4, sub);


    int i=stmt.executeUpdate();  
    
  //  int i = st.executeUpdate("insert into user2 values ('user','mail','pwd')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("logvc.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("homevc.jsp");
    }
%>
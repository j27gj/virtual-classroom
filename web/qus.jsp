<%@ page import ="java.sql.*" %>
<%
    String no = request.getParameter("no");    
   String sub = request.getParameter("subject");
    
    String qus = request.getParameter("qus");
    
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "gj123");
   PreparedStatement stmt=con.prepareStatement("insert into question values(?,?,?)");  
   stmt.setString(1,no);  
   stmt.setString(2,sub);  
 stmt.setString(3,qus);  


    int i=stmt.executeUpdate();  
    
  //  int i = st.executeUpdate("insert into user2 values ('user','mail','pwd')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("wel.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
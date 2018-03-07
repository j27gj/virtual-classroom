<%@ page import ="java.sql.*" %>
<%
    String no = request.getParameter("no");    
   String sub = request.getParameter("subject");
    
    String ans = request.getParameter("ans");
    
    
 
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
            "system", "gj123");
   // Statement st = con.createStatement();
    //ResultSet rs;
   PreparedStatement stmt=con.prepareStatement("insert into answer values(?,?,?)");  
   stmt.setString(1,no);  
   stmt.setString(2,sub);  
 stmt.setString(3,ans);  


    int i=stmt.executeUpdate();  
    
  //  int i = st.executeUpdate("insert into user2 values ('user','mail','pwd')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("ans.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
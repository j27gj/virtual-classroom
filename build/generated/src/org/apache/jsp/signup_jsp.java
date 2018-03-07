package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            h1{\n");
      out.write("              color: #7D1935; font-size:50px;text-decoration: underline ;text-align: center;\n");
      out.write("    \n");
      out.write("\n");
      out.write("            }\n");
      out.write("       \n");
      out.write("\n");
      out.write("            #d1 {\n");
      out.write("                      background-image: url(vc2.jpg);\n");
      out.write("                      background-size: 100% 100%;\n");
      out.write("                      \n");
      out.write("                      padding: 15px;\n");
      out.write("                      margin-left: 70px;\n");
      out.write("                      margin-right: 70px;\n");
      out.write("                      color: white;\n");
      out.write("                      \n");
      out.write("                      }\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("             ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333333;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("li a, .dropbtn {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 22px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("    font-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color: #118C4E;\n");
      out.write("}         \n");
      out.write("    li.dropdown {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color:#7D1935}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}     \n");
      out.write("        \n");
      out.write("        #search{\n");
      out.write("    width: 250px;\n");
      out.write("    padding: 15px 0 15px 20px;\n");
      out.write("    font-size: 22px;\n");
      out.write("    margin: 10px;\n");
      out.write("    font-family: Montserrat, sans-serif;\n");
      out.write("    border: 0 none;\n");
      out.write("    height: 52px;\n");
      out.write("    margin-right: 0;\n");
      out.write("    color: white;\n");
      out.write("    outline: none;\n");
      out.write("    background:#333333;\n");
      out.write("    float: left;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("        \n");
      out.write("      #search_button {\n");
      out.write("    border: 0 none;\n");
      out.write("     font-size: 22px;\n");
      out.write("     color: white;\n");
      out.write("    background: #333333;\n");
      out.write("     margin-top:24px;\n");
      out.write("     margin-right: 8px;\n");
      out.write("    width: 40px;\n");
      out.write("    float: left;\n");
      out.write("    padding: 0;\n");
      out.write("    text-align: center;\n");
      out.write("    height: 30px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}  \n");
      out.write("#search_button:hover{\n");
      out.write("    background-color: royalblue\n");
      out.write("}\n");
      out.write("      div.img {\n");
      out.write(" margin-left: 120px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    float: left;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("  div.desc {\n");
      out.write("    padding: 15px;\n");
      out.write("    font-size:20px;\n");
      out.write("    color:#2B2B2B\n");
      out.write("}\n");
      out.write("div.img1{\n");
      out.write("    margin-left: 50px;\n");
      out.write("    float:left;\n");
      out.write("    border:1px solid #ccc;\n");
      out.write("}  \n");
      out.write("      #footer {\n");
      out.write("    background-color:#333333;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    padding-top: 10px;\n");
      out.write("    padding-bottom: 0px;\n");
      out.write("   \n");
      out.write("    bottom:0;\n");
      out.write("    width:100%;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <h1>Virtual Classroom   <img src=\"vc1.gif\" alt=\"hello\" width=\"100\" height=\"110\" ></h1><br>\n");
      out.write("        \n");
      out.write("          <ul>\n");
      out.write("  <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("  <li class=\"dropdown\"><a href=\"#news\">Subjects</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"http://www.google.co.in\">DBMS</a>\n");
      out.write("      <a href=\"#\">DAA</a>\n");
      out.write("      <a href=\"#\">JAVA</a>\n");
      out.write("        <a href=\"#\">CN</a>\n");
      out.write("    <a href=\"#\">SE</a>\n");
      out.write("    <a href=\"#\">.NET</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"newhtml.html\">Faculties</a></li>\n");
      out.write("  <li><a href=\"vid.html\">Videos</a></li>\n");
      out.write("  <li><a href=\"faq.html\">FAQ</a></li>\n");
      out.write("\n");
      out.write(" <li><a href=\"newlog.html\">login</a></li>\n");
      out.write("   <li><a href=\"signup.jsp\">Sign Up</a></li>\n");
      out.write("   <li><input type=\"text\" name=\"search\" id=\"search\" placeholder=\"Search..\"></li>\n");
      out.write("   <li><input type=\"submit\" onclick=\"location.href='http://google.com'; target='_blank;'\" name=\"search_button\" id=\"search_button\" value=\"Go..\" ></li>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("       </ul>\n");
      out.write("        <h6 style=\"text-align: center;font-size: 30px;color:#333333;text-decoration: underline\"> Register here</h6>\n");
      out.write("    <h7 style=\"font-size: 20px;color: #333333\"><a href=\"regi.jsp\">If faculty Click here</a></h7></br>\n");
      out.write("    </br>\n");
      out.write("    \n");
      out.write("    <h7 style=\"font-size: 20px;color: #333333\"><a href=\"regijs.jsp\">If Student Click here</a></h7>\n");
      out.write("     <section id=\"footer\">VIrtual Classroom <br>BY Gaurav Joshi & Santosh Pandey</section>       \n");
      out.write(" \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

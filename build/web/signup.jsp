<html>
    <head>
       
    </head>
    <body>
        
        <style>
            
            h1{
              color: #7D1935; font-size:50px;text-decoration: underline ;text-align: center;
    

            }
       

            #d1 {
                      background-image: url(vc2.jpg);
                      background-size: 100% 100%;
                      
                      padding: 15px;
                      margin-left: 70px;
                      margin-right: 70px;
                      color: white;
                      
                      }
                      
                      
             ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333333;
}
li {
    float: left;
}


li a, .dropbtn {
    display: block;
    color: white;
    text-align: center;
    padding: 22px;
    text-decoration: none;
    
    font-size: 25px;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: #118C4E;
}         
    li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color:#7D1935}

.dropdown:hover .dropdown-content {
    display: block;
}     
        
        #search{
    width: 250px;
    padding: 15px 0 15px 20px;
    font-size: 22px;
    margin: 10px;
    font-family: Montserrat, sans-serif;
    border: 0 none;
    height: 52px;
    margin-right: 0;
    color: white;
    outline: none;
    background:#333333;
    float: left;
    box-sizing: border-box;
   
}
        
      #search_button {
    border: 0 none;
     font-size: 22px;
     color: white;
    background: #333333;
     margin-top:24px;
     margin-right: 8px;
    width: 40px;
    float: left;
    padding: 0;
    text-align: center;
    height: 30px;
    cursor: pointer;
}  
#search_button:hover{
    background-color: royalblue
}
      div.img {
 margin-left: 120px;
    border: 1px solid #ccc;
    float: left;
    
}
  div.desc {
    padding: 15px;
    font-size:20px;
    color:#2B2B2B
}
div.img1{
    margin-left: 50px;
    float:left;
    border:1px solid #ccc;
}  
      #footer {
    background-color:#333333;
    color: white;
    font-size: 20px;
    text-align: center;
    padding-top: 10px;
    padding-bottom: 0px;
   
    bottom:0;
    width:100%;
}
        
        </style>
        
     
        <h1>Virtual Classroom   <img src="vc1.gif" alt="hello" width="100" height="110" ></h1><br>
        
          <ul>
  <li><a href="homevc.jsp">Home</a></li>
  <li class="dropdown"><a href="#news">Subjects</a>
    <div class="dropdown-content">
      <a href="http://www.google.co.in">DBMS</a>
      <a href="#">DAA</a>
      <a href="#">JAVA</a>
        <a href="#">CN</a>
    <a href="#">SE</a>
    <a href="#">.NET</a>
    </div>
  </li>
  <li><a href="newhtml.html">Faculties</a></li>
  <li><a href="vid.html">Videos</a></li>
  <li><a href="faq.html">FAQ</a></li>

 <li><a href="logvc.jsp">login</a></li>
   <li><a href="signup.jsp">Sign Up</a></li>
   <li><input type="text" name="search" id="search" placeholder="Search.."></li>
   <li><input type="submit" onclick="location.href='http://google.com'; target='_blank;'" name="search_button" id="search_button" value="Go.." ></li>
        
          
       </ul>
        <h6 style="text-align: center;font-size: 30px;color:#333333;text-decoration: underline"> Register here</h6>
    <h7 style="font-size: 20px;color: #333333"><a href="regi.jsp">If faculty Click here</a></h7></br>
    </br>
    
    <h7 style="font-size: 20px;color: #333333"><a href="regijs.jsp">If Student Click here</a></h7><br><br>
     <section id="footer">VIrtual Classroom <br>BY Gaurav Joshi & Santosh Pandey</section>       
 
    
    </body>
</html>
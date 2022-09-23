<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Global Banking ..</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function ctck()
{
var sds = document.getElementById("dum");

}
</script>

</head>

<body>

<div id="top_links"></div>
  

<div id="header">
	<h1>Online Banking System<span class="style1"></span></h1>
	<h1>For ICIN Bank Co.Ltd<span class="style1"></span></h1>
    <h2>Extra Ordinary Service</h2>
    <A href="index.html"><IMG SRC="images/home1.gif"></IMG></A>	
</div>

<div id="navigation">
    <ul>
  <li><a href="create1.html">NEW CUSTOMER</a></li>
    <li><a href="login.html">LOGIN</a></li>
    
    <li><a href="about.jsp">ABOUT US</a></li>
    </ul>
</div>



<table style="width:897px; background:#FFFFFF; margin:0 auto;">
<tr >
	<td width="300" valign="top" style="border-right:#666666 1px dotted;">
    	<div id="services"><h1>Services</h1><br>
		    <ul>
        	<li><a href="cheque.html">request chequebook </a></li>
            <li><a href="update.html">profile settings</a></li>
            </ul>
			
       </div>
	</td>
    
    <td width="1200" valign="top">
    	
    
<%


	 String username=request.getParameter("username");
     String password=request.getParameter("password");
	 String ctype=request.getParameter("ctype");
     String name=request.getParameter("name");
	 int age=Integer.parseInt(request.getParameter("age"));
     String add=request.getParameter("add");
	 int phone=Integer.parseInt(request.getParameter("phone"));
     String mail=request.getParameter("mail");

	 out.print(username);
	 Connection con=g.GetCon.getCon();
	 
    
	try {
		 
	     PreparedStatement ps=con.prepareStatement("INSERT into customer values(?,?,?,?,?,?,?,?)");
		//String	nextvalue1=SessionIdentifierGenerator.genNextValue();
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,ctype);
		ps.setString(4,name);
		//ps.setString(5,nextvalue1);
		ps.setInt(5,age);
		ps.setString(6,add);
		ps.setInt(7,phone);
		ps.setString(8,mail);
		
		int status=ps.executeUpdate();
		out.print(status);
	
			out.print("<table align='left'  cellspacing='5' cellpadding='5'>");
			out.print("<tr><th>CUSTOMER REGISTERED SUCCESSFULLY</th></tr>");
			
			out.print("</table>");
			//session.setAttribute("ssn",nextvalue1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
   
			%>
			</td>
			</tr>
			</table>



<%@ page import="java.sql.*"%>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*"%>
<%@ page import="g.GetCon.*" %>
<%@ page import="g.*" %>
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

<div id="top_links">
  

<div id="header">
	<h1>Online Banking System<span class="style1"></span></h1>
	<h1>For ICIN  Bank Co.Ltd<span class="style1"></span></h1>
    <h2>ExtraOrdinary Service</h2>
   
</div>

<div id="navigation">
    <ul>
    <li><a href="createacc.jsp">NEW ACCOUNT</a></li>
    <li><a href="balance1.jsp">BALANCE</a></li>
    <li><a href="deposit1.jsp">DEPOSIT</a></li>
    <li><a href="withdraw1.jsp">WITHDRAW</a></li>
    <li><a href="transfer1.jsp">TRANSFER</a></li>
    <li><a href="closeac1.jsp">CLOSE A/C</a></li>
    <li><a href="logout.jsp">LOGOUT</a></li>
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
%>
<table><%
  boolean status=false;
//String cno=request.getParameter("cno");
		//int cno1=Integer.parseInt(cno);
     

     //String accountno=request.getParameter("accountno");
		//int accountno=Integer.parseInt(num);
        String username=request.getParameter("username");
		String password=request.getParameter("password");
		//String amoun=request.getParameter("amount");
		//int accoun=Integer.parseInt(amoun);

	    String ssn=(String)session.getAttribute("ssn");
	    
		Connection con1=GetCon.getCon();
	   PreparedStatement ps1=con1.prepareStatement("Select *  from customer where username='"+username+"' and password='"+password+"'");
       ResultSet rs1=ps1.executeQuery();
      
		if(rs1.next()){
		status=true;
		}
		try {
		if(status==true){
			out.print("password has changed successfully");
			Connection con4=GetCon.getCon();
			
			PreparedStatement ps4=con4.prepareStatement("update customer set password=? where password='"+password+"'");
			ps4.setString(1,password);
			ResultSet rs2=ps4.executeQuery();
			//out.print(status1);
			//ResultSet rs4=ps4.executeQuery();
			out.print("password has changed successfully");

			//if(rs.next()){
			//out.print("YOUR BALANCE HAS INCREASED");
			//request.setAttribute("totaldataamount",dataamount);
			//request.setAttribute("balance","YOUR BALANCE HAS INCREASED");	


			%>
			//<jsp:forward page="Totalbalance.jsp"></jsp:forward> 
			<% 
			//}
			
			
			
			
			
			
					
		}
		else{
			out.print("Please check your username and Password");
			//request.setAttribute("balance","Please check your username and Password");
			%>
			<jsp:forward page="update.html"></jsp:forward> 
			<% 
			}
		 }catch (SQLException e) {
			e.printStackTrace();
		}
		
			%></table><%
%>
    	
    	
		 </table>


<%@ page import="java.sql.*"%>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*"%>
 <%@ page import="g.*" %> 
  <%@ page import="java.util.*"%>





   
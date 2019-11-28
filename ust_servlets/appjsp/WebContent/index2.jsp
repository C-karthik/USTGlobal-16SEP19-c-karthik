<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


 <%!
    public void jspinit(){
    	
    	System.out.println("this is init");
    }
 public void jspDestroy(){
    	
    	System.out.println("this is destroy");
    }
    
    
    
    %>
    
</head>
<body>
<%
		Date date = new Date(); //Scripting tag
	
	%>
	<h1 style = 'color:yellowgreen'><%=date %></h1>
	
</body>
</html>
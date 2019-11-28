<%@page import="org.omg.CORBA.Request"%>
<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");

%>
	<a href='./home' style='float: left'>HOME</a>
	<a href='./logout' style='float: right'>Logout</a>

<% if(info != null) { %>

	<form action="">

		<table align = 'center' boarder = '2px'>
			<tr>
				<th style = 'color : red'>id</th>
				<th style = 'color : red'>name</th>
				<th style = 'color : red'>email</th>
			</tr>
			
			<tr>
				<td><%=info.getId() %></td>
				<td><%=info.getEmail() %></td>
				<td<%=info.getName() %>></td>
			</tr>

		</table>

	</form>
	<% } else { %>
	
	<h1>not fouded requested data</h1>
	
	<% } %>
	
	

</body>
</html>
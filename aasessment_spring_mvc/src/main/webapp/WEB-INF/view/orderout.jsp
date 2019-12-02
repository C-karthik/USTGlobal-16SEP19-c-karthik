<%@page import="com.ustglobal.springmvcassesment.dto.OrderBean"%>
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
		OrderBean orderbean =(OrderBean) request.getAttribute("bean");
	%>
	<%
		if (orderbean != null) {
	%>
	<table border="1">
		<tr>
			<th>OrderId</th>
			<th>ProductName</th>
			<th>PricePerUNit</th>
			<th>Quantity</th>
			<th>AmountPayable</th>
			<th>RetailerId</th>
		</tr>
		<tr>
			<td><%=orderbean.getOrderid()%></td>
			<td><%=orderbean.getProductname()%></td>
			<td><%=orderbean.getPriceperunit()%></td>
			<td><%=orderbean.getQuantity()%></td>
			<td><%=orderbean.getAmountpayable()%></td>
			<td><%=orderbean.getRetailerId()%></td>
		</tr>
	</table>
	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>
<%@page import="com.ust.student_mvc.dto.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	StudentBean bean = (StudentBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		welcome
		<%=bean.getName()%></h2>

	<a href="./changepassword">Change Password</a>&nsbp;
	<a href="./update">Update Profile</a>
	<a href="./delete" style="float: right">Delete Profile</a>
	<fieldset>
		<legend>Search by ID</legend>
		<form action="./search">
			<table>
				<tr>
					<td><input type="number" name="id"></td>
					<td><input type="submit" name="search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
		StudentBean sbean = (StudentBean) request.getAttribute("bean");
	%>
	<%
		if (sbean != null) {
	%>
	<fieldset>
		<legend>Student Details</legend>
		<table border="1px">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>EMAIL</td>
				<td>GENDER</td>
				<td>DOJ</td>
			</tr>
			<tr>
				<td><%=sbean.getId()%></td>
				<td><%=sbean.getName()%></td>
				<td><%=sbean.getEmail()%></td>
				<td><%=sbean.getGender()%></td>
				<td><%=sbean.getDoj()%></td>
			</tr>
		</table>

		<%
			}
		%>
		<h1>${msg}</h1>

	</fieldset>
</body>
</html>
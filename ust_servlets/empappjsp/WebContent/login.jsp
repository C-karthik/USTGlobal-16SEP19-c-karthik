<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page session = "false"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<jsp:useBean id="msg" class = "java.lang.String" scope = "request" />

</head>


<h1><%=msg %></h1>
<%

String id = "";
Cookie[] cookie = request.getCookies();
if (cookie != null) {
	for (Cookie cookie2 : cookie) {
		if (cookie2.getName().equals("alwaysrememberme")) {
			id = cookie2.getValue();
		}
	}
}


%>
<body>

	<form action='./login' method='post' style='' border = '2px'>
		<h1 align='center'>Sign in</h1>
		<table align='center'>
			<tr>
				<td>Id :</td>
				<td><input type='number' name='id' value='<%=id %>'></td>
			</tr>
			<tr>
				<td>password :</td>
				<td><input type='password' name='password'></td>
			</tr>
			<tr>
				<td><input type='checkbox' name='rememberme' value='check'></td>
				<td>remberme</td>
			</tr>
			<tr align='center'>
				<td align='left'><input type='reset' name='reset'></td>
				<td><input type='submit' name='login'></td>
			</tr>
			<tr>
				<td><a href='register.html'>register</a></td>
			</tr>
		</table>
	</form>

</body>
</html>
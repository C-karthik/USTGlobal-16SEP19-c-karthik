<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page form</title>
</head>
<body>
<h1>${msg}</h1>
	<fieldset>
		<legend>Login</legend>
		<form action="./login" method="post" style="color: aqua;">
			<table>
				<tr>
					<td>ID :</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./register"> Click here to Register</a>
</body>
</html>
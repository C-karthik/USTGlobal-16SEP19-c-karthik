<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
	<br>
	<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
		<legend style="color: green"><h2>Order Page</h2></legend>
		<form action="./order" method="post">
			<table>
				<tr>
					<td><input type="number" name="quantity"></td>
					<td><input type="submit" name="Place Order"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
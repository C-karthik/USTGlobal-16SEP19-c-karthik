

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request" />

<body>

	<form action="./changepassword" method="post">
		<a href='./home ' style='float: left'>HOME</a> 
		<a href='/logout' style='float: right'>Logout</a>

		<h4><%=msg %></h4>
		<table align="center">
			<tr>

				<td>new password</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>

				<td>Confirm password</td>
				<td><input type="password" name="confirmpassword"></td>
			</tr>

			<tr>

				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="change password"></td>
			</tr>


		</table>



	</form>





</body>
</html>
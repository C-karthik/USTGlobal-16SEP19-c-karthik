<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style='float: right'>Logout</a>
	<fieldset>
		<legend>update profile</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>DOJ :</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><select name="gender" required="required">
							<option value="male">Male</option>
							<option value="female">Female</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" name="update"></td>
				</tr>
			</table>
		</form>
	</fieldset>


</body>
</html>
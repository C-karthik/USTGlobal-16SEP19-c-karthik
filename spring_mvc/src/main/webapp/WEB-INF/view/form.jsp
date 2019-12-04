<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./form" method="post">


<label>id    </label><br>
<input type = "number" name = "id"><br>
<label>username </label><br>
<input type = "text" name = "name"><br>
<label>password</label><br>
<input type = "password" name = "password"><br>
<label>gender  </label><br>
<input type ="text" name = "gender"><br>
<label>DOJ  </label><br>
<input type = "date" name = "doj"><br>
<input type = "submit" name = "register">
<input type = "reset" name = "reset">


</form>
</body>
</html>
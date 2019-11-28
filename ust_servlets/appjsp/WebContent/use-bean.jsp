<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="obj" class = "com.ustglobal.app.Employee" scope ="request"/>


<h2><%= obj.getId() %></h2>
<h1><%= obj.getName() %></h1>


</body>
</html>
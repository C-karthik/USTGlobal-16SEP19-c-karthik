<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="info" class = "com.ustglobal.empwebapp.dto.EmployeeInfo"  scope = "session" />
		
		<h1  style = 'color : orange'> welcome </h1>
		<h1  style = 'color : green '><%=info.getName() %></h1>
			
			<a href = './search.html'>search</a>
			<a href = './changepassword.jsp'>change-password</a>
			<a href = './logout'>Logout</a>
</body>
</html>
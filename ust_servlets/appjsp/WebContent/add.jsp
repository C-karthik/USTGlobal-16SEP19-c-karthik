<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor = 'green'>

<%

//write java code here

        int  i = Integer.parseInt(request.getParameter("num1"));   //should give full name to references
		int  j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		out.println(" result of add " + k);   //no need to create object of printer jsp will provide




%>

</body>
</html>


<%

String s = (String)request.getAttribute("msg");

%>



<html>
<body>
<h2 style = 'color : yellow'>${msg}</h2>
<h2 style = 'color : orange'>${name}</h2>
<h2 style = 'color : blue'>${id}</h2>
<h1 style = 'color : green'><%= s %></h1>
</body>
</html>

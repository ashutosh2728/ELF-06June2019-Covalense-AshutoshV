<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<% int userId = (Integer)request.getAttribute("userId"); 
String pwd = (String)request.getAttribute("password");%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User ID = <%= userId %>
<br>
Password = <%= pwd %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    <%! 
    public String name = "Ashutosh Verma";
    private int age=24;
    {
    	System.out.println("Inside my block");
    }
    
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public String getName(String name) {
    	return "Given Name is : "+name;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Tags Example</h1>
<br> <br>
Name 1 : <%= name %><br>
Name 2 : <%= getName() %><br>
Name 3 : <%= getName("Ayan")%><br>
Age 1 : <%= age %><br>
Age 2 : <%= getAge() %><br>

<%
for(int i =0;i<5;i++) {
%>
Name 1 : <%= name  %>
<%
}
%>
</body>
</html>
<%@page import="java.util.List"%>
<%@page import="javax.print.attribute.standard.MediaSize.Other"%>
<%@page import ="com.covalense.empspringmvc.dto.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>



 	<nav class="navbar navbar-expand-sm navbar-dark bg-dark" >
        <div>
       <a href="./homepage" >    <img src="https://cdn.pixabay.com/photo/2019/07/15/12/02/portrait-4339180__340.jpg" alt="" width="150" height="150">
        </a> </div>
       <div>
          
            <form class="example" action="./login" method="get">
             <input type="text" placeholder="Search.." name="search">
            <button type="submit"><i class="fa fa-search"></i></button>
          </form>
        </div>
        <div>
		<a class=\"btn btn-primary\"  href='./logout' style="">Log out</a>
        </div>
    </nav>
    
  <div class="container">
   <h3> <b>Employee Info</b></h3>
      <table>               
			 <tr>
			<td>Employee ID</td>
			<td>Employee Name</td> 
			 </tr>
			>
		
			<%--  <% EmployeeInfoBean bean; %>
			<% for ( %> ${empBean  } <% :  %> ${bean}  <% ) { %>
			<% for( EmployeeInfoBean infobean : %> ${bean} <% %>
			<% for (bean : %> ${bean} <% ) { %> --%>
			
			
				<tr>  
		     	<td>
			<!-- 	<a href=\"./getinfo?eid=" + empBean.getId() + \">\""); -->
		<%-- 		${bean.id}
				</td>
				<td> ${bean.name} </td>  --%>
				   </tr>  
			<%-- <% for ( %> ${infoBean } <% : %> ${bean } <% ) { %>
			${infoBean.id; }
			${infoBean.name;}
			<%} %> --%>
		</table>
      
        </div>	  
   <script src="homepage.js"></script>
  
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
<%@page import ="com.covalense.empweb.beans.*"%>
<%@page import= "com.covalense.empweb.dao.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



 <nav class="navbar navbar-expand-sm navbar-dark bg-dark" >
        <div>
            <img src="https://cdn.pixabay.com/photo/2019/07/15/12/02/portrait-4339180__340.jpg" alt="" width="150" height="150">
        </div>
       <div>
          
            <form class="example" action="./search" method="get">
             <input type="text" placeholder="Search.." name="search">
            <button type="submit"><i class="fa fa-search"></i></button>
          </form>
        </div>
        <div>
		<a class=\"btn btn-primary\"  href='./logout'>Log out</a>
        </div>
    </nav>
    <%
    	EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("data");
    %>
  
    <b>Employee Info</b>
    	<BR> Name ===> <%= bean.getName() %>
			<BR> Id ===> <%= bean.getId() %>
			<BR> Salary ===> <%= bean.getSalary() %>
			<BR> Phone ===> <%= bean.getPhone() %>
			<BR> JoiningDate ===> <%= bean.getJoiningDate() %>
			<BR> DOB ===> <%= bean.getDob() %>
			<BR> Designation ===> <%= bean.getDesignation() %>
			<BR> DepartmentId ===> <%= bean.getDepartmentId() %>
			<BR> ManagerId ===> <%= bean.getManagerId() %>
			<BR> AccountNumber ===> <%= bean.getAccountNumber() %>
			<BR> Email ===> <%= bean.getEmail() %>
          </table>
   <script src="homepage.js"></script>
  
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 

</body>
</html>
<%@page import="javax.print.attribute.standard.MediaSize.Other"%>

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
            <img src="https://cdn.pixabay.com/photo/2019/07/15/12/02/portrait-4339180__340.jpg" alt="" width="150" height="150">
        </div>
       <div>
          
            <form class="example" action="../validator/validate/employee/search" method="get">
             <input type="text" placeholder="Search.." name="id">
           <!--   <!--  --><input hidden type="text" value="search"> -->
            <button type="submit"><i class="fa fa-search"></i></button>
          </form>
        </div>
        <div>
		<a class=\"btn btn-primary\"  href='./logout' style="">Log out</a>
        </div>
    </nav>
    
  <div class="container">
   <h3> <b>Employee Info</b></h3>
      <table class="table">
      <thead>
      <tr><th>Name</th><td>${infoBean.name} </td></tr>
      <tr><th>Id</th><td> ${ infoBean.id}</td></tr>
      <tr><th>Email</th><td> ${ infoBean.email }</td> </tr>     
      <tr><th>Phone</th><td>${ infoBean.phone }</td> </tr>
      <tr><th>DOB</th><td>${ infoBean.dob }</td></tr>
      <tr><th>Designation</th><td>${ infoBean.designation}</td></tr>
      <tr><th>Salary</th><td>${ infoBean.salary}</td></tr>   
      <tr><th>Joining Date</th><td>${ infoBean.joiningDate}</td></tr>    
      <tr><th>Account Number</th><td>${ infoBean.accountNumber}</td></tr>    
      <tr><th>Department ID</th><td>${ infoBean.departmentId }</td></tr>    
      <tr><th>Manager ID</th><td>${ infoBean.managerId}</td></tr>    
      </thead>
      </div>	
        </table> 
       <div class="container">
   <h3> <b>Employee Other Info</b></h3>
      <table class="table">
      <thead>
      <tr><th>Blood Group</th><td>${otherInfoBean.bloodGrp} </td></tr>
      <tr><th>PAN</th><td> ${ otherInfoBean.pan}</td></tr>
      <tr><th>ADHAR</th><td> ${ otherInfoBean.adhar}</td> </tr>     
      <tr><th>Passport Number</th><td>${ otherInfoBean.passport}</td> </tr>
      <tr><th>Emergency Contact Name</th><td>${ otherInfoBean.emergencyContactName}</td></tr>
      <tr><th>Emergency Contact Number</th><td>${ otherInfoBean.emergencyContactNum}</td></tr>   
    <%--   <tr><th>Physically Challenged</th><td>${ otherInfoBean.isChallenged}</td></tr>    
      <tr><th>Married</th><td>${ otherInfoBean.isMarried}</td></tr>     --%>
      <tr><th>Spouse Name</th><td>${ otherInfoBean.spouseName}</td></tr>    
       <tr><th>Father Name</th><td>${ otherInfoBean.fatherName}</td></tr>  
        <tr><th>Mother Name</th><td>${ otherInfoBean.motherName}</td></tr> 
        <tr><th>Nationality</th><td>${ otherInfoBean.nationality}</td></tr> 
         <tr><th>Relegion</th><td>${ otherInfoBean.relegion}</td></tr>  
         
      </thead>
     <%--  <tbody>
      <tr> <td><%= infoBean.getName() %></td> </tr>
        <tr> <td><%= infoBean.getId() %></td> </tr>
        <tr> <td> <%= infoBean.getEmail() %></tr>td> </tr>
      </tbody>
    	    <BR> Name ===> <%= infoBean.getName() %>	    
			<BR> Id ===> <%= infoBean.getId() %>
			<BR> Salary ===> <%= infoBean.getSalary() %>
			<BR> Phone ===> <%= infoBean.getPhone() %>
			<BR> JoiningDate ===> <%= infoBean.getJoiningDate() %>
			<BR> DOB ===> <%= infoBean.getDob() %>
			<BR> Designation ===> <%= infoBean.getDesignation() %>
			<BR> DepartmentId ===> <%= infoBean.getDepartmentId() %>
			<BR> ManagerId ===> <%= infoBean.getManagerId() %>
			<BR> AccountNumber ===> <%= infoBean.getAccountNumber() %>
			<BR> Email ===> <%= infoBean.getEmail() %> --%>
		</div>	
        </table> 
        
        
       <%--  <div class="container">
        <BR>
         <h3><b>Employee Other Info</b></h3>
          <table class="table">
      <thead>
      <tr><th>Blood Group</th><td><%= empOtherInf.getBloodGrp() %></td></tr>
      <tr><th>PAN </th><td><%= empOtherInf.getPan()%></td></tr>
      <tr><th>Adhar Number</th><td> <%= empOtherInf.getAdhar() %></td> </tr>     
      <tr><th>Passport</th><td><%=  empOtherInf.getPassport() %></td> </tr>
      <tr><th>Emergency Contact Name</th><td><%= empOtherInf.getEmergencyContactName() %></td></tr>
      <tr><th>Emergency Contact Number</th><td><%= empOtherInf.getEmergencyContactNum() %></td></tr>
      <tr><th>Physically Challanged</th><td><%= empOtherInf.isChallenged()  %></td></tr>   
      <tr><th>Married</th><td><%= empOtherInf.isMarried() %></td></tr>    
      <tr><th>Spouse Name</th><td><%= empOtherInf.getSpouseName() %></td></tr>    
      <tr><th>Father Name</th><td><%=empOtherInf.getFatherName() %></td></tr>    
      <tr><th>Mother Name</th><td><%= empOtherInf.getMotherName()%></td></tr>   
      <tr><th>Nationality </th><td><%=empOtherInf.getNationality() %></td></tr> 
      <tr><th>Religion</th><td><%= empOtherInf.getRelegion() %></td></tr>  
      </thead> --%>
    		<%-- <BR>	Blood Group ===><%= empOtherInf.getBloodGrp() %> 
			<BR>  	PAN ===>	<%= empOtherInf.getPan()%> 
			<BR>	Adhar Number ===>	<%=   empOtherInf.getAdhar() %> 
			<BR>	Passport ===><%= empOtherInf.getPassport()%>
			<BR>	Emergency Contact Name ===><%= empOtherInf.getEmergencyContactName()%>
			<BR>	Emergency Contact Number ===><%= empOtherInf.getEmergencyContactNum()%> 
			<BR>	Physically Challanged ===>  <%= empOtherInf.isChallenged()   %>
			<BR>	Married ===><%= empOtherInf.isMarried()%> 
			<BR>	Spouse Name ===><%=   empOtherInf.getSpouseName() %> 
			<BR>	Father Name ===> <%= empOtherInf.getFatherName() %>
			<BR>	Mother Name ===> <%= empOtherInf.getMotherName()%> 
			<BR>	Nationality ===><%= empOtherInf.getNationality() %> 
			<BR>    Religion ===>	<%= empOtherInf.getRelegion() %>  --%>	
        </table>
        </div>	  
   <script src="homepage.js"></script>
  
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
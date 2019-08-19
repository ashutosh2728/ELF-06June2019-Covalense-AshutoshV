import React, { Component } from 'react'

export class HomePage extends Component {
    render() {
        return (
            <div>
                <nav class="navbar navbar-expand-sm navbar-dark bg-dark" >
        <div>
            <img src="https://cdn.pixabay.com/photo/2019/07/15/12/02/portrait-4339180__340.jpg" alt="" width="150" height="150"/>
        </div>
            <div>
          
            <form class="example" action="<%=baseURL%>/validator/validate/employee/search" method="get">
             <input type="text" placeholder="Search.." name="id"/>
            <button type="submit"><i class="fa fa-search"></i></button>
          </form>
          </div>
        <div>
		<a class="btn btn-primary"  href='./logout' style="">Log out</a>
        </div>
         <div>
		<a class="btn btn-primary"  href='../emp/updateEmployee' style="">Update</a>
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
      <tr><th>Department ID</th><td>${ infoBean.departmentInfoBean }</td></tr>    
      <tr><th>Manager ID</th><td>${ infoBean.mngId}</td></tr>    
      </thead>
       </table> 
       </div>
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
      <tr><th>Spouse Name</th><td>${ otherInfoBean.spouseName}</td></tr>    
       <tr><th>Father Name</th><td>${ otherInfoBean.fatherName}</td></tr>  
        <tr><th>Mother Name</th><td>${ otherInfoBean.motherName}</td></tr> 
        <tr><th>Nationality</th><td>${ otherInfoBean.nationality}</td></tr> 
         <tr><th>Relegion</th><td>${ otherInfoBean.relegion}</td></tr>  
         
      </thead>
      </table> 
		</div>	    
        </div>
        )
    }
}

export default HomePage

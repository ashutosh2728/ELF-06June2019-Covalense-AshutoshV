import React, { Component } from 'react'
import Axios from 'axios';

export class Info extends Component {
constructor(props){
super(props)

this.postLoginData = this.postLoginData.bind(this);
}

postLoginData(event) {
    event.preventDefault();
    //let accountData = this.state;
    const {id,password} = this.state;
    const loginData = {id,password};

    if(this.validateLogin(loginData)){
        //Call the API using Axios and Validate the Employee Login
        Axios.post('http://localhost/emp-springrest/login/auth',null,{
            params:{
                id:this.state.id,
                name:this.state.name,
                accountNumber:this.state.accountNumber,
                email:this.state.email,
                age : this.state.age,
                designation:this.state.designation,
                gender:this.state.gender,
                dob:this.state.dob,
                salary:this.state.salary,
                departmentId:this.state.departmentId,
                phone:this.state.phone,
                managerId:this.state.managerId,
                joiningDate:this.state.joiningDate,
                password:this.state.password
            }
        }).then((response)=>{
            console.log(response.data);
            console.log(response.data.statusCode)
            if(response.statusCode==401){
                this.setState({errorMessage:response.data.message});
            } else{

            }
        }).catch((error)=>{
            console.log('Error',error);
        });
    }
}



    render() {
        return (
            <div className="card">
              <div class="card-body">
              <div className="card-header" id="headingThree">
					<h2 className="heading">
					Employee Information
					</h2>
				</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">ID</label> <input type="text"
									id="id" name="id" class="form-control" placeholder="ID"/>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
									type="text" id="accountNumber" name="accountNumber"
									class="form-control" placeholder="ACCOUNT NUMBER"/>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">NAME</label> <input type="text"
									id="name" name="name" class="form-control" placeholder="NAME"/>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">EMAIL ID</label> <input
									type="text" id="emailId" name="email" class="form-control"
									placeholder="EMAIL ID"/>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">AGE</label> <input type="text"
									name="age" id="age" class="form-control" placeholder="AGE"/>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">DESIGNATION</label> <input
									type="text" name="designation" id="designation"
									class="form-control" placeholder="DESIGNATION"/>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputGender">Gender</label> <select name="gender"
									id="gender" class="form-control">
									<option selected>--select one--</option>
									<option value="male">male</option>
									<option value="female">female</option>
									<option value="other">other</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">Date of Birth</label> <input
									type="date" name="dob" id="dob" class="form-control"
									placeholder="dd-mm-yyyy"/>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">SALARY</label> <input
									type="text" name="salary" id="salary" class="form-control"
									placeholder="SALARY"/>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">DEPARTMENT ID</label> <input
									type="text" name="departmentId" id="departmentId"
									class="form-control" placeholder="DEPARTMENT ID"/>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">PHONE NUMBER</label> <input
									type="text" name="phone" id="phone" class="form-control"
									placeholder="PHONE NUMBER"/>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">MANAGER ID</label> <input
									type="text" name="managerId" id="managerId"
									class="form-control" placeholder="MANAGER ID"/>
							</div>
						</div>
						<div class="row">

							<div class="col-6">
								<label for="exampleInputEmail1">JOINING DATE</label> <input
									type="date" name="joiningDate" id="joiningDate"
									class="form-control" placeholder="JOINING DATE"/>
							</div>
							<div class="col">
								<label for="password">Password:</label> <input type="password"
									onkeyup="validateForm()" class="form-control" id="password"
									placeholder="Enter Password" name="password"/> 
							</div>

						</div>
				</div>
                </div>
       
        )
    }
}

export default Info

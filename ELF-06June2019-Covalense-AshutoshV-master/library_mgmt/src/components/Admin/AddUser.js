import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'

export class AddUser extends Component {
    constructor(props){
        super(props)
        this.state={
            userId : '',
            userType : '',
            userName : '',
            gender : '',
            address1 : '',
            address2 : '',
            state :'',
            city : '',
            country : '',
            password : '',
            phoneNum : '',
            email : '',
            pincode:''
        }
        this.postAddData = this.postAddData.bind(this);
    }
    openUser(event){
        this.props.history.push('/Navbar');
        this.props.history.push('/AddUser');
        this.props.history.push('/DeleteUser');
        this.props.history.push('/UpdateUser');
    }
    logoutApp(event) {
       event.preventDefault();
               this.props.history.push('/'); // redirect to home page
           }
    postAddData(event) {
            event.preventDefault();
            let accountData = this.state;
        // const {userId,userType,userName,gender,address1,address2,state,city,country,phoneNum,email,pincode,password} = this.state;
            //const loginData = {userId,userType,userName,gender,address1,address2,state,city,country,phoneNum,email,pincode,password};
            console.log("Account data",accountData);
                //Call the API using Axios and Validate the Employee Login
                Axios.post('http://localhost:8030/create',accountData).then((response)=>{

                    console.log(response.data);
                    console.log(response.data.statusCode)
                    this.props.history.push('/Navbar');
                    
                }).catch((error)=>{
                    console.log('Error',error);
                });
            }
        
    render() {
        
        return (
            <div>
                <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" >WELCOME TO E-LIBRARY</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><Link to="/Navbar">Home</Link></li>
      <li><Link to="/AddUser" >Add User</Link></li>
      <li><Link to="/DeleteUser">Delete User</Link></li>
      <li><Link to="/UpdateUser">Update User</Link></li>
      
    </ul>
    <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search"/>
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
          
        </div>
      </div>
    </form>
    <ul class="nav navbar-nav" >
    <li><a href="<%=baseURL%>/logout"onClick={this.logoutApp.bind(this)}>Logout</a></li>
      </ul>
  </div>
  

</nav>
<table class="table table-striped">
    <tbody>
       <tr>
          <td colspan="1">
             <form class="well form-horizontal" onSubmit={this.postAddData} >
                <fieldset>
             <div class="form-group">
                     <label class="col-md-4 control-label">User Type</label>
                       <div class="col-md-4 inputGroupContainer">
                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userType" name="userType" onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType} placeholder="User Type" class="form-control" required="true" type="text"/></div>
                     </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">User ID</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userId" name="userId" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} placeholder="user id" class="form-control" required="true" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">User Name</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userName" name="userName" onChange={(event)=>{this.setState({userName:event.target.value})}} value={this.state.userName} placeholder="Full Name" class="form-control" required="true" type="text"/></div>
                    </div>
                </div>
                <div class="form-group">
                 <label class="col-md-4 control-label">Gender</label>
                 <div class="col-md-4 inputGroupContainer">
                    <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="gender" name="gender" onChange={(event)=>{this.setState({gender:event.target.value})}} value={this.state.gender} placeholder="gender" class="form-control" required="true" type="text"/></div>
                 </div>
                 </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Address Line 1</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="address1"  onChange={(event)=>{this.setState({address1:event.target.value})}} value={this.state.address1} name="addressLine1" placeholder="Address Line 1" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Address Line 2</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="address2" onChange={(event)=>{this.setState({address2:event.target.value})}} value={this.state.address2} name="addressLine2" placeholder="Address Line 2" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">City</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="city" name="city" onChange={(event)=>{this.setState({city:event.target.value})}} value={this.state.city} placeholder="City" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">State/Province/Region</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="state" name="state" onChange={(event)=>{this.setState({state:event.target.value})}} value={this.state.state} placeholder="State/Province/Region" class="form-control" required="true" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Postal Code/ZIP</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="pincode" name="pincode" onChange={(event)=>{this.setState({pincode:event.target.value})}} value={this.state.pincode} placeholder="Postal Code/ZIP" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">Country</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="country" name="country" onChange={(event)=>{this.setState({country:event.target.value})}} value={this.state.country} placeholder="Country" class="form-control" required="true"  type="text"/></div>
                    </div>
                 </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Email</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span><input id="email" name="email" onChange={(event)=>{this.setState({email:event.target.value})}} value={this.state.email} placeholder="Email" class="form-control" required="true" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Phone Number</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span><input id="phoneNum" name="phoneNum" onChange={(event)=>{this.setState({phoneNum:event.target.value})}} value={this.state.phoneNum} placeholder="Phone Number" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">Password</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="password" name="password" placeholder="password"  onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} class="form-control" required="true"  type="password"/></div>
                    </div>
                 </div>
                 <div class="form-group">
                    <label class="col-md-4 control-label">Confirm Password</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="cnfrmPassword" name="cnfrmPassword" placeholder="Confirm Password" class="form-control" required="true" type="password"/></div>
                    </div>
                 </div>
                 <div class="col-md-3 col-md-offset-4"  >  
                 <button type="submit" onclick="alert('Your details have been submitted :)')" value="Submit"class="btn btn-lg btn-primary">Submit</button>
                 <input  type="reset" class="btn btn-lg btn-primary"/>
                 </div>
                </fieldset>
             </form>
          </td>
       </tr>
    </tbody>
 </table>
            </div>
        )
    }
}

export default AddUser

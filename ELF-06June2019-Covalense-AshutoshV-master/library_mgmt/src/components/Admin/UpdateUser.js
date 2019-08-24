import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'
export class UpdateUser extends Component {
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
      this.postAddData = this.postUpdateData.bind(this);
      this.postSearchData = this.getSearchData.bind(this)
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
            postUpdateData(event) {
               event.preventDefault();
               let accountData = this.state;
           // const {userId,userType,userName,gender,address1,address2,state,city,country,phoneNum,email,pincode,password} = this.state;
               //const loginData = {userId,userType,userName,gender,address1,address2,state,city,country,phoneNum,email,pincode,password};
               console.log("Account data",accountData);
               this.setState = accountData
                   //Call the API using Axios and Validate the Employee Login
                   Axios.patch('http://localhost:8030/update',accountData).then((response)=>{

                       this.props.history.push('/Navbar')
                       
                   }).catch((error)=>{
                       console.log('Error',error);
                   });
               }
               getSearchData(event) {
                  event.preventDefault();
                   const{searchId} = this.state;
                   const search = {searchId}
             
                  console.log("Account data",search);
                      Axios.get('http://localhost:8030/getUser?userId='+search.searchId,null,{
                        params:{
                           searchId:this.state.searchId,
                           
                        }}).then((response)=>{
      
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
    <li class="active"><Link href="/Navbar">Home</Link></li>
      <li><Link to="/AddUser" >Add User</Link></li>
      <li><Link to="/DeleteUser">Delete User</Link></li>
      <li><Link to="/UpdateUser">Update User</Link></li>
    </ul>
    <form class="navbar-form navbar-left"  onSubmit={this.getSearchData}>
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="searchId" id="searchId" onChange={(event)=>{this.setState({searchId:event.target.value})}} value={this.state.searchId} name="search"/>
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
             <form class="well form-horizontal"  onSubmit={this.postUpdateData}>
                <fieldset>
             <div class="form-group">
                     <label class="col-md-4 control-label">User Type</label>
                       <div class="col-md-4 inputGroupContainer">
                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userType" name="userType" placeholder="User Type" onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType} class="form-control" required="true"  type="text"/></div>
                     </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">User ID</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userId" name="userId" placeholder="user id" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} class="form-control" required="true"  type="number"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">Full Name</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="fullName" name="fullName" placeholder="Full Name" onChange={(event)=>{this.setState({fullName:event.target.value})}} value={this.state.fullName} class="form-control" required="true"  type="text"/></div>
                    </div>
                </div>
                <div class="form-group">
                 <label class="col-md-4 control-label">Gender</label>
                 <div class="col-md-4 inputGroupContainer">
                    <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="gender" name="gender" placeholder="gender" onChange={(event)=>{this.setState({gender:event.target.value})}} value={this.state.gender} class="form-control" required="true"  type="text"/></div>
                 </div>
                 </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Address Line 1</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="addressLine1" name="addressLine1" onChange={(event)=>{this.setState({addressLine1:event.target.value})}} value={this.state.addressLine1} placeholder="Address Line 1" class="form-control" required="true" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Address Line 2</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="addressLine2" name="addressLine2" placeholder="Address Line 2" onChange={(event)=>{this.setState({addressLine2:event.target.value})}} value={this.state.addressLine2} class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">City</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="city" name="city" placeholder="City" onChange={(event)=>{this.setState({city:event.target.value})}} value={this.state.city} class="form-control" required="true" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">State/Province/Region</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="state" name="state" placeholder="State/Province/Region" onChange={(event)=>{this.setState({state:event.target.value})}} value={this.state.state} class="form-control" required="true"  type="text"/></div>
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
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span><input id="email" name="email" onChange={(event)=>{this.setState({email:event.target.value})}} value={this.state.email} placeholder="Email" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Phone Number</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span><input id="phoneNumber" name="phoneNumber" onChange={(event)=>{this.setState({phoneNumber:event.target.value})}} value={this.state.phoneNumber} placeholder="Phone Number" class="form-control" required="true"  type="text"/></div>
                      </div>
                   </div>
                 <div class="col-md-3 col-md-offset-4"  >  
                 <button type="submit" onclick="alert('Your details have been submitted :)')" value="Submit"class="btn btn-lg btn-primary">Update</button>
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

export default UpdateUser

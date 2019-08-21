import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'

export class DeleteUser extends Component {
    constructor(props){
        super(props)
        this.state ={
            userId : '',
           
        }
        this.postDeleteData = this.postDeleteData.bind(this);
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
      postDeleteData(event) {
            event.preventDefault();
           let account = this.state;
           console.log(account.userId);
                Axios.delete('http://localhost:8030/delete?userId='+account.userId).then((response)=>{

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
             <form class="well form-horizontal" onSubmit={this.postDeleteData}>
                <fieldset>
             <div class="form-group">
                     <label class="col-md-4 control-label">User Type</label>
                       <div class="col-md-4 inputGroupContainer">
                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userType" name="userType" placeholder="User Type" class="form-control" required="true" type="text"/></div>
                     </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">User ID</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userId" name="userId" placeholder="user id" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} class="form-control" required="true" type="number"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">User Name</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="fullName" name="fullName" placeholder="Full Name" class="form-control" required="true" type="text"/></div>
                    </div>
                </div>
                
                <div class="col-md-3 col-md-offset-4"  >  
                <button type="submit"  value="Submit"class="btn btn-lg btn-primary">Delete</button>
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

export default DeleteUser

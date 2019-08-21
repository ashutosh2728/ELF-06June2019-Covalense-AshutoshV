import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

export class UpdateUser extends Component {
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
             <form class="well form-horizontal">
                <fieldset>
             <div class="form-group">
                     <label class="col-md-4 control-label">User Type</label>
                       <div class="col-md-4 inputGroupContainer">
                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userType" name="userType" placeholder="User Type" class="form-control" required="true" value="" type="text"/></div>
                     </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">User ID</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userId" name="userId" placeholder="user id" class="form-control" required="true" value="" type="number"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">Full Name</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="fullName" name="fullName" placeholder="Full Name" class="form-control" required="true" value="" type="text"/></div>
                    </div>
                </div>
                <div class="form-group">
                 <label class="col-md-4 control-label">Gender</label>
                 <div class="col-md-4 inputGroupContainer">
                    <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="gender" name="gender" placeholder="gender" class="form-control" required="true" value="" type="text"/></div>
                 </div>
                 </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Address Line 1</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="addressLine1" name="addressLine1" placeholder="Address Line 1" class="form-control" required="true" value="" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Address Line 2</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="addressLine2" name="addressLine2" placeholder="Address Line 2" class="form-control" required="true" value="" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">City</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="city" name="city" placeholder="City" class="form-control" required="true" value="" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">State/Province/Region</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="state" name="state" placeholder="State/Province/Region" class="form-control" required="true" value="" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Postal Code/ZIP</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="postcode" name="postcode" placeholder="Postal Code/ZIP" class="form-control" required="true" value="" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                    <label class="col-md-4 control-label">Country</label>
                    <div class="col-md-4 inputGroupContainer">
                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="Country" name="Country" placeholder="Country" class="form-control" required="true" value="" type="text"/></div>
                    </div>
                 </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Email</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span><input id="email" name="email" placeholder="Email" class="form-control" required="true" value="" type="text"/></div>
                      </div>
                   </div>
                   <div class="form-group">
                      <label class="col-md-4 control-label">Phone Number</label>
                      <div class="col-md-4 inputGroupContainer">
                         <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span><input id="phoneNumber" name="phoneNumber" placeholder="Phone Number" class="form-control" required="true" value="" type="text"/></div>
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

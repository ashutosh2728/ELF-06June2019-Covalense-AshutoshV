import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'



export class Navbar extends Component {
  constructor(props){
    super(props)
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
            </div>
        )
    }
}

export default Navbar

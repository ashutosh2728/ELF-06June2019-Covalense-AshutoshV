import React, { Component } from 'react'
import Navbar from '../Navbar'

export class AdminHome extends Component {
    render() {
        return (
            <div>
               <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Home</a>
    </div>
    <ul class="nav navbar-nav">
      
      <li><a href="#">Add User</a></li>
      <li><a href="#">Delete User</a></li>
      <li><a href="#">Update User</a></li>
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
    <ul class="nav navbar-nav" style="float:right;">
        <li ><a href="#" >Logout</a></li>
      </ul>
  </div>
  

</nav>
            </div>
        )
    }
}

export default AdminHome

import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios';



export class Navbar extends Component {
  constructor(props){
    super(props)
    this.state={
     // userId :  JSON.parse(sessionStorage.getItem("userId")),
      searchId : ''
    }
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
   Axios.get('http://localhost:8030/logout',null).then((response)=>{

    console.log(response.data);
    console.log(response.data.statusCode)
    this.props.history.push('/');
    
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
      <a class="navbar-brand" >WELCOME </a>
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
            </div>
        )
    }
}

export default Navbar

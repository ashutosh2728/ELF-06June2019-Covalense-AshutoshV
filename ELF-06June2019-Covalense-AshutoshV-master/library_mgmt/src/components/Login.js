import React, { Component } from 'react'
import Axios from 'axios'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'


export class Login extends Component {
   constructor(props){
      super(props);

      this.state = {
          userId : '',
          password : '',
          userType : '',
          errorMessage: ''
          
      }

      this.postLoginData = this.postLoginData.bind(this);
  }

  postLoginData(event) {
      event.preventDefault();
      //let accountData = this.state;
      const {userId,password,userType} = this.state;
      const loginData = {userId,password,userType};
    console.log(loginData)
      if(this.validateLogin(loginData)){
          //Call the API using Axios and Validate the Employee Login
          Axios.post('http://localhost:8030/auth',null,{
              params:{
                userId:this.state.userId,
                  password:this.state.password,
                  userType : this.state.userType
              }
          }).then((response)=>{

            // if(response.data.message === 'Success'){
               sessionStorage.setItem('userId', response.data.beans[0].userId);
             //  sessionStorage.setItem('userType', response.data.beans[0].userType);
              
            
              console.log(response.data);
              console.log(response.data.statusCode)
              //this.props.history.push('/Navbar');
              if(loginData.userType=="Admin"){
                  this.props.history.push('/Navbar');
              } else if(loginData.userType=="Librarian") {
                this.props.history.push('/LibrarianHomePage');
                              } else {
                                this.props.history.push('/');
                              }
                            //   }} 
                            //   else {

                            //   }
          }).catch((error)=>{
              console.log('Error',error);
          });
      }
  }

  validateLogin(loginData){
      let validationSuccess = false;

      if(loginData.userId.trim()==="" || loginData.userId.trim()===null){
          alert('Please enter User Id');
          document.getElementById("userId").focus();
          return validationSuccess;
      } else if(loginData.password.trim()==="" || loginData.password.trim()===null){
          alert('Please enter Password');
          document.getElementById("password").focus();
          return validationSuccess;
      } else{
          validationSuccess = true;
      }

      return validationSuccess;
  }
    render() {
        return (
           <div > 

            <div class="sidenav">
         <div class="login-main-text">
            <h2>E-Library<br/> Login Page </h2>
            <p>Login or register from here to access.</p>
      </div>
      </div >
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form onSubmit={this.postLoginData}>
                  <div class="form-group">
                     <label>User ID</label>
                     <input type="text" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} class="form-control" placeholder="User ID"/>
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <input type="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} class="form-control" placeholder="Password"/>
                  </div>
                  <div class="form-group">
                     <label  >User Type</label>
                     <select id="userType" name="userType" onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType}>
                     <option  selected>Choose..</option>
                    <option  value="Admin">Admin</option>
                    <option value="Librarian">Librarian</option>
                    <option  value="User">User</option>
                    </select>
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                  <Link to="/">  Forgot-Password</Link>
               </form>
            </div>
         </div>
      </div>
      </div>
      
        )
    }
}

export default Login


import React, { Component } from 'react';
import Axios from 'axios';
import {Link} from 'react-router-dom'

export default class Login extends Component {
    constructor(props){
        super(props);

        this.state = {
            id : '',
            password : '',
            errorMessage: ''
        }

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

    validateLogin(loginData){
        let validationSuccess = false;

        if(loginData.id.trim()==="" || loginData.id.trim()===null){
            alert('Please enter Employee Id');
            document.getElementById("id").focus();
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
            <form onSubmit={this.postLoginData}  method="POST"> 
            <div class="container">
            <div class="row1">
                 <h1><i class="fa fa-lock" aria-hidden="true"></i> Login</h1>
               
                </div><br /><br />
                 
            
                            <div class="input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"><i class="fas fa-user-tie"></i></span>
                                        </div>
                                        <input type="text" name="id" onChange={(event)=>{this.setState({id:event.target.value})}} value={this.state.id} class="form-control" placeholder="employee id"/>
                                    </div><br />
                 
                            <div class="input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"><i class="fa fa-key icon"></i></span>
                                        </div>
                                            <input type="Password" name="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} class="form-control" placeholder="password"/>
                                    </div><br />
                    <div class="checkbox">
                      <label><input type="checkbox" value=""/> Remember me</label>
                    </div><br />
                      <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-off"></span> Login</button>
              
                <div class="footer">
                 <p>Don't have an Account! <Link to="/createAccount">Sign Up Here</Link></p>
     <p>Forgot <Link href="#">Password?</Link></p>
                </div> 
                
            </div>
            </form>
        
 )
    }
}



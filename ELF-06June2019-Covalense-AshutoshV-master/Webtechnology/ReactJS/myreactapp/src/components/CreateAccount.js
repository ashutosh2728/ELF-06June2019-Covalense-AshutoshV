import React, { Component } from 'react'
import Axios from 'axios';

export class CreateAccount extends Component {

    constructor(props) {
        super(props)
        this.state ={
            name : '',
            email : '',
            phoneno : '',
            password : '',

        }
        this.postData = this.postData.bind(this);
    }
postData(event) {
event.preventDefault();
console.log('Post Date',this.state);
let accountData = this.state;
Axios.post('https://emp-web-3cc10.firebaseio.com/accounts.json',accountData).then((response)=>{
  console.log('Response object',response);
  this.setState({
    name : '',
    email : '',
    phoneno : '',
    password : '',

})
}).catch((error)=>{
  console.log('error',error);
})
}

    render() {
        return (
            
                             <form onSubmit={this.postData}>
  <div className="row">
    <div className="col">
      <input type="text" value={this.state.name}  onChange={(event)=>{this.setState({name:event.target.value})}}  className="form-control" placeholder="Name"/>
    </div>
    <div className="col">
      <input type="text" value={this.state.email}  onChange={(event)=>{this.setState({email:event.target.value})}}  className="form-control" placeholder="Email"/>
  </div>
  </div>
  <div className="row">
    <div className="col">
      <input type="text" className="form-control"  onChange={(event)=>{this.setState({phoneno:event.target.value})}}  value={this.state.phoneno} placeholder="Phone Number"/>
    </div>
    <div className="col">
      <input type="password" className="form-control"  onChange={(event)=>{this.setState({password:event.target.value})}}  value={this.state.password} placeholder="Password"/>
    </div>
  </div>
  <div>
      <button type="submit"> Create Employee</button>
  </div>
</form>
            
        )
    }
}

export default CreateAccount

import React, { Component } from 'react'

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
}

    render() {
        return (
            
                             <form onSubmit={this.postData}>
  <div class="row">
    <div class="col">
      <input type="text" value={this.state.name}  onChange={(event)=>{this.setState({name:event.target.value})}}  class="form-control" placeholder="Name"/>
    </div>
    <div class="col">
      <input type="text" value={this.state.email}  onChange={(event)=>{this.setState({email:event.target.value})}}  class="form-control" placeholder="Email"/>
  </div>
  </div>
  <div class="row">
    <div class="col">
      <input type="text" class="form-control"  onChange={(event)=>{this.setState({phoneno:event.target.value})}}  value={this.state.phoneno} placeholder="Phone Number"/>
    </div>
    <div class="col">
      <input type="text" class="form-control"  onChange={(event)=>{this.setState({password:event.target.value})}}  value={this.state.password} placeholder="Password"/>
    </div>
  </div>
  <div>
      <button> Create Employee</button>
  </div>
</form>
            
        )
    }
}

export default CreateAccount

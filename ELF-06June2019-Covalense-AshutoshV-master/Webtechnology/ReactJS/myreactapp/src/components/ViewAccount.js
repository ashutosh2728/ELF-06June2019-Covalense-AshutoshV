import React, { Component } from 'react'
import Axios from 'axios';

export class ViewAccount extends Component {
  constructor(props){
    super(props)
    this.state={
      accounts :[]
    }
  }
  componentDidMount() {
      Axios.get('https://emp-web-3cc10.firebaseio.com/accounts.json').then((response)=>{
        console.log('Response Data',response.data);
        let fetchedAccounts =[];
        for(let key in response.data) {
          fetchedAccounts.push({
            ...response.data[key],
            id:key
          })
        }
        console.log('fetched Accounts',fetchedAccounts);
      }).catch(error=>{
        console.log('error',error);
      })
  }

  
    render() {
        return (
            <div>
                <table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">PhoneNo</th>
      <th scope="col">Password</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
   
  </tbody>
</table>
            </div>
        )
    }
}

export default ViewAccount

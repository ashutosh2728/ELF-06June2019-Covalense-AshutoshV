import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'

export class DeallocateBook extends Component {
    constructor(props){
        super(props)
   
        }
    openUser(event){
        this.props.history.push('/AddBook');
        this.props.history.push('/DeleteBook');
        this.props.history.push('/AllocateBook');
        this.props.history.push('/DeallocateBook');
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
      <a class="navbar-brand" href="#">Home</a>
    </div>
    <ul class="nav navbar-nav">
      
    <li><Link to="/AddBook">Add Book</Link></li>
      <li><Link to="/DeleteBook">Delete Book</Link></li>
      <li><Link to="AllocateBook">Allocate Book</Link></li>
      <li><Link to="/DeallocateBook">Deallocate Book</Link></li>
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
                                    <label class="col-md-4 control-label">User ID</label>
                                    <div class="col-md-4 inputGroupContainer">
                                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="userId" name="userId" placeholder="user id" class="form-control" required="true" value="" type="number"/></div>
                                    </div>
                                 </div>
                       <div class="form-group">
                                        <label class="col-md-4 control-label">Book ID</label>
                                        <div class="col-md-4 inputGroupContainer">
                                           <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="bookId" name="bookId" placeholder="Book Id" class="form-control" required="true" value="" type="number"/></div>
                             </div>
                          </div>
                       <div class="form-group">
                            <label class="col-md-4 control-label">Date Of Return</label>
                              <div class="col-md-4 inputGroupContainer">
                               <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span><input id="returnDate" name="returnDate" placeholder="Date of Return" class="form-control" required="true" value="" type="date"/></div>
                            </div>
                          </div>
                          <div class="form-group">
                                <label class="col-md-4 control-label">Fine</label>
                                <div class="col-md-4 inputGroupContainer">
                                   <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-usd"></i></span><input id="fine" name="fine" placeholder="fine" class="form-control" required="true" value="" type="number"/></div>
                     </div>
                  </div>
                       
                     <div class="col-md-3 col-md-offset-4"  >  
                     <button type="submit"  value="Submit"class="btn btn-lg btn-primary">Submit</button>
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

export default DeallocateBook

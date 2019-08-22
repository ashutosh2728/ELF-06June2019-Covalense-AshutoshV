import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'

export class AddBook extends Component {
    constructor(props){
        super(props)
        this.state={
           bookId : '',
           bookName : '',
           author : '',
           publications : '',
           category : '',
           noOfCopies : '',
           avbNoOfCopies : ''
        }
        this.postAddData = this.postAddData.bind(this);
        }
        logoutApp(event) {
            event.preventDefault();
                    this.props.history.push('/'); // redirect to home page
                }

    openUser(event){
        this.props.history.push('/AddBook');
        this.props.history.push('/DeleteBook');
        this.props.history.push('/AllocateBook');
        this.props.history.push('/DeallocateBook');
    }
    postAddData(event) {
      event.preventDefault();
     // const accountData = this.state;
  const {bookId,bookName,author,publications,category,noOfCopies,avbNoOfCopies} = this.state;
      const loginData = {bookId,bookName,author,publications,category,noOfCopies,avbNoOfCopies};
      console.log("Account data",loginData);
          //Call the API using Axios and Validate the Employee Login
          Axios.post('http://localhost:8030/createBook',loginData).then((response)=>{

              console.log(response.data);
              console.log(response.data.statusCode)
              this.props.history.push('/LibrarianHomePage');
              
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
      <a class="navbar-brand" href="#">Home</a>
    </div>
    <ul class="nav navbar-nav">
      
    <li><Link to="/AddBook">Add Book</Link></li>
      <li><Link to="/DeleteBook">Delete Book</Link></li>
      <li><Link to="/AllocateBook">Allocate Book</Link></li>
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
    <ul class="nav navbar-nav">
    <li><a href="<%=baseURL%>/logout"onClick={this.logoutApp.bind(this)}>Logout</a></li>
      </ul>
  </div>
</nav>
<table class="table table-striped">
        <tbody>
           <tr>
              <td colspan="1">
                 <form class="well form-horizontal" onSubmit={this.postAddData}>
                    <fieldset>
                 <div class="form-group">
                         <label class="col-md-4 control-label">Book ID</label>
                           <div class="col-md-4 inputGroupContainer">
                            <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="bookId" onChange={(event)=>{this.setState({bookId:event.target.value})}} value={this.state.bookId} name="bookId" placeholder="Book ID" class="form-control" required="true"  type="text"/></div>
                         </div>
                       </div>
                       <div class="form-group">
                          <label class="col-md-4 control-label">Book Name</label>
                          <div class="col-md-4 inputGroupContainer">
                             <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="bookName" name="bookName" onChange={(event)=>{this.setState({bookName:event.target.value})}} value={this.state.bookName} placeholder="Book Name" class="form-control" required="true" type="text"/></div>
                          </div>
                       </div>
                       <div class="form-group">
                        <label class="col-md-4 control-label">Category</label>
                        <div class="col-md-4 inputGroupContainer">
                           <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="category" name="category" onChange={(event)=>{this.setState({category:event.target.value})}} value={this.state.category} placeholder="Category" class="form-control" required="true"  type="text"/></div>
                        </div>
                    </div>
                    <div class="form-group">
                            <label class="col-md-4 control-label">Author</label>
                            <div class="col-md-4 inputGroupContainer">
                               <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="author" name="author" onChange={(event)=>{this.setState({author:event.target.value})}} value={this.state.author} placeholder="Author" class="form-control" required="true"  type="text"/></div>
                            </div>
                        </div>
                        <div class="form-group">
                                <label class="col-md-4 control-label">Publications</label>
                                <div class="col-md-4 inputGroupContainer">
                                   <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="publications" name="publications" onChange={(event)=>{this.setState({publications:event.target.value})}} value={this.state.publications} placeholder="publications" class="form-control" required="true" type="text"/></div>
                                </div>
                            </div>
                            <div class="form-group">
                                    <label class="col-md-4 control-label">Total Number Of Books</label>
                                    <div class="col-md-4 inputGroupContainer">
                                       <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="noOfCopies" name="noOfCopies"  onChange={(event)=>{this.setState({noOfCopies:event.target.value})}} value={this.state.noOfCopies} placeholder="No Of Copies" class="form-control" required="true"  type="text"/></div>
                                    </div>
                                </div>
                                <div class="form-group">
                                        <label class="col-md-4 control-label">Available No Of Books </label>
                                        <div class="col-md-4 inputGroupContainer">
                                           <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span><input id="avbNoOfCopies" name="avbNoOfCopies" onChange={(event)=>{this.setState({avbNoOfCopies:event.target.value})}} value={this.state.avbNoOfCopies} placeholder="Available Copies" class="form-control" required="true" type="text"/></div>
                                        </div>
                                    </div>
                    
                     <div class="col-md-3 col-md-offset-4"  >  
                     <button type="submit"  value="Submit"class="btn btn-lg btn-primary">Submit</button>
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

export default AddBook

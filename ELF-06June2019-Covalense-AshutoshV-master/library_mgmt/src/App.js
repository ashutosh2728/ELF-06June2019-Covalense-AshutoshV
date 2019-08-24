import React from 'react';
import logo from './logo.svg';

import Login from './components/Login';
import './components/Login.css'
import Navbar from './components/Admin/Navbar'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import AddUser from './components/Admin/AddUser'
import DeleteUser from './components/Admin/DeleteUser'
import UpdateUser from './components/Admin/UpdateUser'
import LibrarianHomePage from './components/Librarian/LibrarianHomePage'
import AddBook from './components/Librarian/AddBook'
import DeleteBook from './components/Librarian/DeleteBook'
import AllocateBook from './components/Librarian/AllocateBook'
import DeallocateBook from './components/Librarian/DeallocateBook'
import ViewData from './components/Admin/ViewData'
function App() {
  return (
    <Router>
        <Route exact path='/' component={Login}></Route>
       <Route  path='/Navbar' component={Navbar}></Route>
       <Route  path='/AddUser' component={AddUser}></Route>
       <Route  path='/DeleteUser' component={DeleteUser}></Route>
       <Route  path='/UpdateUser' component={UpdateUser}></Route>
       <Route  path='/LibrarianHomePage' component={LibrarianHomePage}></Route>
       <Route   path='/AddBook' component={AddBook}></Route>
       <Route  path='/DeleteBook' component={DeleteBook}></Route>
       <Route  path='/AllocateBook' component={AllocateBook}></Route>
       <Route  path='/DeallocateBook' component={DeallocateBook}></Route>
       <Route  path='/ViewData' component={ViewData}></Route>
     </Router>
  );
}

export default App;

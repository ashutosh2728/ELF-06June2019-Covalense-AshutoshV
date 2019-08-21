import React from 'react';
import logo from './logo.svg';

import Login from './components/Login';
import './components/Login.css'
import Navbar from './components/Admin/Navbar'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import AddUser from './components/Admin/AddUser'
import DeleteUser from './components/Admin/DeleteUser'
import UpdateUser from './components/Admin/UpdateUser'
function App() {
  return (
    <Router>
        <Route exact path='/' component={Login}></Route>
       <Route  path='/Navbar' component={Navbar}></Route>
       <Route  path='/AddUser' component={AddUser}></Route>
       <Route  path='/DeleteUser' component={DeleteUser}></Route>
       <Route  path='/UpdateUser' component={UpdateUser}></Route>
     </Router>
  );
}

export default App;

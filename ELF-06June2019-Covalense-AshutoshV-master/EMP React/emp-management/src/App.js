import React from 'react';
import Login from './components/login/Login'
import CreateAccount from './components/createAccount/createAccount'
import './components/login/Login.css'
import './components/createAccount/Info.css'
import './components/createAccount/OtherInfo.css'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

function App() {
    return(
  <Router>
        <Route exact path='/' component={Login}></Route>
       <Route path='/CreateAccount' component={CreateAccount}></Route>
     </Router>
    );
}

export default App;
import React from 'react';
import ReactDOM from 'react-dom';

import * as serviceWorker from './serviceWorker';
// import User from './components/User';
// import Home from './components/Home';
// import UserDetails from './components/UserDetails';
//import {Route, Link , BrowserRouter} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import App from './App';


// const routing = (
//     <BrowserRouter>
//     <ul>
//         <li>
//           <Link to='/'>Home</Link>  
//         </li>
//         <li>
//           <Link to='/user'>User</Link>  
//         </li>
//         <li>
//           <Link href='/userDetails'>UserDetails</Link>  
//         </li>
//     </ul>
//     <div>
//         <Route exact path ="/" component={Home}/>
//         <Route  path ="/user" component={User}/>
//         <Route  path ="/userDetails" component={UserDetails}/>
//     </div>
//     </BrowserRouter>
// )
ReactDOM.render(

<App/>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();

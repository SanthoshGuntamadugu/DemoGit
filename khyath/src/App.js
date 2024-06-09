import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import { Routes, Route, Navigate, BrowserRouter, Router } from 'react-router-dom';
import Login2 from './Task2/Login2';
import Home from './Task2/Home';

import Navbar from './Components/Navbar';
import Header from './Components/Header';
import Login1 from './Components/Login1';
 
import Footer from './Components/Footer'
 function App() {
//   return (
//     <div>
//       <Header/>
//       <Navbar/>
//          <Login1/>
//          <Footer/>
//     </div>
//   );
//  };
// const App = () => {
//   const [token, setToken] = useState(localStorage.getItem('token'));

//   const handleLogin = (token) => {
//       localStorage.setItem('token', token);
//       setToken(token);
//   };

//   const handleLogout = () => {
//       localStorage.removeItem('token');
//       setToken(null);
//   };
// };
//............................................................................
  return (
    <div className='App mt-3'>
      <Routes>
          <Route
              path="/login2"
              element={!token ? <Login2 onLogin={handleLogin} /> : <Navigate to="/" />}
          />
          <Route
              path="/"
              element={token ? <Home onLogout={handleLogout} /> : <Navigate to="/login2" />}
          />
      </Routes>
      </div>
  );
 };
export default App;

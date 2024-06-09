import React from 'react';

const Navbar = () => {
  return (
    <div>
    <nav className='navbar navbar-expand bg-warning'>
      <ul className='navbar-nav ms-auto'>
        <li className='nav-item'><button className='btn btn-primary'>Home</button></li>
        <li className='nav-item'><button className='btn btn-primary mx-2'>Login</button></li>
        
      </ul>
    </nav>
    </div>
  );
};

export default Navbar;

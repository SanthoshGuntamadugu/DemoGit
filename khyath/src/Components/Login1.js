import React from 'react'

const Login1 = () => {
     
        return (
            <div>
                         
        <div className='d-flex justify-content-center flex-column align-items-center'>
          <h2>Login</h2>
          <form>
            <input
              type="email"
              placeholder="Username"
              /> <br/><br/>
            <input
              type="password"
              placeholder="Password"
              /> <br/><br/>
            <button type="submit">Login</button><br/><br/>
          </form>
        </div>
        </div>
      )
    }

export default Login1
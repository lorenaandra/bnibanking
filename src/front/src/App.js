import React from 'react'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import './App.css'
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'

import Login from './components/login.component'
import SignUp from './components/signup.component'
import Cards from './components/cards.component'
import Transfer from './components/transfer.components'
import SavingsAccount from './components/createSavingsAcc.components'

function App() {
  return (
    <Router>
      <div className="App">
        <nav className="navbar navbar-expand-lg navbar-light fixed-top">
          <div className="container">
            
            <div className="logo-image">
              <img src = "logoBNI.png" className="img-fluid"></img>
            </div>

            <span className="navbar-brand">
              BNI Banking
            </span>

            <div className="collapse navbar-collapse" id="navbarTogglerDemo02">
              <ul className="navbar-nav ml-auto">
                <li className="nav-item">
                  <Link className="nav-link" to={'/sign-in'}>
                    Sign in
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={'/sign-up'}>
                    Sign up
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={'/transfer'}>
                    Create transfer
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={'/cards'}>
                    Cards
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={'/sAccount'}>
                    Create savings account
                  </Link>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <div className="auth-wrapper">
          <div className="auth-inner">
            <Routes>
              <Route exact path="/" element={<Login />} />
              <Route path="/sign-in" element={<Login />} />
              <Route path="/sign-up" element={<SignUp />} />
              <Route path="/transfer" element={<Transfer />} />
              <Route path="/cards" element={<Cards />} />
              <Route path="/sAccount" element={<SavingsAccount />} />
            </Routes>
          </div>
        </div>
      </div>
    </Router>
  )
}

export default App

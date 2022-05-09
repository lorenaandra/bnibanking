import React, { Component } from 'react'

export default class SignUp extends Component {
  
  state = {
    firstName: '',
    lastName: '',
    email: '',
    password: ''
  };

  handleSubmit = (e) => {
    e.preventDefault();
    console.log(e.target[0].value); //fName
    console.log(e.target[1].value); //lName
    console.log(e.target[2].value); //email
    console.log(e.target[3].value); //password
    // this.state.email = e.target[0].value;
    // this.state.password = e.target[1].value;
    // console.log(this.state.email);
    // console.log(this.state.password);
  }
  
  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <h3>Sign Up</h3>

        <div className="mb-3">
          <label>First name</label>
          <input
            type="text"
            value={this.state.value}
            className="form-control"
            placeholder="First name"
          />
        </div>

        <div className="mb-3">
          <label>Last name</label>
          <input
          type="text"
          value={this.state.value}
          className="form-control"
          placeholder="Last name" />
        </div>

        <div className="mb-3">
          <label>Email address</label>
          <input
            type="email"
            value={this.state.value}
            className="form-control"
            placeholder="Enter email"
          />
        </div>

        <div className="mb-3">
          <label>Password</label>
          <input
            type="password"
            value={this.state.value}
            className="form-control"
            placeholder="Enter password"
          />
        </div>

        <div className="d-grid">
          <button type="submit" className="btn btn-primary">
            Sign Up
          </button>
        </div>
        <p className="forgot-password text-right">
          Already registered <a href="/sign-in">sign in?</a>
        </p>
      </form>
    )
  }
}

import React, { Component } from 'react'

export default class Cards extends Component {

  state = {
    email: '',
    password: ''
  };

  handleSubmit = (e) => {
    e.preventDefault();
    // console.log(this.state.value);
    // console.log(this.stateP.value);
    //console.log(e);
    this.state.email = e.target[0].value;
    this.state.password = e.target[1].value;
    console.log(this.state.email);
    console.log(this.state.password);
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <h3>Sign In</h3>

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
            Submit
          </button>
        </div>

        <p className="forgot-password text-right">
          Do you want to <a href="/sign-up">sign up?</a>
        </p>

      </form>
    )
  }
 
}

//export default Login;

import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 5
    };
    this.handleWelcome = this.handleWelcome.bind(this);
  }

  handleIncrement = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  };

  handleDecrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  handleWelcome(message) {
    alert("Hello! " + message);
  }

  handleClick = (event) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        <h2>{this.state.count}</h2>

        <button onClick={this.handleIncrement}>Increment</button>
        <button onClick={this.handleDecrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.handleWelcome("Welcome!!")}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>

        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;

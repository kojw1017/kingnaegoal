import React, {useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';

function App() { 
  const [message, setMessage] = useState([]);
  useEffect(() => { 
  fetch("/hello").then((response) => { 
    return response.json(); 
  }).then(function (data) { 
    setMessage(data); 
  }); }, []); return ( 
  <div className="App"> 
    <header className="App-header"> 
      <img src={logo} className="App-logo" alt="logo"/> 
      <p> Edidt <code>src/App.js</code> and save to reload. </p>
      <a className="App-link" href="https://reactjs.org" target="_blank" rel="noopener noreferrer" > Learn React </a> 
      <ul>{message.map((text, index) => <li>{text}</li>)}</ul> 
    </header> 
   </div> 
  ); } export default App;
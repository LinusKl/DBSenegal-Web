import React, { Component } from 'react';
import './App.css';
import PatientsList from './components/PatientsList.js';
import AddPatient from './components/AddPatient.js';
import LoginPage from './components/LoginPage.js';
import { BrowserRouter, Route, Link } from 'react-router-dom';

class App extends Component {


  render() {

    return (
      <div className="App">
        <BrowserRouter>
          <div>
            <header className="App-header">
              <p>DB Senegal</p>
              <Link to='/patients-list'> Patients </Link>
              <Link to='/patient-modify'> Modify </Link>
              <Link to='/'> Login </Link>
            </header>
            <div>
                <div>
                  <Route exact path='/' component={LoginPage} />
                  <Route exact path='/patients-list' component={PatientsList}/>
                  <Route exact path='/patient-modify' component={AddPatient} />
                </div>
            </div>
          </div>
        </BrowserRouter>
      </div>
    );
  }
}




export default App;

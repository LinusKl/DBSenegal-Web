import React, { Component } from 'react';
import './App.css';
import PatientsList from './components/PatientsList.js';
import DoctorsList from './components/DoctorsList.js';
import NursesList from './components/NursesList.js';
import VillagesList from './components/VillagesList.js';
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
              <ul>
                <li>
                  <Link className="homeLink" to='/'> DB Senegal </Link>
                </li>
                <li>
                  <Link className="headerLink" to='/patients-list'> Patients </Link>
                </li>
                <li>
                  <Link className="headerLink" to='/doctors-list'> Doctors </Link>
                </li>
                <li>
                  <Link className="headerLink" to='/nurses-list'> Nurses </Link>
                </li>
                <li>
                  <Link className="headerLink" to='/villages-list'> Villages </Link>
                </li>
              </ul>
            </header>
            <div>
                <div>
                  <Route exact path='/' component={LoginPage} />
                  <Route exact path='/patients-list' component={PatientsList}/>
                  <Route exact path='/doctors-list' component={DoctorsList} />
                  <Route exact path='/nurses-list' component={NursesList} />
                  <Route exact path='/villages-list' component={VillagesList} />
                </div>
            </div>
          </div>
        </BrowserRouter>
      </div>
    );
  }
}




export default App;

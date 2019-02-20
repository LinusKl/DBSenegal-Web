import React, { Component } from 'react';
import './App.css';
import PatientsList from './components/PatientsList.js';
import AddPatient from './components/AddPatient.js';

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      patients: null,
      isLoading: true
    }
  }

  componentDidMount(){
    this.setState({isLoading: true});

    fetch('http://localhost:8080/patient-list')
    .then(response => response.json())
    .then(data => this.setState({patients: data, isLoading: false}));
  }

  render() {

    const{patients, isLoading} = this.state;

    if(isLoading) {
      return (
        <div className="App">
          <header className="App-header">
            <p>Loading...</p>
          </header>
        </div>
      );
    }

    return (
      <div className="App">
        <header className="App-header">
          <p>DB Senegal</p>

        </header>
        <div>
          <PatientsList patients={patients}/>
          <AddPatient />
        </div>
      </div>
    );
  }
}




export default App;

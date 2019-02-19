import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

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
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <p>DB Senegal</p>
        </header>
        <div>

        <table>
          <tr className="headline">
            <td>First Name</td>
            <td>Last Name</td>
            <td>Address</td>
            <td>Birthday</td>
          </tr>
          {patients.map((patient: any) =>
            <tr key={patient.id}>
              <td>{patient.firstName}</td>
              <td>{patient.familyName}</td>
              <td>{patient.address}</td>
              <td>{patient.birthday}</td>
            </tr>
          )}
        </table>
        </div>

      </div>
    );
  }
}









export default App;

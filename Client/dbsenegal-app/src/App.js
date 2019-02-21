import React, { Component } from 'react';
import './App.css';
import PatientsList from './components/PatientsList.js';
import AddPatient from './components/AddPatient.js';
import LoginPage from './components/LoginPage.js';
import { BrowserRouter, Route, Link } from 'react-router-dom';


const Home = (props) => {
  return(
    <div>Home</div>
  )
}
const Settings = (props) => {
  return(
    <div>Settings</div>
  )
}
const About = (props) => {
  return(
    <div>About</div>
  )
}



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
                  <Route exact path='/' compoent={LoginPage} />
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

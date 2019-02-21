import React, {Component} from 'react';


class PatientsList extends Component {

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

    console.log(this.patients);
  }

  render(){

    const{patients, isLoading} = this.state;

    if(this.state.isLoading){
      return (<h3> Loading... </h3>);
    }
    return patientList(patients);
  }

}

function patientList(patients) {
  return(
    <table>
      <tbody>
        <tr className="headline">
          <td>First Name</td>
          <td>Last Name</td>
          <td>Address</td>
          <td>Birthday</td>
        </tr>

        {patients.map((patient) =>
        <tr key={patient.id}>
          <td>{patient.firstName}</td>
          <td>{patient.familyName}</td>
          <td>{patient.address}</td>
          <td>{patient.birthday}</td>
        </tr>
        )}

      </tbody>
    </table>
  );
}

export default PatientsList;

import React, {Component} from 'react';


class PatientsList extends Component {

  render(){
    {console.log(this.props.patients)}
    return patientList(this.props);
  }

}


function patientList(props) {

  return(
    <table>
      <tbody>
        <tr className="headline">
          <td>First Name</td>
          <td>Last Name</td>
          <td>Address</td>
          <td>Birthday</td>
        </tr>

        {props.patients.map((patient) =>
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

function patientListShort(props) {

  return(
    <table>
      <tbody>
        <tr className="headline">
          <td>First Name</td>
          <td>Last Name</td>
        </tr>

        {props.patients.map((patient) =>
        <tr key={patient.id}>
          <td>{patient.firstName}</td>
          <td>{patient.familyName}</td>
        </tr>
        )}

      </tbody>
    </table>
  );
}

export default PatientsList;

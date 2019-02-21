import React, {Component} from 'react';


class DoctorsList extends Component {

  constructor(props) {
    super(props);

    this.state = {
      doctors: null,
      isLoading: true
    }

  }


  componentDidMount(){
    this.setState({isLoading: true});

    fetch('http://localhost:8080/doctors-list')
    .then(response => response.json())
    .then(data => this.setState({doctors: data, isLoading: false}));
  }

  render(){

    const{doctors, isLoading} = this.state;

    if(this.state.isLoading){
      return (<h3> Loading... </h3>);
    }
    return doctorsList(doctors);
  }

}

function doctorsList(doctors) {
  return(
    <table>
      <tbody>
        <tr className="headline">
          <td>First Name</td>
          <td>Last Name</td>
          <td>Password</td>
          <td>Last Access</td>
        </tr>

        {doctors.map((doctors) =>
        <tr key={doctors.id}>
          <td>{doctors.firstName}</td>
          <td>{doctors.familyName}</td>
          <td>{doctors.password}</td>
          <td>{doctors.lastAccess}</td>
        </tr>
        )}

      </tbody>
    </table>
  );
}

export default DoctorsList;

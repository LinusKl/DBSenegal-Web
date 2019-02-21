import React, {Component} from 'react';


class NursesList extends Component {

  constructor(props) {
    super(props);

    this.state = {
      nurses: null,
      isLoading: true
    }

  }


  componentDidMount(){
    this.setState({isLoading: true});

    fetch('http://localhost:8080/nurses-list')
    .then(response => response.json())
    .then(data => this.setState({nurses: data, isLoading: false}));
  }

  render(){

    const{nurses, isLoading} = this.state;

    if(this.state.isLoading){
      return (<h3> Loading... </h3>);
    }
    return nursesList(nurses);
  }

}

function nursesList(nurses) {
  return(
    <table>
      <tbody>
        <tr className="headline">
          <td>First Name</td>
          <td>Last Name</td>
          <td>Discretion Contract</td>
        </tr>

        {nurses.map((nurses) =>
        <tr key={nurses.id}>
          <td>{nurses.firstName}</td>
          <td>{nurses.familyName}</td>
          <td>{nurses.discretionContract}</td>
        </tr>
        )}

      </tbody>
    </table>
  );
}

export default NursesList;

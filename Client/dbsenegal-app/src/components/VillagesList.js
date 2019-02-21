import React, {Component} from 'react';


class VillagesList extends Component {

  constructor(props) {
    super(props);

    this.state = {
      villages: null,
      isLoading: true
    }

  }


  componentDidMount(){
    this.setState({isLoading: true});

    fetch('http://localhost:8080/villages-list')
    .then(response => response.json())
    .then(data => this.setState({villages: data, isLoading: false}));
  }

  render(){

    const{villages, isLoading} = this.state;

    if(this.state.isLoading){
      return (<h3> Loading... </h3>);
    }
    return villagesList(villages);
  }

}

function villagesList(villages) {
  return(
    <table>
      <tbody>
        <tr className="headline">
          <td>Village Name</td>
          <td>GPS Data</td>
          <td>Common Illness</td>
          <td>Last Visit</td>
        </tr>

        {villages.map((village) =>
        <tr key={village.name}>
          <td>{village.name}</td>
          <td>{village.gpsData}</td>
          <td>{village.commonIllness}</td>
          <td>{village.lastVisit}</td>
        </tr>
        )}

      </tbody>
    </table>
  );
}

export default VillagesList;

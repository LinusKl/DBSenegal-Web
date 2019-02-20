import React, {Component} from 'react';

class AppPatient extends Component {

  constructor(props){
    super(props);

    this.state = {
      firstName: '',
      familyName: '',
      address: '',
      birthday: '',
      email: '',
      telephoneNumber: '',
      others: ''
    };

    this.handleFirstNameChange = this.handleFirstNameChange.bind(this);
    this.handleFamilyNameChange = this.handleFamilyNameChange.bind(this);
    this.handleAddressChange = this.handleAddressChange.bind(this);
    this.handleBirthdayChange = this.handleBirthdayChange.bind(this);
    this.handleEmailChange = this.handleEmailChange.bind(this);
    this.handleTelephoneNumberChange = this.handleTelephoneNumberChange.bind(this);
    this.handleOthersChange = this.handleOthersChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }


  handleFirstNameChange (e){
    this.setState({firstName: e.target.value});
  }
  handleFamilyNameChange (e){
    this.setState({familyName: e.target.value});
  }
  handleAddressChange (e){
    this.setState({address: e.target.value});
  }
  handleBirthdayChange (e){
    this.setState({birthday: e.target.value});
  }
  handleEmailChange (e){
    this.setState({email: e.target.value});
  }
  handleTelephoneNumberChange (e){
    this.setState({telephoneNumber: e.target.value});
  }
  handleOthersChange (e){
    this.setState({others: e.target.value});
  }


  handleSubmit(e){
    fetch('http://localhost:8080/save-patient', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({
          "firstName": this.state.firstName,
          "familyName": this.state.familyName,
          "address": this.state.address,
          "birthday": this.state.birthday,
          "email": this.state.email,
          "telephoneNumber": this.state.telephoneNumber,
          "others": this.state.others
      })
    });
  }

  render() {
    return(
      <form onSubmit={this.handleSubmit}>
        <label>
          First Name:
          <input type="text" name="firstName" value={this.state.firstName} onChange={this.handleFirstNameChange} />
        </label>
        <label>
          Last Name:
          <input type="text" name="familyName" value={this.state.familyName} onChange={this.handleFamilyNameChange}/>
        </label>
        <label>
          Address:
          <input type="text" name="address" value={this.state.address} onChange={this.handleAddressChange}/>
        </label>
        <label>
          Birthday:
          <input type="text" name="address" value={this.state.birthday} onChange={this.handleBirthdayChange}/>
        </label>
        <label>
          Email:
          <input type="text" name="address" value={this.state.email} onChange={this.handleEmailChange}/>
        </label>
        <label>
          Telephone Number:
          <input type="text" name="address" value={this.state.telephoneNumber} onChange={this.handleTelephoneNumberChange}/>
        </label>
        <label>
          Others:
          <input type="text" name="address" value={this.state.others} onChange={this.handleOthersChange}/>
        </label>

        <button type="submit"> SUBMIT </button>
      </form>
    );
  }






}





export default AppPatient;

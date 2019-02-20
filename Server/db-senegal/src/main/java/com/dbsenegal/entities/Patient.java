package com.dbsenegal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	/*
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	*/
	@Id
	@Column(name="PatientID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="birthday")
	private String birthday;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;

	@Column(name="telephone_number")
	private String telephoneNumber;
	
	@Column(name="others")
	private String others;

	
	
	public Patient() {};
	
	
	
	public Patient(String familyName, String firstName, String birthday, String address, String email,
			String telephoneNumber, String others) {
		super();
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.telephoneNumber = telephoneNumber;
		this.others = others;
		
		System.out.println("created new Patient");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.familyName + " - " + this.address + "; " + this.telephoneNumber + "; " + this.birthday + "; " + this.email;
	}
	
	
	
}

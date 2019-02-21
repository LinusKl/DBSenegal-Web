package com.dbsenegal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nurse")
public class Nurse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NurseID")
	private int id;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="discretion_contract")
	private short discretionContract;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public short getDiscretionContract() {
		return discretionContract;
	}

	public void setDiscretionContract(short discretionContract) {
		this.discretionContract = discretionContract;
	}

	@Override
	public String toString() {
		return "Nurse [id=" + id + ", familyName=" + familyName + ", firstName=" + firstName + ", discretionContract="
				+ discretionContract + "]";
	}
	
	

}

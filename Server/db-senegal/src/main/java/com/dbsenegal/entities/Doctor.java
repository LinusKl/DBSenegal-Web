package com.dbsenegal.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DoctorID")
	private int id;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="last_access")
	private Timestamp lastAccess;

	
	

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(Timestamp lastAccess) {
		this.lastAccess = lastAccess;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", familyName=" + familyName + ", firstName=" + firstName + ", password=" + password
				+ ", lastAccess=" + lastAccess + "]";
	}
	

}

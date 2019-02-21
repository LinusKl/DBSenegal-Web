package com.dbsenegal.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vilalge")
public class Village {
	
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="GPS_data")
	private String gpsData;
	
	@Column(name="common_illness")
	private String commonIllness;
	
	@Column(name="last_visit")
	private Timestamp lastVisit;

}

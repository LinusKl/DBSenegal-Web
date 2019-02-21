package com.dbsenegal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbsenegal.entities.Patient;
import com.dbsenegal.services.PatientService;

@RestController
public class PatientController {


	@Autowired
	private PatientService patientService;
	
	
	
	@GetMapping("/patient-list")
	@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
	public List<Patient> retrievePatientList() {
		return patientService.findAllPatients();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/save-patient")
	@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
	public void addPatient(@RequestBody Patient patient) {
		patientService.savePatient(patient);
	}
	
}


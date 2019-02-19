package com.dbsenegal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbsenegal.entities.Patient;
import com.dbsenegal.services.PatientService;

@RestController
public class PatientController {

	Logger logger = LoggerFactory.getLogger(RestController.class);

	@Autowired
	private PatientService patientService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/patient-list")
	public List<Patient> retrievePatientList() {
		logger.info("request to retrieve Patient List");
		
		System.out.println("Request to retrieve patient list");
		
		
		return patientService.findAllPatients();
	}
	
}

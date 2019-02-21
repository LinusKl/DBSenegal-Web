package com.dbsenegal.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbsenegal.entities.Patient;
import com.dbsenegal.repositories.PatientRepository;

@Service
@Transactional
public class PatientService {

	private final PatientRepository patientRepository;
	
	//Constructor
	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	//Save
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	//Get All
	public List<Patient> findAllPatients() {
		return (List<Patient>)patientRepository.findAll();
	}
}

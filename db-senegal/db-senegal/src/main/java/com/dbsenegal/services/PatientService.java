package com.dbsenegal.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbsenegal.entities.Patient;
import com.dbsenegal.repositories.PatientRepository;


@Service
@Transactional
public class PatientService {

	private final PatientRepository patientRepository;
	
	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	public void savePatient(Patient patient) {
		patientRepository.save(patient);
	}
}

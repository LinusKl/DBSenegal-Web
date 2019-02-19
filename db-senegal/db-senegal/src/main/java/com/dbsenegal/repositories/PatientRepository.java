package com.dbsenegal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbsenegal.entities.Patient;


public interface PatientRepository extends CrudRepository<Patient, Integer> {

	
	
}

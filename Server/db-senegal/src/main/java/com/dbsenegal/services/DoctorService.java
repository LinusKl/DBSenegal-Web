package com.dbsenegal.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbsenegal.entities.Doctor;
import com.dbsenegal.repositories.DoctorRepository;

@Service
@Transactional
public class DoctorService {

	private final DoctorRepository doctorRepository;
	
	//Constructor
	public DoctorService(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
	
	//Save
	public Doctor saveDoctor(Doctor doctor) {
		return this.doctorRepository.save(doctor);
	}
	
	//Get All
	public List<Doctor> findAllDoctors() {
		return (List<Doctor>) this.doctorRepository.findAll();
	}
	
	
}

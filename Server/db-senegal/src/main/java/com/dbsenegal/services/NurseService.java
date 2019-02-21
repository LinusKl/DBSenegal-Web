package com.dbsenegal.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbsenegal.entities.Nurse;
import com.dbsenegal.repositories.NurseRepository;

@Service
@Transactional
public class NurseService {

	private final NurseRepository nurseRepository;
	
	//Constructor
	public NurseService(NurseRepository nurseRepository) {
		this.nurseRepository = nurseRepository;
	}
	
	//Save
	public Nurse saveNurse(Nurse nurse) {
		return this.nurseRepository.save(nurse);
	}
	
	//Get All
	public List<Nurse> findAllNurses() {
		return (List<Nurse>) this.nurseRepository.findAll();
	}
	
}

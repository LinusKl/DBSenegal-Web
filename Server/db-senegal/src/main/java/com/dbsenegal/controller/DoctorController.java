package com.dbsenegal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbsenegal.entities.Doctor;
import com.dbsenegal.services.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/doctors-list")
	@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
	public List<Doctor> retrieveDoctorsList(){
		return this.doctorService.findAllDoctors();
	}
	
	@PostMapping("/save-doctor")
	@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return this.doctorService.saveDoctor(doctor);
	}
	
	
	
}

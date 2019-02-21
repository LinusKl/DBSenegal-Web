package com.dbsenegal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbsenegal.services.NurseService;
import com.dbsenegal.entities.Nurse;

@RestController
public class NurseController {
	
	@Autowired
	private NurseService nurseService;

	@GetMapping("/nurses-list")
	@CrossOrigin(origins={"http://localhost:3000", "http://localhost:5000"})
	public List<Nurse> retrieveNursesList(){
		return this.nurseService.findAllNurses();
	}
	
	@PostMapping("/save-nurse")
	@CrossOrigin(origins={"http://localhost:3000", "http://localhost:5000"})
	public Nurse addNurse(@RequestBody Nurse nurse) {
		return this.nurseService.saveNurse(nurse);
	}

}

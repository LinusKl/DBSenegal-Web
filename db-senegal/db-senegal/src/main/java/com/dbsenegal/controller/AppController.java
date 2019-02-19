package com.dbsenegal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbsenegal.entities.Patient;
import com.dbsenegal.services.PatientService;

@Controller
public class AppController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/save-patient")
	public String savePatient(@RequestParam String address, @RequestParam String birthday, @RequestParam String email,@RequestParam String familyName,@RequestParam String firstName,@RequestParam String others,@RequestParam String telephoneNumber ) {
		Patient patient = new Patient(familyName, firstName, birthday, address, email, telephoneNumber, others);
		patientService.savePatient(patient);
		
		return "patientSaved";
	}
	
	@GetMapping("/add-patient")
	public String addPatient() {
		return "patientAdd";
	}
	
	//Test URL
	//localhost:8080/save-patient?address=hoshof&birthday=2018-24-01&email=abc&familyName=kev&firstName=in&others=asudfga&telephoneNumber=512451
	

	
	
	
	
}

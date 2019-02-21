package com.dbsenegal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbsenegal.services.VillageService;
import com.dbsenegal.entities.Village;

@RestController
public class VillageController {

	@Autowired
	private VillageService villageService;
	
	@GetMapping("villages-list")
	@CrossOrigin(origins={"http://localhost:3000", "http://localhost:5000"})
	public List<Village> retrieveVillagesList(){
		return this.villageService.findAllVillages();
	}
	
	@PostMapping("save-village")
	@CrossOrigin(origins={"http://localhost:3000", "http://localhost:5000"})
	public Village addVillage(@RequestBody Village village) {
		return this.villageService.saveVillage(village);
	}
	
}

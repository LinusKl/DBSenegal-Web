package com.dbsenegal.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbsenegal.repositories.VillageRepository;
import com.dbsenegal.entities.Village;

@Service
@Transactional
public class VillageService {
	
	private final VillageRepository villageRepository;
	
	//Constructor
	public VillageService(VillageRepository villageRepository) {
		this.villageRepository = villageRepository;
	}
	
	//Save
	public Village saveVillage(Village village) {
		return this.villageRepository.save(village);
	}
	
	//Get All
	public List<Village> findAllVillages(){
		return (List<Village>) this.villageRepository.findAll();
	}

}

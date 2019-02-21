package com.dbsenegal.repositories;
import org.springframework.data.repository.CrudRepository;

import com.dbsenegal.entities.Doctor;


public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

}

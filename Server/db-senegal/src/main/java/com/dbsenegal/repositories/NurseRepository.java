package com.dbsenegal.repositories;
import org.springframework.data.repository.CrudRepository;

import com.dbsenegal.entities.Nurse;

public interface NurseRepository extends CrudRepository<Nurse, Integer> {

}

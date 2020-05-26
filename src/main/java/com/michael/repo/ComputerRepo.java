package com.michael.repo;

import org.springframework.data.repository.CrudRepository; //(Remember)
import org.springframework.stereotype.Repository;

import com.michael.model.Computer;

@Repository
public interface ComputerRepo extends CrudRepository<Computer,Long>{
	//remember that we need an interface in order to extend the CrudRepository
	
}

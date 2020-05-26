package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.model.Computer;
import com.michael.repo.ComputerRepo;

@Service
public class ComputerService {
	
	@Autowired
	private ComputerRepo comRepo;
	
	
	public void addComputer(Computer c) {
		comRepo.save(c);
	}
	
	public Optional<Computer> getComputerById(long id){
		return comRepo.findById(id);
	}
	
	public List<Computer> getAllComputers(){
		return (List<Computer>) comRepo.findAll();
	}
	
	public void deleteComputerById(long id) {
		 comRepo.deleteById(id);
	}
	
	public void updateComputerInfo(Computer c, long id) {
		c.setId(id);
		comRepo.save(c);
	}

	
	
}

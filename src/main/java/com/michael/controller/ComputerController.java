package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Computer;
import com.michael.service.ComputerService;

@RestController
@RequestMapping("/computer")
public class ComputerController {
	
	@Autowired
	private ComputerService comService;
	
	@PostMapping("/add-computer")
	public void addComputer(@RequestBody Computer com) {
		comService.addComputer(com);
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Computer> getComputerById(@PathVariable long id){
		return comService.getComputerById(id);
	}
	
	@GetMapping("/getAllComputers")
	public List<Computer> getAllComputers(){
		return (List<Computer>)comService.getAllComputers();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteComputerById(@PathVariable long id) {
		comService.deleteComputerById(id);
	}
	
	@PutMapping("/updateInfo/{id}")
	public void updateInfo(@RequestBody Computer c, @PathVariable long id) {
		comService.updateComputerInfo(c, id);
	}
	
	
	
	
	
}

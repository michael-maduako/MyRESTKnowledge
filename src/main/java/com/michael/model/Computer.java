package com.michael.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Computer {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String make;
	private String model;
	private String year;
	
	public Computer() {
		
	}
	

	public Computer(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
	
	
	
	
	
	
	
}

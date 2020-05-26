package com.michael;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.michael.model.Computer;

@SpringBootTest
class MyRestKnowledgeApplicationTests {

	
	@Test
	public void testComputer() {
		
		Computer c=new Computer();
		c.setYear("2110");
		assertEquals("2110", c.getYear());
		
		
		
	}
	
	

}

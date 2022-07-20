package com.emp.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.demoEntity.EmployeeEntity;
import com.emp.demoService.EmployeeService;

@RestController

@RequestMapping(value="/empcon")
public class EmployeeController {
	
	@Autowired
	EmployeeService eservice;
	
	@PostMapping(value="/empsave")
	public ResponseEntity<Object> saveemp(@RequestBody EmployeeEntity emp) {
	EmployeeEntity empData = eservice.saveemp(emp);
	if (empData!= null) {
		return new ResponseEntity<Object>(empData, HttpStatus.CREATED);
	}else {
		return new ResponseEntity<>("Failed to add data",HttpStatus.BAD_REQUEST);
	}
}
}

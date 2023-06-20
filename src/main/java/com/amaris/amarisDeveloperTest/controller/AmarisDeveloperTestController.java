package com.amaris.amarisDeveloperTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amaris.amarisDeveloperTest.model.Employee;
import com.amaris.amarisDeveloperTest.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class AmarisDeveloperTestController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/")
	private ResponseEntity<List<Employee>> getEMployeesList(){
		return ResponseEntity.ok(employeeServiceImpl.getEmployeesList());
	}

	@GetMapping("/{id}")
	private ResponseEntity<Employee> getEMployeeById(@PathVariable String id){
		return ResponseEntity.ok(employeeServiceImpl.getEmployeeById(id));
	}
}

package com.amaris.amarisDeveloperTest.controller;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amaris.amarisDeveloperTest.dto.EmployeeResponseDto;
import com.amaris.amarisDeveloperTest.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class AmarisDeveloperTestController {

	@Autowired
	private EmployeeService employeeServiceImpl;
	
	@GetMapping("/")
	private ResponseEntity<EmployeeResponseDto> getEMployeesList(){
		return ResponseEntity.ok(employeeServiceImpl.getEmployeesList());
	}

	@GetMapping("/{id}")
	private ResponseEntity<EmployeeResponseDto> getEMployeeById(@PathVariable String id){
		return ResponseEntity.ok(employeeServiceImpl.getEmployeeById(id));
	}

}

package com.amaris.amarisDeveloperTest.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaris.amarisDeveloperTest.model.Employee;

public interface EmployeeService  {

	public List<Employee> getEmployeesList();
	
	public Employee getEmployeeById(String id);
}

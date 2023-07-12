package com.amaris.amarisDeveloperTest.ExternalService;

import java.math.BigDecimal;
import java.util.List;

import com.amaris.amarisDeveloperTest.exception.StatusException;
import com.amaris.amarisDeveloperTest.model.Employee;

public interface ExternalService {
	public List<Employee>getEmployeeList() throws StatusException;
	public Employee getEmployeeById(String id) throws StatusException;
}

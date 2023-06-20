package com.amaris.amarisDeveloperTest.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.amaris.amarisDeveloperTest.model.Employee;
import com.amaris.amarisDeveloperTest.model.EmployeeResponse;
import com.amaris.amarisDeveloperTest.model.EmployeesListResponse;
import com.amaris.amarisDeveloperTest.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${amaris.api.url}")
	private String amarisApiUrl;
	

	@Override
	public List<Employee> getEmployeesList() {
		List<Employee> employeesList;
		try {
			
			EmployeesListResponse response = restTemplate.getForObject(amarisApiUrl+"/employees", EmployeesListResponse.class);
			System.out.println("Response fro service :" + response.getData());
			employeesList = response.getData();
		} catch (Exception e) {
			System.err.println("SERVICE ERROR: "+ e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception calling enpoint service",e);
			
		}
		return employeesList;
	}

	@Override
	public Employee getEmployeeById(String id) {
		Employee employee;
		try {
			
			EmployeeResponse response = restTemplate.getForObject(amarisApiUrl+"/employee/"+id, EmployeeResponse.class);
			System.out.println("Response fro service :" + response.getData());
			employee = response.getData();
		} catch (Exception e) {
			System.err.println("SERVICE ERROR: "+ e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception calling enpoint service",e);
			
		}
		return employee;
	}

	
}

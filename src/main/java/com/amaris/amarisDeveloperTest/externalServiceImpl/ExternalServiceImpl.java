package com.amaris.amarisDeveloperTest.externalServiceImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;

import com.amaris.amarisDeveloperTest.ExternalService.ExternalService;
import com.amaris.amarisDeveloperTest.configure.WebProperties;
import com.amaris.amarisDeveloperTest.exception.StatusException;
import com.amaris.amarisDeveloperTest.model.Employee;
import com.amaris.amarisDeveloperTest.model.EmployeeResponse;
import com.amaris.amarisDeveloperTest.model.EmployeesListResponse;

@Service
public class ExternalServiceImpl implements ExternalService {
	
	
	@Autowired
	private WebProperties webProperties;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Employee> getEmployeeList() throws StatusException {
		List<Employee> employeesList = null;
		StatusException statusException = new StatusException();
		try {
		EmployeesListResponse response = restTemplate.getForObject(webProperties.getAmarisApiUrl()+"/employees", EmployeesListResponse.class);	
			employeesList = response.getData();
		} catch (HttpClientErrorException e) {
			switch (e.getStatusCode()) {
			case TOO_MANY_REQUESTS:
				statusException.setStatus("429");
				statusException.setMessage("The service send too many requests");
				break;

			default:
				statusException.setStatus("500");
				statusException.setMessage("Internal server error");
				break;
			}
			System.err.println(statusException.getMessage());
			throw statusException;
			
		}catch (Exception e2) {
			System.err.println(e2.getStackTrace());
			statusException.setStatus("500");
			statusException.setMessage("Internal server error");
			throw statusException;
		}

		return employeesList;
	}

	@Override
	public Employee getEmployeeById(String id) throws StatusException{
		Employee employee = null;
		StatusException statusException = new StatusException();
		try {
			EmployeeResponse response = restTemplate.getForObject(webProperties.getAmarisApiUrl()+"/employee/"+id, EmployeeResponse.class);
			employee = response.getData();
			} catch (HttpClientErrorException e) {
				switch (e.getStatusCode()) {
				case TOO_MANY_REQUESTS:
					statusException.setStatus("429");
					statusException.setMessage("The service send too many requests");
					break;

				default:
					statusException.setStatus("500");
					statusException.setMessage("Internal server error");
					break;
				}
				System.err.println(statusException.getMessage());
				throw statusException;
				
			}catch (Exception e2) {
				System.err.println(e2.getStackTrace());
				statusException.setStatus("500");
				statusException.setMessage("Internal server error");
				throw statusException;
			}
		return employee;
	}
}

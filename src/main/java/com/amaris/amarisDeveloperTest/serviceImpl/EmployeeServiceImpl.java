package com.amaris.amarisDeveloperTest.serviceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.amaris.amarisDeveloperTest.ExternalService.ExternalService;
import com.amaris.amarisDeveloperTest.dto.EmployeeDto;
import com.amaris.amarisDeveloperTest.dto.EmployeeResponseDto;
import com.amaris.amarisDeveloperTest.exception.StatusException;
import com.amaris.amarisDeveloperTest.externalServiceImpl.ExternalServiceImpl;
import com.amaris.amarisDeveloperTest.model.Employee;
import com.amaris.amarisDeveloperTest.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private ExternalServiceImpl externalServiceImpl;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public EmployeeResponseDto getEmployeesList(){
		
		EmployeeResponseDto result = new EmployeeResponseDto();
		
		try {
			List<Employee> employeeList = externalServiceImpl.getEmployeeList();
			List<EmployeeDto> employeeResult = employeeList.stream()
					.map(entity -> modelMapper.map(entity, EmployeeDto.class))
					.collect(Collectors.toList());
			result.setStatus("200");
			result.setData(employeeResult);
			result.setMessage("Success!!");
		} catch (StatusException e) {
			result.setStatus(e.getStatus());
			result.setMessage(e.getMessage());
			
		}
		return result;
	}

	@Override
	public EmployeeResponseDto getEmployeeById(String id){
		
		EmployeeResponseDto result = new EmployeeResponseDto();
		
		try {
			Employee employee = externalServiceImpl.getEmployeeById(id);
			EmployeeDto employeeResult = modelMapper.map(employee, EmployeeDto.class);
			List<EmployeeDto> employeeListResult = new ArrayList<EmployeeDto>();
			employeeListResult.add(employeeResult);
			result.setStatus("200");
			result.setData(employeeListResult);
			result.setMessage("Success!!");
		} catch (StatusException e) {
			result.setStatus(e.getStatus());
			result.setMessage(e.getMessage());
			
		}
		return result;

	}
}

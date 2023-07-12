package com.amaris.amarisDeveloperTest.service;




import com.amaris.amarisDeveloperTest.dto.EmployeeResponseDto;


public interface EmployeeService  {

	public EmployeeResponseDto getEmployeesList();
	
	public EmployeeResponseDto getEmployeeById(String id);
}

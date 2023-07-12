package com.amaris.amarisDeveloperTest.dto;

import java.util.List;

public class EmployeeResponseDto {
	private String status;
	private List<EmployeeDto> data;
	private String message;
	
	public EmployeeResponseDto() {
		
	}
	public EmployeeResponseDto(String status, List<EmployeeDto> data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<EmployeeDto> getData() {
		return data;
	}

	public void setData(List<EmployeeDto> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}

package com.amaris.amarisDeveloperTest.model;

import java.util.List;


public class EmployeesListResponse {

	private String status;
	private List<Employee> data;
	private String message;
	
	public EmployeesListResponse() {
		super();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

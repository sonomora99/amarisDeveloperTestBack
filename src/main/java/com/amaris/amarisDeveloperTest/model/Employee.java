package com.amaris.amarisDeveloperTest.model;

import java.math.BigDecimal;


public class Employee {

	private BigDecimal id;
	private String employee_name;
	private BigDecimal employee_salary;
	private BigDecimal employee_age;
	private String profile_image;
	private BigDecimal employee_anual_salary;
	
	public Employee(BigDecimal id, String employee_name, BigDecimal employee_salary, BigDecimal employee_age,
			String profile_image) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.employee_age = employee_age;
		this.profile_image = profile_image;
		this.employee_anual_salary = this.employee_salary.multiply(new BigDecimal(12));
		
	}
	
	public Employee() {
		
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public BigDecimal getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(BigDecimal employee_salary) {
		this.employee_salary = employee_salary;
	}

	public BigDecimal getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(BigDecimal employee_age) {
		this.employee_age = employee_age;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	public BigDecimal getEmployee_anual_salary() {
		this.employee_anual_salary = this.employee_salary.multiply(new BigDecimal(12));
		return this.employee_anual_salary;
	}

	
	
	
	
	
	
}

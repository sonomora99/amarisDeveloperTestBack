package com.amaris.amarisDeveloperTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.hamcrest.beans.SamePropertyValuesAs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amaris.amarisDeveloperTest.model.Employee;
import com.amaris.amarisDeveloperTest.serviceImpl.EmployeeServiceImpl;

@SpringBootTest
class AmarisDeveloperTestApplicationTests {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@Test
	public void getEmployeeByID() {
//		//Given
//		String employeeID = "1";
//		Employee actual = new Employee(new BigDecimal(1), "Tiger Nixon", new BigDecimal(320800), new BigDecimal(61), "");
//		//When
//		Employee expected = employeeServiceImpl.getEmployeeById(employeeID);
//		
//		//then
//		assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
	}

}

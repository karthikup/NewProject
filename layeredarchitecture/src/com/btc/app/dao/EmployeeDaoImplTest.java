package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Employee;

class EmployeeDaoImplTest {
	
//	EmployeeDao dao = new EmployeeDaoSqlImpl();

	@Test
	void testAddEmployee() {
		Employee employee =  new Employee(100, "Karthik", LocalDate.parse("1997-12-12"), "karthik@gmail.com");
		//assertEquals(employee, dao.addEmployee(employee));
	}

	@Test
	void testSearchEmployeeById() {
		
	}

	@Test
	void testDeleteEmployeeById() {
		
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetAllEmployee() {
		
	}

}

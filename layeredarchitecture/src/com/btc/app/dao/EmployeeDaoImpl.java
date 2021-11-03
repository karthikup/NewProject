package com.btc.app.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.btc.app.model.Employee;
import com.btc.app.ui.DuplicateIdException;

public class EmployeeDaoImpl implements EmployeeDao
{
	private static Map<Integer, Employee> employees=new HashMap<>();



	@Override
	public Employee addEmployee(Employee employee) {
		if(employees.containsKey(employee.getEmployeeId()))
		{
			throw new DuplicateIdException("Duplicate Id Not Allowed"+employee.getEmployeeId());
		}
		employees.put(employee.getEmployeeId(), employee);
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		
		if(employees.containsKey(employeeId))
		{
			throw new DuplicateIdException("Duplicate Id Not Allowed"+employeeId);
		}
		return employees.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		if(employees.containsKey(employeeId))
		{
			throw new DuplicateIdException("Duplicate Id Not Allowed"+employeeId);
		}
		employees.remove(employeeId);
		
		return !employees.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(employees.containsKey(employee.getEmployeeId()))
		{
			throw new DuplicateIdException("Duplicate Id Not Allowed"+employee.getEmployeeId());
		}
		employees.put(employee.getEmployeeId(), employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> emps= new ArrayList<Employee>(employees.values());

		return emps;
	}
}

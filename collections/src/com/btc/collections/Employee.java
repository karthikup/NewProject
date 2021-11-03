package com.btc.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee 
{
	private int id;
	private String employeeName;
	
	public Employee(int id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}



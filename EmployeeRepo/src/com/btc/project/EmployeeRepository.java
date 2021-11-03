package com.btc.project;

import java.time.LocalDate;

public class EmployeeRepository extends Department
{
	private int employeeId;
	private String firstName;
	private String lasstName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private String deisgnation;
	private double salary;
	private int manager;
	private Department department;
	
	EmployeeRepository repo;
	public EmployeeRepository(int employeeId, String firstName, String lasstName, String email, String phoneNumber,
			LocalDate hireDate, String deisgnation, double salary, int manager, Department department) {
		super(manager, deisgnation, deisgnation, deisgnation, deisgnation, hireDate, deisgnation, salary, manager, department, manager, deisgnation, manager);
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lasstName = lasstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.deisgnation = deisgnation;
		this.salary = salary;
		this.manager = manager;
		this.department = department;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLasstName() {
		return lasstName;
	}


	public void setLasstName(String lasstName) {
		this.lasstName = lasstName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}


	public String getDeisgnation() {
		return deisgnation;
	}


	public void setDeisgnation(String deisgnation) {
		this.deisgnation = deisgnation;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getManager() {
		return manager;
	}


	public void setManager(int manager) {
		this.manager = manager;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "EmployeeRepository [employeeId=" + employeeId + ", firstName=" + firstName + ", lasstName=" + lasstName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", deisgnation="
				+ deisgnation + ", salary=" + salary + ", manager=" + manager + ", department=" + department + "]";
	}
	
	
}

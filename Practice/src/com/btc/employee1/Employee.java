package com.btc.employee1;

public class Employee 
{
	String name;
	String yearOfJoining;
	String Address;
	
	public Employee(String name, String yearOfJoining, String address) 
	{
		super();
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		Address = address;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(yearOfJoining);
		System.out.println(Address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", yearOfJoining=" + yearOfJoining + ", Address=" + Address + "]";
	}
	
}

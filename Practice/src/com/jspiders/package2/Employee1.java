package com.jspiders.package2;

import com.jspiders.package1.override;

public class Employee1 extends Object
{
	private int id;
	private String name;
	private String email;
	private long phone;
	
	public Employee1(int id, String name, String email, long phone)
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public long getPhone() 
	{
		return phone;
	}

	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	
	@override
	public int hashCode()
	{
		return id;
	}
	
	@override
	public String toString()
	{
		return id+" "+name+" "+email+" "+phone;
	}
	
	@override
	public boolean equals(Object obj)
	{
		return this.id == obj.hashCode();
	}
}
 
class Mainclass1
{
	public static void main(String args[])
	{
		Employee1 e1 = new Employee1(2,"kar", "kar@gmail.com", 7202400);
		Employee1 e2 = new Employee1(2,"manoj", "manu@gmail.com", 89876188);
		Employee1 e3 = new Employee1(3,"ramnath", "ramu@gmail.com", 10202400);
		
		System.out.println(e1.hashCode());
		System.out.println(e1.toString());
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}
}

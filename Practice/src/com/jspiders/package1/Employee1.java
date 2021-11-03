package com.jspiders.package1;

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

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
 
class Mainclass1
{
	public static void main(String args[])
	{
		Employee1 e1 = new Employee1(2,"kar", "kar@gmail.com", 7202400);
		System.out.println(e1.hashCode());
		System.out.println(e1.toString());
	}
}

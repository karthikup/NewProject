package com.jspiders.package1;

public class Employee
{
	private int id;//r
	private String name;//r
	private String email;//r & w
	private long phone;//r & w
	
	Employee(int id, String name, String email, long phone)
	{
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
	
	public void setEmail(String newEmail)
	{
		this.email = newEmail;
	}
	
	public long getPhone()
	{
		return phone;
	}
	
	public void setPhone(long newPhone)
	{
		this.phone = newPhone;
	}
	
	/*public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}*/
}
class Mainclass
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(1, "Shree", "Shree@Gandu.com", 999999999);
		//e1.display();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
		System.out.println(e1.getPhone());
		
		System.out.println();
		
		e1.setEmail("kamin@lowda.com");
		e1.setPhone(69696969);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
		System.out.println(e1.getPhone());
		
		
		
		
	}
}

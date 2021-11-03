package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Details 
{
	private int id;
	private String name;
	private String address;
	private long phone;
	
	public Details(int id, String name, String address, long phone) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	
}
/*class MyComparators implements Comparator, Collection
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return +1;
	}
}*/
class Example3
{
	public static void main(String[] args) 
	{
		//Details d1 = new Details(10, "karthikup", "Shivamogga", 19875891);
		//Details d2 = new Details(11, "Ramnath", "Honnavar", 29881098);
		//Details d3 = new Details(12, "Shree", "Koppa", 987575112);
		/*System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		ArrayList a = new ArrayList();
		a.add(d1);
		a.add(d2);
		a.add(d3);
		System.out.println(a);*/
		int sid;
		String sname;
		String saddress;
		long sphone;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n = s.nextInt();
		ArrayList<Details> a = new ArrayList();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the id of the student : ");
			sid = s1.nextInt();
			
			System.out.println("Enter the name of the student : ");
			sname = s2.nextLine();
			
			System.out.println("Enter the address of the student : ");
			saddress = s3.nextLine();
			
			System.out.println("Enter the phone number of the student : ");
			sphone = s4.nextLong();
			
			
			a.add(new Details(sid, sname, saddress, sphone));
		}
		Collections.sort(a, new Comparator<Details>()
		{
				public int compare(Details obj1, Details obj2)
				{
					String s1 = obj1.toString();
					String s2 = obj2.toString();
					return -1;
				}
		}
		);
		System.out.println(a);
	}
}

package customexception;

import java.util.Scanner;

public class PersonDetails 
{
	private String name;
	private int age;
	
	
	public void readPersonDetails()  {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age and Name");
		int age = scan.nextInt();
		
		String name=scan.next()+scan.nextLine();
		
		if(age<=0) {
			throw new InvalidAgeException("Error invalid age : "+age);
		}
		
		if(name.length()<3)
		{
			throw new InvalidNameLengthException("Error invalid name length : "+name);
		}
		
		this.age=age;
		this.name=name;
		
		}


	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", age=" + age + "]";
	}
}

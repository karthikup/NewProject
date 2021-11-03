package com.btc.employee1;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) 
	{
		System.out.println("Program Starts...");
		System.out.println();
		Employee e1 =  new Employee("Robert","1994","64C- WallsStreat");
		Employee e2 = new Employee("Sam","2000","68D- WallStreat");
		Employee e3 = new Employee("John","1999","26B- WallStreat");
		e1.display();
		System.out.println("------------------------");
		e2.display();
		System.out.println("------------------------");
		e3.display();
		System.out.println("------------------------");
		ArrayList<Employee> a = new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		System.out.println(a);
		System.out.println();
		System.out.println("Program Ends...");
	}

}

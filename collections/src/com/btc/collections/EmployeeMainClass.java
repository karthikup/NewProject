package com.btc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMainClass 
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		ArrayList<Employee> list = new ArrayList<>();
		System.out.println("Enter the number of Employee : ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the id");
			id = sc.nextInt();
			System.out.println("Enter the name");
			name = sc.next()+sc.nextLine();
			list.add(new Employee(id,name));
		}
//		System.out.println("Enter the id you want to search");
//		int searchId = sc.nextInt();
//		List<Employee> l = list.stream().filter(item->item.getId()==searchId).collect(Collectors.toList());
//		l.forEach(e->System.out.println(e.getEmployeeName()));
		Collections.sort(list,(e1,e2)->e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName()));//sort by name
		//Collections.sort(list,(e1,e2)->e1.getId()-e2.getId());//sort by id
		list.forEach(System.out::println);
		int totalId = list.stream().mapToInt(e->e.getId()).sum();
		System.out.println("Total Id is : "+totalId);
	}
}

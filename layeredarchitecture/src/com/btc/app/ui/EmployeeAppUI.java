package com.btc.app.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.btc.app.model.Employee;
import com.btc.app.service.EmployeeService;
import com.btc.app.service.EmployeeServiceImpl;

public class EmployeeAppUI 
{
	
	private Scanner scanner=new Scanner(System.in);
	private static EmployeeService service;
	
	public EmployeeAppUI() throws SQLException {
		service=new EmployeeServiceImpl();
	}
	

	public void addEmployee() {
		
		int employeeId=0;
		String employeeName=null;
		LocalDate dob=null;
		String email=null;
		
		
		int count=0;
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		
		try 
		{
			
			employeeId=scanner.nextInt();
			count++;
		
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("HANDELED InputMismatchException");
			System.out.println("INVALID INPUT");
		}
		catch(DuplicateIdException e2)
		{
			System.out.println(e2.getMessage());
			System.out.println("HANDELED DuplicateIdException");
			System.out.println("INVALID INPUT");
		}
		System.out.print("Employee Name : ");
		employeeName=scanner.next()+scanner.nextLine();
		System.out.print("Email : ");
		email=scanner.next()+scanner.nextLine();

		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();

		dob=LocalDate.parse(dobString);

		
		Employee employee = new Employee(employeeId, employeeName, dob, email);

		Employee savedEmployee;
		try {
			savedEmployee = service.addEmployee(employee);
			System.out.println("Employee Added Successfully..");
			System.out.println(savedEmployee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		int a[] = new int[count];
//		if(count<5)
//		{	
//			
//				a[count-1] = employee.getEmployeeId();
//			
//			findDuplicate(a);
//		}
	}


	public void showEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();

		Employee employee=null;
		try {
			employee = service.searchEmployeeById(employeeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(employee);
	}
	
	public void deleteEmployee() 
	{
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		boolean employee=false;
		try {
			employee = service.deleteEmployeeById(employeeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(employee);
		if(employee)
		{
			System.out.println("Employee Deleted Successfully");
		}
		else
		{
			throw new EmployeeNotFoundException("Employee Not Found" +employeeId);
		}
	}
	
	public void listOfEmployee()
	{
		List<Employee> list=null;
		try {
			list = service.getAllEmployee();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		
	}
	
	public void updateEmployee()
	{
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=0;
		try 
		{
			
			employeeId=scanner.nextInt();
			
		
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("HANDELED InputMismatchException");
			System.out.println("INVALID INPUT");
		}
		catch(DuplicateIdException e2)
		{
			System.out.println(e2.getMessage());
			System.out.println("HANDELED DuplicateIdException");
			System.out.println("INVALID INPUT");
		}
		Employee employee = null;
		try {
			employee = service.searchEmployeeById(employeeId);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(employee!=null) {
		System.out.println(employee);
		System.out.print("Employee Name : ");
		String employeeName=scanner.next()+scanner.nextLine();
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();
		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();
		LocalDate dob=LocalDate.parse(dobString);
		Employee employee1= new Employee(employeeId, employeeName, dob, email);
		 try {
			service.updateEmployee(employee1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Update Successfully");
		}
		
	}
	
//	public void findDuplicate(int a[])
//	{
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int element : a )
//		{
//	
//			if(map.get(element)==null)
//			{
//				map.put(element, 1);
//			}
//			else
//			{
//				map.put(element, map.get(element)+1);
//			}
//		}
//		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//		for(Entry<Integer, Integer> entry : entrySet)
//		{
//			if(entry.getValue()>1)
//			{
//				System.out.println("Duplicate Element :"+entry.getKey()+ " - found "+entry.getValue()+ " times ");
//				throw new DuplicateIdException("Duplicate Id Not Allowed "+entry.getValue());
//			}
//			
//		}
//	}
}

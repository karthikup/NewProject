package com.btc.project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) 
	{
		
		
		Department department=null;
		Department d1 = new Department(100, "Ramnath", "Naik", "ramnath@gmail.com", "9123456978", LocalDate.of(2020, 8 , 28 ), "Software Engineer", 30000, 1, department, 1, "IT", 10);
		EmployeeRepository e1 = new EmployeeRepository(100, "Ramnath", "Naik", "ramnath@gmail.com", "9123456978", LocalDate.of(2020, 8 , 28 ), "Software Engineer", 30000, 1,d1);
		Department d2 = new Department(101, "Shree", "Charan", "shree@gmail.com", "9826666978", LocalDate.of(2020, 6 , 15 ), "System Engineer", 31000, 2, department, 2, "IT", 20);
		EmployeeRepository e2 = new EmployeeRepository(101, "Shree", "Charan", "shree@gmail.com", "9826666978", LocalDate.of(2020, 6 , 15 ), "System Engineer", 31000, 2,d2);
		Department d3 = new Department(102, "Manoj", "kumar", "manoj@gmail.com", "9555456958", LocalDate.of(2021, 1 , 10 ), "Mechanical Engineer", 32000, 3, department, 3, "Accounting", 30);
		EmployeeRepository e3 = new EmployeeRepository(102, "Manoj", "kumar", "manoj@gmail.com", "9555456958", LocalDate.of(2021, 1 , 10 ), "Mechanical Engineer", 32000, 3,d3);
		Department d4 = new Department(104, "Karthik", "U P", "karthik@gmail.com", "7204290120", LocalDate.of(2021, 9 , 28 ), "Software Engineer", 31000, 1, department, 1, "IT", 40);
		EmployeeRepository e4 = new EmployeeRepository(104, "Karthik", "U P", "karthik@gmail.com", "7204290120", LocalDate.of(2021, 9 , 28 ), "Software Engineer", 31000, 1,d4);
				
		List<EmployeeRepository> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		
		
		EmployeeService service = new EmployeeService();
		service.sumofSalary(list);
	}

}

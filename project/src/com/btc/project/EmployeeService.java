package com.btc.project;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeService 
{
	public void sumofSalary(List<EmployeeRepository> repoList) {
		DoubleSummaryStatistics totalSal = repoList.stream().collect(Collectors.summarizingDouble(EmployeeRepository::getSalary));
		System.out.println("Total Salary of all Employees = "+ totalSal);
	}
	
	public void countEmployeeEachDept(List<EmployeeRepository> eList)
	{
		Map<Department, Long> employeeCountByDepartment=
				eList.stream().collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
				         
				Set<Entry<Department, Long>> entrySet = employeeCountByDepartment.entrySet();
				         
				for (Entry<Department, Long> entry : entrySet)
				{
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}
	}
	
	public void seniorMostEmployee(List<EmployeeRepository> eList)
	{
		Optional<EmployeeRepository> seniorMostEmp=
				eList.stream().sorted(Comparator.comparing(EmployeeRepository::getHireDate)).findFirst();
				         
				EmployeeRepository employeeDetail = seniorMostEmp.get();
				System.out.println("Senior Most Employee is = ");
				System.out.println(employeeDetail.getFirstName()+" "+ employeeDetail.getLasstName());

	}

	public void  durationOfServiceInMonthDays(List<EmployeeRepository> eList)
	{
		
		
	}
	
	public void highestCountOfEmp(List<EmployeeRepository> eList)
	{
		Map<Department, Long> employeeCountByDepartment=
				eList.stream().collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
				         
				Set<Entry<Department, Long>> entrySet = employeeCountByDepartment.entrySet();
				  Long max =0L;       
				for (Entry<Department, Long> entry : entrySet)
				{ if(entry.getValue() > max)
				{
					max=entry.getValue();
				}
				}
				for(Entry<Department, Long> entry : entrySet)
				{
					if(entry.getValue()==max)
					{
						System.out.println(entry.getKey()+" : "+entry.getValue());
					}
				}
		         
	}
	
	public void empWithoutDept(List<EmployeeRepository> list)
	{
		System.out.println("Employee without Department");
		list.stream().filter(e1->e1.getDepartment()==null).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	public void employeeWithSalary(List<EmployeeRepository> eList)
	{
		System.out.println();
		for(EmployeeRepository e:eList)
		{
			System.out.print(e.getFirstName()+" "+e.getLasstName()+" Salary = "+e.getSalary()+" Salary with 15% more "+e.getSalary()*1.15);
			System.out.println();
					
		}
	}
		
		public void empWithoutManager(List<EmployeeRepository> eList)
		{
			List<EmployeeRepository> empList=eList.stream().filter(e->e.getManagerId()==0).collect(Collectors.toList());
			for(EmployeeRepository el:empList)
			{
				System.out.println("Employee without Manager = "+el.getFirstName()+" "+el.getLasstName());
			}
				
		}
	
		public void sortEmpId(List<EmployeeRepository> list)
		{
			System.out.println("Employee sorted by Employee Id");
			list.stream().sorted(Comparator.comparing(EmployeeRepository::getEmployeeId)).collect(Collectors.toList()).forEach(System.out::println);
			}

			public void sortDept(List<Department> list)
			{
				System.out.println("Department sorted by Department Id");
				list.stream().sorted(Comparator.comparing(Department::getDepartmentId)).collect(Collectors.toList()).forEach(System.out::println);
			}

			public void sortByFirstName(List<EmployeeRepository> list)
			{
				System.out.println("Employee sorted by Employee Name");
				 list.stream().sorted(Comparator.comparing(EmployeeRepository::getFirstName)).collect(Collectors.toList()).forEach(System.out::println);
			}
}

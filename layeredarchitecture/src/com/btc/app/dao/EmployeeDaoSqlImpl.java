package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.btc.app.model.Employee;

public class EmployeeDaoSqlImpl implements EmployeeDao
{
	private Connection con;
	
	private PreparedStatement smt;
	
	public EmployeeDaoSqlImpl() throws SQLException {
		con=ConnectionUtil.getDbConnection();
	}
	
	@Override
	public Employee addEmployee(Employee employee) throws SQLException {
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		String query = "insert into employee values(?,?,?,?)";
		
		
		smt= con.prepareStatement(query);
		
		smt.setInt(1, employee.getEmployeeId());
		smt.setString(2, employee.getEmployeeName());
		smt.setString(3, dateString);
		smt.setString(4, employee.getEmail());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return employee;
		}
		return null;
		
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws SQLException {
		String query="select * from employee where id=?";
		smt=con.prepareStatement(query);
		
		smt.setInt(1, employeeId);	
		
		ResultSet queryResult = smt.executeQuery();
		
		Employee emp=null;
		
		if(queryResult.next()) {
			emp=new Employee();
			emp.setEmployeeId(employeeId);
			emp.setEmployeeName(queryResult.getString("empname"));
			emp.setEmail(queryResult.getString("email"));
			String dateString=queryResult.getString("dob");
			emp.setDob(LocalDate.parse(dateString));
		}
		
		return emp;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws SQLException{
		 String query = "delete from employee where id=?";
		   con=ConnectionUtil.getDbConnection();
		   smt= con.prepareStatement(query);
		   smt.setInt(1, employeeId);
		   int deleted = smt.executeUpdate();
		   if(deleted==0)
		   {
			   return false;
		   }else {
			   return true;
		   }
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws SQLException {
        
		
		String query = "UPDATE employee SET id = ?,empname=? ,dob=?,email =? WHERE id =?";
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		con=ConnectionUtil.getDbConnection();
		smt= con.prepareStatement(query);
		
		smt.setInt(1, employee.getEmployeeId());
		smt.setString(2, employee.getEmployeeName());
		smt.setString(3, dateString);
		smt.setString(4, employee.getEmail());
		smt.setInt(5, employee.getEmployeeId());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		String query="select * from employee";
		smt=con.prepareStatement(query);
		
		ResultSet rst = smt.executeQuery();
		
		List<Employee> employee=new ArrayList<Employee>();
		
		if(rst.next()) {
			Employee emp = new Employee();
			emp.setEmployeeId(rst.getInt("id"));
			emp.setEmployeeName(rst.getString("empname"));
			emp.setEmail(rst.getString("email"));
			String dateString=rst.getString("dob");
			emp.setDob(LocalDate.parse(dateString));
			employee.add(emp);
		}
		
		return employee;
	}

}

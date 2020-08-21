package com.test.springjdbc.dao;

import java.util.List;

import com.test.springjdbc.model.Emp;
import com.test.springjdbc.model.Employee;

public interface EmployeeDao {
	
	boolean createEmployee(Employee employee);
	
	int updateEmployee(int id, int salary);
	
	int deleteEmployeeById(int id);
	
	Employee getEmployeeById(int id);
	
	List<Employee> getAllEmployees();
	
	Emp getEmployeeDetails(int id);
}

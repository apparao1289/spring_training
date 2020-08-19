package com.test.setter.injection;

public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public Employee getEmployeeDetailById(int id) {
		
		return employeeDao.getEmployeeDetailById(id);
	}

}

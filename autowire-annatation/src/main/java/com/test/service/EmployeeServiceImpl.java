package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;
import com.test.util.ValidationUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private ValidationUtil validationUtil;

	public Employee getEmployeeDetailsById(String id) {
		Employee employee = null;
		if (validationUtil.validateId(id)) {
			employee = employeeDao.getEmployeeDetailsById(id);
		} else {
			System.out.println("Enter valid Id..");
		}
		return employee;
	}

} 

package com.test.dao;

import org.springframework.stereotype.Repository;

import com.test.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public Employee getEmployeeDetailsById(String id) {

		Employee e = new Employee();
		e.setId(id);
		e.setName("Anand");
		e.setDesignation("Software Engineer");
		return e;
	}

}

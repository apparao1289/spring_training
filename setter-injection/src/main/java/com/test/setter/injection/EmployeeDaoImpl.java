package com.test.setter.injection;

public class EmployeeDaoImpl implements EmployeeDao {

	public Employee getEmployeeDetailById(int id) {
		// Interacting with data base and get the employee details.
		Employee e = new Employee();
		e.setId(id);
		e.setName("emp name " + id);
		e.setAge("age" + id);
		e.setDesignation("Software Enginerr");
		e.setAddress("Miami FL");
		return e;
	}

}

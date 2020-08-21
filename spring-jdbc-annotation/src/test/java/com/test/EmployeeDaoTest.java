package com.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.springjdbc.configuration.ApplicationConfiguration;
import com.test.springjdbc.dao.EmployeeDao;
import com.test.springjdbc.dao.EmployeeDaoImpl;
import com.test.springjdbc.model.Employee;

public class EmployeeDaoTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeDao edao = context.getBean(EmployeeDaoImpl.class);
		
		//createEmployeeTest(edao);
		
		// update employee salary
		//updateEmployeeTest(edao);
		
		//deleteEmployeeTest(edao);
		
		//getEmployeeDetailsByIdTest(edao);
		
		getEmployeeTest(edao);
		
	}

	private static void getEmployeeTest(EmployeeDao edao) {
		List<Employee> list = edao.getAllEmployees();
		for(Employee e :list) {
			System.out.println("id:"+e.getId());
			System.out.println("name:"+e.getName());
			System.out.println("job:"+e.getJob());
			System.out.println("salary:"+e.getSalary());
			System.out.println("comm:"+e.getComm());
			System.out.println("Manager id:"+e.getMgr());
			System.out.println("Dept no:"+e.getDeptNumber());
			System.out.println("*****************************************");
		}
	}

	private static void getEmployeeDetailsByIdTest(EmployeeDao edao) {
		Employee e = edao.getEmployeeById(2);
		System.out.println("id:"+e.getId());
		System.out.println("name:"+e.getName());
		System.out.println("job:"+e.getJob());
		System.out.println("salary:"+e.getSalary());
		System.out.println("comm:"+e.getComm());
		System.out.println("Manager id:"+e.getMgr());
		System.out.println("Dept no:"+e.getDeptNumber());
		
	}

	private static void deleteEmployeeTest(EmployeeDao edao) {
		int result= edao.deleteEmployeeById(11);
		System.out.println("NO of records deleted:"+result);
	}

	private static void createEmployeeTest(EmployeeDao edao) {
		Employee employee = new Employee();
		employee.setName("Rama Rao");
		employee.setDeptNumber(2);
		employee.setJob("Software Manager");
		employee.setSalary(4000);
		employee.setComm(200);
		employee.setMgr(1);
		employee.setDate(null);
		boolean result = edao.createEmployee(employee);
		if(result) {
			System.out.println("Employee created successfully");
		} else {
			System.out.println("There is problem in the system. please try again.");
		}
	}

	private static void updateEmployeeTest(EmployeeDao edao ) {
		int result = edao.updateEmployee(6, 6000);
		System.out.println("No of rows updated:"+result);
		
	}

}

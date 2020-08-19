package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.model.Employee;
import com.test.service.EmployeeService;
import com.test.service.EmployeeServiceImpl;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService  empservice = context.getBean(EmployeeServiceImpl.class);
		Employee e = empservice.getEmployeeDetailsById("123");
		System.out.println("Id:"+e.getId());
		System.out.println("Name::"+e.getName());
		System.out.println("Designation:"+e.getDesignation());
	}

}

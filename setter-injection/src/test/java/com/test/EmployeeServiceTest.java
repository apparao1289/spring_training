package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.setter.injection.Employee;
import com.test.setter.injection.EmployeeServiceImpl;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceImpl eservice = (EmployeeServiceImpl)context.getBean("empService");
		eservice.setEmployeeDao(null);
		Employee e = eservice.getEmployeeDetailById(2);
		System.out.println("Id::"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Age:"+e.getAge());
		System.out.println("Address:"+e.getAddress());
		System.out.println("Designation:"+e.getDesignation());
	}

}

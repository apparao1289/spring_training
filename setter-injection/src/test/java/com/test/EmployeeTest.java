package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.setter.injection.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = context.getBean(Employee.class);
		System.out.println("Name:"+e.getName());
		System.out.println("Age:"+e.getAge());
		System.out.println("Address:"+e.getAddress());
		System.out.println("Designation:"+e.getDesignation());
	}

}

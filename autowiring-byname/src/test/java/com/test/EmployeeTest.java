package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.autowire.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = context.getBean(Employee.class);
		System.out.println("id:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Designation:"+e.getDesignation());
		System.out.println("Street number:"+e.getAddress().getStreetNumber());
		System.out.println("city"+e.getAddress().getCity());
		System.out.println("Zipr:"+e.getAddress().getZip());
		System.out.println("State:"+e.getAddress().getState());
	}

}

package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDaoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao empDao = context.getBean(EmployeeDao.class);
		empDao.displayEmployeeDetails();
		System.out.println("empDao:"+empDao.hashCode());
		
		EmployeeDao empDao1 = context.getBean(EmployeeDao.class);
		System.out.println("empDao1:"+empDao1.hashCode());
	}

}

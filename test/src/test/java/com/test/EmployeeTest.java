package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.test.ioc.Employee;
import com.test.ioc.EmployeeDao;

public class EmployeeTest {

	public static void main(String[] args) {
		// step1: Get containers object.
		BeanFactory container = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		// step2: Get corresponding bean class from container.
		//Employee e = (Employee) container.getBean("employee");
		EmployeeDao e = container.getBean(EmployeeDao.class);
		// step3 : invoke the business methods.
		e.getEmployeeDetails();
		
		Employee emp = container.getBean(Employee.class);
		System.out.println("Name:"+emp.getName());
		System.out.println("Age:"+emp.getAge());
		System.out.println("Address:"+emp.getAddress());
	}

}

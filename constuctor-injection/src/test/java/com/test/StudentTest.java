package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.constuctor.injection.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean(Student.class);
		System.out.println("Name::"+s.name);
		System.out.println("Address::"+s.address);
		System.out.println("age::"+s.age);
	}

}

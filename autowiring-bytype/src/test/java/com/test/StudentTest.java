package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.autowire.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean(Student.class);
		System.out.println("name:"+s.getName());
		System.out.println("age:"+s.getAge());
		System.out.println("Course id:"+s.getCourse().getId());
		System.out.println("Course name:"+s.getCourse().getName());
	}

}

package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDaoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao studentDao = context.getBean(StudentDao.class);
		studentDao.getStudentDetails();
		System.out.println("studentDao hascode::"+studentDao.hashCode());
		
		StudentDao studentDao1 = context.getBean(StudentDao.class);
		System.out.println("studentDao1 hascode::"+studentDao1.hashCode());
		
		
		StudentDao studentDao2 = context.getBean(StudentDao.class);
		System.out.println("studentDao2 hascode::"+studentDao2.hashCode());
		
		
	}

}

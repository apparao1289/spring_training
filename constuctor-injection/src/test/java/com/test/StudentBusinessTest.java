package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.constuctor.injection.StudentBusiness;
import com.test.constuctor.injection.StudentBusinessImpl;

public class StudentBusinessTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentBusiness studentBusiness = (StudentBusinessImpl)context.getBean("studentBusinessImpl");
		studentBusiness.getStudentDetails();
	}

}

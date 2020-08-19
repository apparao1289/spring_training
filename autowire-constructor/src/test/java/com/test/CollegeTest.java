package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.autowire.College;

public class CollegeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		College c =context.getBean(College.class);
		System.out.println("College name:"+c.getName());
		System.out.println("College Address:"+c.getAddress());
		System.out.println("student ID:"+c.getStudent().getId());
		System.out.println("Student name:"+c.getStudent().getName());
	}

}

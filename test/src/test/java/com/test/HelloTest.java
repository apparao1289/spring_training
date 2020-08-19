package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.ioc.Hello;

public class HelloTest {

	public static void main(String[] args) {
		/*
		 * Hello h = new Hello(); 
		 * h.display();
		 */
		// step1: Get containers object.
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// step2: Get corresponding bean class from container.
		//Hello h = (Hello)container.getBean("hello");  // bean id
		Hello h = container.getBean(Hello.class); // bean type
		
		// step3 : invoke the business methods.
		h.display();
	}

}

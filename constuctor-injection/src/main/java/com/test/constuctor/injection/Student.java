package com.test.constuctor.injection;

public class Student {

	public String name;

	public String address;

	public Integer age;

	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

}

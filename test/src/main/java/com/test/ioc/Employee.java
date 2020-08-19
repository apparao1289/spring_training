package com.test.ioc;

public class Employee {

	private String name;

	private int age;

	private String address;
	
	public Employee() {
		System.out.println("Invoking constuctor..");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name::"+name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

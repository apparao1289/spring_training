package com.test.constuctor.injection;

public class StudentBusinessImpl implements StudentBusiness {

	public StudentService studentService = null;

	public StudentBusinessImpl(StudentServiceImpl studentServiceImpl) {
		this.studentService = studentServiceImpl;
	}

	public void getStudentDetails() {
		studentService.getStudentDetails();
	}

}

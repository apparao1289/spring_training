package com.springmvcrest.business;

import com.springmvcrest.model.Result;
import com.springmvcrest.model.Student;

public interface StudentBusiness {
	
	Student getStudentDetailsById(int id);

	Result updateStudent(int id, String stand);

	Result deleteStudent(int id);

	Result createStudent(Student student);

}

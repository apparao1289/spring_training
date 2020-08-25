package com.springmvcrest.dao;

import com.springmvcrest.model.Student;

public interface StudentDao {
	
	Student getStudentDetailsById(int id);

	boolean updateStudent(int id, String stand);

	boolean deleteStudent(int id);

	boolean createStudent(Student student);

}

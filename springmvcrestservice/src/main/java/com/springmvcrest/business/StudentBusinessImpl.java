package com.springmvcrest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcrest.dao.StudentDao;
import com.springmvcrest.model.Result;
import com.springmvcrest.model.Student;

@Service
public class StudentBusinessImpl implements StudentBusiness {

	@Autowired
	private StudentDao studentDao;

	public Student getStudentDetailsById(int id) {

		return studentDao.getStudentDetailsById(id);
	}

	public Result updateStudent(int id, String stand) {

		boolean status = studentDao.updateStudent(id, stand);

		Result result = new Result();

		if (status) {
			result.setStatus("SUCCESS");
			result.setMessage("Record updated successfully");
		} else {
			result.setStatus("FAIL");
			result.setMessage("There is some problem in the system. please try again.");
		}

		return result;
	}

	public Result deleteStudent(int id) {

		boolean status = studentDao.deleteStudent(id);
		Result result = new Result();
		if (status) {
			result.setStatus("SUCCESS");
			result.setMessage("Record deleted successfully");
		} else {
			result.setStatus("FAIL");
			result.setMessage("There is some problem in the system. please try again.");
		}

		return result;
	}

	public Result createStudent(Student student) {

		boolean status = studentDao.createStudent(student);

		Result result = new Result();
		if (status) {
			result.setStatus("SUCCESS");
			result.setMessage("Student Record created successfully");
		} else {
			result.setStatus("FAIL");
			result.setMessage("There is some problem in the system. please try again.");
		}

		return result;
	}

}

package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.StudentDao;
import com.springmvc.mode.RegistrationForm;
@Service
public class StudentBusinessImpl implements StudentBusiness {
	
	@Autowired
	private StudentDao studentDao;

	public boolean createStudent(RegistrationForm registrationForm) {

		return studentDao.createStudent(registrationForm);

	}

}

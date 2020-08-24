package com.springmvc.dao;

import org.omg.CORBA.portable.ApplicationException;

import com.springmvc.mode.RegistrationForm;

public interface StudentDao {

	/**
	 * This method used to create the student, based on given student information.
	 * 
	 * @param student
	 * @return
	 * @throws ApplicationException
	 */
	boolean createStudent(RegistrationForm registrationForm) ;

}

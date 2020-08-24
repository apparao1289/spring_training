package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.mode.RegistrationForm;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.dao.StudentDao#createStudent(com.test.model.Student)
	 */
	public boolean createStudent(RegistrationForm registrationForm) {

		Object[] array = new Object[] { getMaxStudentId(),
				registrationForm.getFirstName() + " " + registrationForm.getLastName(), registrationForm.getAge(),
				registrationForm.getAddress(), registrationForm.getStand() };

		int result = jdbcTemplate.update("insert into student(id,name,age,address,stand) values(?,?,?,?,?)", array);

		return result > 0 ? true : false;
	}

	private int getMaxStudentId() {

		int maxId = jdbcTemplate.queryForObject("select max(id) from student", int.class);

		return maxId + 1;
	}

}

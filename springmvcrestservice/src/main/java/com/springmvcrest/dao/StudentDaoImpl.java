package com.springmvcrest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.springmvcrest.model.Result;
import com.springmvcrest.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Student getStudentDetailsById(int id) {

		return jdbcTemplate.query("select * from student where id= ?", new Object[] { id },
				new ResultSetExtractor<Student>() {

					public Student extractData(ResultSet rs) throws SQLException, DataAccessException {

						Student s = new Student();
						if (rs.next()) {
							s.setId(rs.getInt("id"));
							s.setName(rs.getString("name"));
							s.setAge(rs.getInt("age"));
							s.setAddress(rs.getString("address"));
							s.setStand(rs.getString("stand"));
						}
						return s;
					}
				});

	}

	public boolean updateStudent(int id, String stand) {

		int noOfRowsUpdates = jdbcTemplate.update("update student set stand = ? where id = ?",
				new Object[] { stand, id });

		return noOfRowsUpdates > 0 ? true : false;
	}

	public boolean deleteStudent(int id) {

		int noOfRowsDelete = jdbcTemplate.update("delete from student where id = ?", new Object[] { id });

		return noOfRowsDelete > 0 ? true : false;
	}

	public boolean createStudent(Student student) {
		
		Object[] array = new Object[] { getMaxStudentId(),
				student.getName(), student.getAge(),
				student.getAddress(), student.getStand() };

		int result = jdbcTemplate.update("insert into student(id,name,age,address,stand) values(?,?,?,?,?)", array);

		return result > 0 ? true : false;
	}

	private int getMaxStudentId() {

		int maxId = jdbcTemplate.queryForObject("select max(id) from student", int.class);

		return maxId + 1;
	}

}

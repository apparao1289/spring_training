package com.test.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.test.springjdbc.model.Emp;
import com.test.springjdbc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean createEmployee(Employee e) {
		
		Object [] values = new Object [] {getId(),e.getName(),e.getDeptNumber(),e.getJob(),e.getSalary(),e.getComm(),e.getMgr(),e.getDate()};
		
		int rowsUpdated = jdbcTemplate.update("insert into employee values(?,?,?,?,?,?,?,?)", values);
		
		return rowsUpdated > 0 ? true :false;
	}
	
	private int getId() {
		
		int maxId = jdbcTemplate.queryForObject("select max(eid) from employee",int.class);
		
		return maxId+1;
	}

	@Override
	public int updateEmployee(int id, int salary) {
		String sql = "update employee set sal=? where eid=?";
		Object [] array = new Object[] {salary,id};
		return jdbcTemplate.update(sql, array);
	}

	@Override
	public int deleteEmployeeById(int id) {
		
		return jdbcTemplate.update("delete from employee where eid=?", new Object [] {id});
	}

	@Override
	public Employee getEmployeeById(int id) {
		
	 return jdbcTemplate.query("select * from employee where eid=?", new Object[] {id}, new ResultSetExtractor<Employee>() {
			public Employee extractData(ResultSet rs) throws SQLException,DataAccessException {
				Employee e = new Employee();
				if(rs.next()) {
					e.setId(rs.getInt("eid"));
					e.setName(rs.getString("ename"));
					e.setJob(rs.getString("job"));
					e.setSalary(rs.getInt("sal"));
					e.setComm(rs.getInt("comm"));
					e.setDeptNumber(rs.getInt("deptno"));
					e.setMgr(rs.getInt("mgr"));
				}
				return e;
			}
		});
	}

	class ResultsetExtractorExample implements ResultSetExtractor<Employee> {

		public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
			Employee e = new Employee();
			if (rs.next()) {
				e.setId(rs.getInt("eid"));
				e.setName(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSalary(rs.getInt("sal"));
				e.setComm(rs.getInt("comm"));
				e.setDeptNumber(rs.getInt("deptno"));
				e.setMgr(rs.getInt("mgr"));
			}
			return e;
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList =  jdbcTemplate.query("Select * from employee", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs , int i) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt("eid"));
				e.setName(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSalary(rs.getInt("sal"));
				e.setComm(rs.getInt("comm"));
				e.setDeptNumber(rs.getInt("deptno"));
				e.setMgr(rs.getInt("mgr"));
				return e;
			}
		});
		return empList;
		
	}

	@Override
	public Emp getEmployeeDetails(int id) {
		return (Emp)jdbcTemplate.query("select * from employee where eid=?",new Object[] {id}, new BeanPropertyRowMapper(Emp.class)).get(0);
	}
}

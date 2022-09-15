package com.crudJdbc.dao;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.crudJdbc.Employee;

public class EmployeeDaoImp implements EmployeeDao{
	private JdbcTemplate jdbcTemplate;
	
	public int insert (Employee employee) {
		String query = "insert into employeerecord(id , name , city , state , pincode)values(?,?,?,?,?)";
		int insert = this.jdbcTemplate.update(query, 
				employee.getId(), employee.getName(),employee.getCity(),employee.getState(), employee.getPincode());
		return insert;
	}

	public int change(Employee employee) {
		String query = "update employeerecord set name=? , city=? , state=? , pincode=? where id=?";
		int change = this.jdbcTemplate.update(query, 
				employee.getName(), employee.getCity(), employee.getState(), employee.getPincode(), employee.getId());
		return change;
	}

	public int delete(int employeeId) {
		String query ="delete from employeerecord where id=?";
		int delete = this.jdbcTemplate.update(query, employeeId);
		return delete;
	}

	public Employee getEmployee(int employeeId) {
		String query = "Select * from employeerecord where id=?";
		RowMapper <Employee> rowmapper = new RowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowmapper, employeeId);
		return employee;
	}
	private ResultSetExtractor RowMapperImpl() {
		return null;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> getAlEmployee() {
		String query = "Select * from employeerecord";
		List<Employee> students=this.jdbcTemplate.query(query, new com.crudJdbc.dao.RowMapperImpl());
		return students;
	}


}

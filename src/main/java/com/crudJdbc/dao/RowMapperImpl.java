package com.crudJdbc.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.crudJdbc.Employee;

public class RowMapperImpl implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setCity(rs.getString(3));
		employee.setState(rs.getString(4));
		employee.setPincode(rs.getInt(5));
		return employee;

}
}

package com.crudJdbc.dao;

import java.util.List;


import com.crudJdbc.Employee;

public interface EmployeeDao {
	
	public int insert (Employee employee);
	public int change (Employee employee);
	public int delete (int employeeId);
	public Employee getEmployee (int employeeId);
	public List<Employee> getAlEmployee();
}

package com.jjh.dao;

import com.jjh.domain.Employee;

import java.util.List;

public interface EmployeeDAO {

	List<Employee> getEmployees();
	
	int addEmployee(Employee e);
	
	List<Employee> getAltEmployees();
	
}

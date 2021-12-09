package com.jjh.domain;

public class EmployeeImpl implements Employee {

	private String name;
	private int employeeId;

	public EmployeeImpl() {
	}

	public EmployeeImpl(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return employeeId;
	}

	public void setId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String toString() {
		return name + ": " + employeeId;
	}
}

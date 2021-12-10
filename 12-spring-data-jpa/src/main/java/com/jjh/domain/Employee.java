package com.jjh.domain;

import javax.persistence.*;

@Entity(name="employee")
public class Employee {

	@Column(name="name")
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

  public Employee() {
  }

  public Employee(String name) {
    this.name = name;
  }

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return name + ": " + id;
	}
}

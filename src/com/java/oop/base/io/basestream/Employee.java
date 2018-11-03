package com.java.oop.base.io.basestream;

import java.io.Serializable;

public class Employee implements Serializable{
	private transient String name;
	private double salary;
	public Employee() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

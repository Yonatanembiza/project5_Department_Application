package com.assignment5_1;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class DeptEmployee {
	/**
	 * 
	 */
	protected double salary;
	private String name;
	private GregorianCalendar hireDate;
	
	// Setter / Mutator
	public void setName(String name) {
		this.name= name;
	}
	
	public void setHireDate(GregorianCalendar date) {
		this.hireDate = date;
	}
	
	// getter / accessor
	
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getHireDate() {
		return hireDate;
	}
	
	// Constructor 
	public DeptEmployee(double salary, String name, GregorianCalendar hireDate) {
		this.salary = salary;
		this.name = name;
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); 
		return "[Salary: " + salary + ", Name: " + name + ", Hire Date: " 
				+ dateFormat.format(hireDate.getTime()) + "]";
	}
}

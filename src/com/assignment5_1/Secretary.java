package com.assignment5_1;

import java.util.GregorianCalendar;

public class Secretary extends DeptEmployee {
	// Constructor
	public Secretary(double salary, String name, GregorianCalendar hireDate, int overtimeHours) {
		super(salary, name, hireDate);
		this.overtimeHours = overtimeHours;
	}

	private int overtimeHours;
	
	//setter / mutator
	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public int getOvertimeHours() {
		return overtimeHours; 
	}
	
	@Override
	public double computeSalary() {
		return this.salary + 12 * overtimeHours;
	}
}

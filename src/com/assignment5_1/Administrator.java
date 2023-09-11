package com.assignment5_1;

import java.util.GregorianCalendar;

public class Administrator extends DeptEmployee {

	public Administrator(double salary, String name, 
			GregorianCalendar hireDate, int numberOfHoursWorked) {
		super(salary, name, hireDate);
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	
	private int numberOfHoursWorked;
	// Setter /Mutator 
	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	// Accessor / getter
	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	@Override
	public double computeSalary() {
		return numberOfHoursWorked  * 20;
	}	

}

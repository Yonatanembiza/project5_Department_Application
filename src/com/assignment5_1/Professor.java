package com.assignment5_1;

import java.util.GregorianCalendar;

public class Professor extends DeptEmployee {
	// Constructor 
	public Professor(double salary, String name, GregorianCalendar hireDate, int numberOfPublications) {
		super(salary, name, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	private int numberOfPublications;
	
	// setter / mutator 
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	// getter / accessor
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
}

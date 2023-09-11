package com.assignment5_1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Professor emp1 = new Professor(1, "Yonatan", new GregorianCalendar(2022, 2, 22), 10);
		Professor emp2 = new Professor(2, "Daniel", new GregorianCalendar(2019, 5, 19), 10);
		Professor emp3 = new Professor(3, "Kiniena", new GregorianCalendar(2020, 7, 17), 10);

		Secretary emp4 = new Secretary(4, "Rachel", new GregorianCalendar(2018, 5, 21), 200);
		Secretary emp5 = new Secretary(5, "Sarah", new GregorianCalendar(2015, 9, 28), 200);

		// Array of department employees

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = emp1;
		department[1] = emp2;
		department[2] = emp3;
		department[3] = emp4;
		department[4] = emp5;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Do you wish to see the sum of salaries in the departemtn? [Y/N]: ");
			String strSalary = scanner.next();

			if (strSalary.equalsIgnoreCase("Y")) {
				double sum = 0;
				for (int i=0; i<department.length; i++) {
					sum += department[i].salary;
				}
				System.out.println("The sum of salary in the department is " + sum + " USD");

			} else {
				// Do nothing ...
			}
			System.out.println("---------------------------------------------------------------");
			System.out.print("Do you wish to see details of an employee? [Y/N]: ");
			String strDetails = scanner.next();
			
			if (strDetails.equalsIgnoreCase("y")) {
				System.out.print("Provide the name for the employee: ");
				String strNameEmployee = scanner.next();
				for (int i=0; i<department.length; i++) {
					if (strNameEmployee.equalsIgnoreCase(department[i].getName())) {
						System.out.print("The details of the employee is: "+department[i].toString());
						return;
					}
				}
				System.out.print("There is no an employee by that name.");
			} else {
				// Do nothing ...
			}
			//scanner.close();
		}
	}

}

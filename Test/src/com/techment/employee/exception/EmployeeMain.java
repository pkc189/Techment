package com.techment.employee.exception;

import java.util.Scanner;

class Employee extends RuntimeException {
	private String firstName;
	private String lastName;

	// Constructor
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void validation(String firstName, String lastName) throws NameException {
		if (firstName.length() < 3 || lastName.length() < 3) {
			throw new NameException("Name should be more than 3 chars ");

		} else if (firstName == null || lastName == null)
			throw new NullPointerException("Should not null or empty");

	}

}

class NameException extends Exception {
	public NameException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
}

public class EmployeeMain {

	public static void main(String[] args) throws NameException {

		try {

			Scanner scanner = new Scanner(System.in);

			// Taking input from user , number of persons
			System.out.println("Enter First name :");
			String firstName = scanner.next();

			System.out.println("Enter Last name :");
			String lastName = scanner.next();

			Employee emp1 = new Employee(firstName, lastName);
			emp1.validation(firstName, lastName);

		} catch (NameException e) {
			System.out.println(e.getMessage());
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}

	}

}

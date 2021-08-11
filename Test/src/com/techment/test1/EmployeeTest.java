package com.techment.test1;

class Employee {
	String firstName;
	String lastName;

	// Constructor
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// toString Method
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class EmployeeTest {

	public static void main(String[] args) {

		// Creating instance of Employee class

		Employee emp1 = new Employee("Pankaj", "Chouhan");
		Employee emp2 = new Employee("Akshya", "Saini");
		Employee emp3 = new Employee("Naman", "Jain");

		System.out.println(emp1);

		System.out.println(emp2);

		System.out.println(emp3);

	}

}

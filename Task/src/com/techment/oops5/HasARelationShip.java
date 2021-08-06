package com.techment.oops5;

class Employee{
	int id;
	String name;
	Address address; // object reference
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("address "+address.doorNo);
		System.out.println("street "+address.streetName);
		System.out.println("pincode "+address.pincode);
	}
	
}

class Address{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	
}

public class HasARelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address addr = new Address(101,"Housing","Durg",490026);
		
		Employee emp1 = new Employee(100,"Pankaj",addr);
		emp1.displayEmployeeInfo();
		
		
	}

}

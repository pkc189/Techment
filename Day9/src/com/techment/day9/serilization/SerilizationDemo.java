package com.techment.day9.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	transient String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}


public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(1,"sachin");
		System.out.println("started");
		FileOutputStream fos = new FileOutputStream("hello.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp1);
		System.out.println("completed");
		
		
	}

}

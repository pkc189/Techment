package com.techment.keyword;


public class Student{      
 
	private String name;
	 int rollno;
	 int age;
	 
	void info(){
		name="pk";
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	
	
	public static void main(String[] args) {
		Student student = new Student();
		
		// Accessing and property value
		student.name = "Ramesh";
		student.rollno = 253;
		student.age = 25;
		
		// Calling method
		student.info();
		
	}
}  
	
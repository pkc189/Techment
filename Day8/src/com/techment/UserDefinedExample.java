package com.techment;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int age;
	
	
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}


	@Override
	public String toString() {
		return "id=" + id + ",\n name=" + name + ", \n dept=" + dept + ",\n age=" + age + "";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		
		
		if(this.name.equals(o.name))
			return 1;
		else 
			return -1;
		
		
	}
	
	
	
	
	
	
}
public class UserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		
		employees.add(new Employee(1,"Pankaj","ceo",22));
		employees.add(new Employee(2,"Aakash","ceo",45));
		employees.add(new Employee(3,"Sunil","hr",34));
		employees.add(new Employee(4,"Manoj","developer",30));
		
		Collections.sort(employees);
		System.out.println(employees);
		
		
		
		
	}

}

package com.techment.day12.newfeature;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String dept;
	private int age;
	
	public Employee(int id, String name, String dept, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}
	public String getdept() {
		return dept;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String dept) {
		super();
		this.dept = dept;
	}
	
	
	
}

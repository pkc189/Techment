package com.techment.debug;





class Employee{
	
int id;
String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

String display() {
	String message = "hi";
	return " id "+id + " name "+name;
}

}
public class EmployeeDemo {

	public static void main(String[] args) {

          Employee emp1 = new Employee(1, "sachin");
          String res = emp1.display();
          System.out.println(res);
	}

}

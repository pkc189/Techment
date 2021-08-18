package com.techment.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getAge() == o2.getAge())
			return 0;
		else if (o1.getAge() > o2.getAge())
			return 1;
		else
			return -1;

	}

}

public class StreamSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		//employees.forEach(s -> System.out.println(s));

		StreamSortDemo obj = new StreamSortDemo();
		obj.DeptWiseDetails(employees);
		System.out.println(obj.maxSalary(employees));
		System.out.println(obj.maxSalaryOfDep(employees,"developer"));
		System.out.println(obj.minSalaryOfhr(employees));
		
	}

	void DeptWiseDetails(ArrayList<Employee> employees) {
		 employees.stream().forEach(System.out::println);
	}

	Double maxSalary(ArrayList<Employee> employees) {

		Double maxSalaryOfEmp = employees.stream().map(Employee::getSalary).max(Double::compare).get();

		return maxSalaryOfEmp;

	}
	
	Double maxSalaryOfDep(ArrayList<Employee> employees,String dept) {

		Double maxSalaryOfDept = employees.stream().filter(e->e.getdept().equals(dept)).map(Employee::getSalary).max(Double::compare).get();

		return maxSalaryOfDept;

	}
	
	Double minSalaryOfhr(ArrayList<Employee> employees) {

		Double maxSalaryOfhr = employees.stream().filter(e->e.getdept().equals("hr")).map(Employee::getSalary).min(Double::compare).get();

		return maxSalaryOfhr;

	}
	
	

}

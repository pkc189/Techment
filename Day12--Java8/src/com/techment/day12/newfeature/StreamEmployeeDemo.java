package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamEmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		employees.stream().forEach(s->System.out.println(s));
		
		//to count no of employee
		Long empcount =employees.stream().count();
		System.out.println("total number of employee are "+ empcount);
		
		Long devCount = employees.stream().filter(e->e.getdept().equals("developer")).count();
		System.out.println("developer count "+ devCount);
		
		employees.stream().filter(e->e.getdept().equals("developer")).forEach(e->System.out.println("name of developer :"+e.getName()));
		
	  List<Employee> emp=employees.stream().filter(e->e.getdept().equals("developer")).collect(Collectors.toList());
       System.out.println(emp);
     Long numberOfEmployee =  employees.stream().collect(Collectors.counting());
     System.out.println("no of employee "+numberOfEmployee);
     StreamEmployeeDemo obj = new StreamEmployeeDemo();
     List<Employee> empDepts= obj.filterByDept(employees, "developer");
     System.out.println(empDepts);
		
//	Long totalSalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
//	System.out.println("total salary :"+totalSalary);
//	
//	int maxSalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
//	System.out.println("total salary :"+maxSalary);
//	
	
	}
	
	
	
	
	List filterByDept(ArrayList<Employee> empList, String dept)
	{
		List<Employee> emp =empList.stream().filter(e->e.getdept().equals(dept)).collect(Collectors.toList());
		
		return emp;
		
	}
	
	
	
	
}

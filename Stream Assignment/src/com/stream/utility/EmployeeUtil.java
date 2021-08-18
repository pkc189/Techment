package com.stream.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.stream.model.Department;
import com.stream.model.Employee;

public class EmployeeUtil {

	static ArrayList<Employee> employees = new ArrayList<Employee>();
	static ArrayList<Department> departments = new ArrayList<Department>();

	static {

		Department d1 = new Department(1, "hr", 5679);
		Department d2 = new Department(2, "developer", 5680);
		Department d3 = new Department(3, "QA", 5673);
		Department d4 = new Department(4, "Testing", 0);

		departments.add(d1);
		departments.add(d2);
		departments.add(d3);
		departments.add(d4);
		departments.add(new Department(4, "hr", 5659));

		try {
			employees.add(new Employee(22, "Pankaj", "Chouhan", "pankajchauhan189@gmail.com", "8770631461",
					new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2020"), "Developer", 50000, 5680, d2));
			employees.add(new Employee(27, "Naveen", "Singh", "naveensingh19@gmail.com", "6770631461",
					new SimpleDateFormat("dd/MM/yyyy").parse("1/03/2010"), "Developer", 90000, 5680, d2));
			employees.add(new Employee(23, "Rohan", "Gupta", "rohangupta@gmail.com", "960631461",
					new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2021"), "recuiter", 23000, 5679, d1));
			employees.add(new Employee(28, "Robert", "mey", "robertmey@gmail.com", "960031461",
					new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2020"), "recuiter", 78000, 5679, null));
			

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Employee> getEmployeeList(){
		return employees;
	}
	public static List<Department> getDepartmentList(){
			return departments;
		
	

}}

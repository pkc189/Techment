package com.stream.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.stream.model.Department;
import com.stream.model.Employee;
import com.stream.service.IEmployeeService;
import com.stream.service.IEmployeeServiceImpl;
import com.stream.utility.EmployeeUtil;

public class Application {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// interface obj = new Class();
		IEmployeeService service = new IEmployeeServiceImpl();

		EmployeeUtil empUtil = new EmployeeUtil();
		

		ArrayList<Employee> employees = empUtil.getEmployeeList();
		ArrayList<Department> departments = empUtil.getDepartmentList();

		System.out.println("=====Employee Application====");

		System.out.println("Sum of salary of all emp ");
		double sumOfSalaryOfAllEmployees = service.sumOfSalaryOfAllEmployees(employees);
		System.out.println(sumOfSalaryOfAllEmployees);

		System.out.println("Department names count wise \n");
		//service.employeeCountByDepartment(employees);
		
		
		System.out.println("Senior most employee ");
		service.seniorMostEmp(employees);
		
		System.out.println("\nEmployees duration ");
		service.employeeDuration(employees);
		
		System.out.println("\nEmployee without department ");
		service.employeeWithoutDepartment(employees);
		
		System.out.println("\nDepartment without employees");
		service.deptWithoutEmp(departments);

		System.out.println("\nDepartment with highest count of employees");
		service.deptWithHighestCountOfEmp(employees);
		
		System.out.println("\nList Employee name , hire date and hire day ");
		service.empNameDayDateDetails(employees);
		
		System.out.println("\nList Employee details hired on particular date ");
		service.empNameDetailsHired(employees,"FRIDAY");

		System.out.println("\nList Employee details report to manager ");
		service.empDetailsReportToManager(employees);
		
		System.out.println("\nEmployee Salary increases by 15% ");
		service.empSalaryIncreasesBy(employees,15);
		
		
		System.out.println("All sorting");
		
		service.sortAll(employees,departments);
		
		
		System.out.println("Emp without manager ");
		service.empWithoutManager(employees);
		
		
		//System.out.println(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2020"));
		
		
	}

		

}

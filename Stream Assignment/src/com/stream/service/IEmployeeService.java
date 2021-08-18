package com.stream.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.stream.model.Department;
import com.stream.model.Employee;

public interface IEmployeeService {

	double sumOfSalaryOfAllEmployees(ArrayList<Employee> employees);
	Map<Department, Long> employeeCountByDepartment(ArrayList<Employee> employees);
	void seniorMostEmp(ArrayList<Employee> employees);
	void employeeDuration(ArrayList<Employee> employees);
	void employeeWithoutDepartment(ArrayList<Employee> employees);
	void deptWithoutEmp(List<Department> departments);
	void deptWithHighestCountOfEmp(ArrayList<Employee> employees);
	void empNameDayDateDetails(ArrayList<Employee> employees);
	void empNameDetailsHired(ArrayList<Employee> employees, String string);
	void empDetailsReportToManager(ArrayList<Employee> employees);
	void empSalaryIncreasesBy(ArrayList<Employee> employees, int i);
	void sortAll(ArrayList<Employee> employees, List<Department> departments);
}

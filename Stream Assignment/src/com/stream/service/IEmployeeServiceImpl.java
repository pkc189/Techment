package com.stream.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.stream.dao.IEmployee;
import com.stream.dao.IEmployeeDaoImpl;
import com.stream.model.Department;
import com.stream.model.Employee;

public class IEmployeeServiceImpl implements IEmployeeService {

	IEmployee employee = new IEmployeeDaoImpl();

	@Override
	public double sumOfSalaryOfAllEmployees(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		return employee.sumOfSalaryOfAllEmployees(employees);
	}

	@Override
	public Map<Department, Long> employeeCountByDepartment(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		return employee.employeeCountByDepartment(employees);
	}

	@Override
	public void seniorMostEmp(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employee.seniorMostEmp(employees);
		
	}

	@Override
	public void employeeDuration(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		
		employee.employeeDuration(employees);
	}

	@Override
	public void employeeWithoutDepartment(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employee.employeeWithoutDepartment(employees);
	}

	@Override
	public void deptWithoutEmp(List<Department> departments) {
		// TODO Auto-generated method stub
		employee.deptWithoutEmp(departments);
		
	}

	@Override
	public void deptWithHighestCountOfEmp(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employee.deptWithHighestCountOfEmp(employees);
	}

	@Override
	public void empNameDayDateDetails(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employee.empNameDayDateDetails(employees);
		
	}

	@Override
	public void empNameDetailsHired(ArrayList<Employee> employees, String string) {
		// TODO Auto-generated method stub
		employee.empNameDetailsHired(employees,string);
		
	}

	@Override
	public void empDetailsReportToManager(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employee.empDetailsReportToManager(employees);
		
	}

	@Override
	public void empSalaryIncreasesBy(ArrayList<Employee> employees, int i) {
		// TODO Auto-generated method stub
		employee.empSalaryIncreasesBy(employees,i);
		
	}



	@Override
	public void sortAll(ArrayList<Employee> employees, List<Department> departments) {
		// TODO Auto-generated method stub
		employee.sortAll(employees,departments);
	}

}

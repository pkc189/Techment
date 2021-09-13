package com.techment.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.techment.model.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(Long id);
	String updateEmployeeById(Long id,Employee employeeDetails);
	String createEmployee(Employee employee);
	String deleteEmployeeById(Long id);
}

package com.techment.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.exception.ResourceNotFoundException;
import com.techment.model.Employee;
import com.techment.service.IEmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private IEmployeeService iEmployeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return iEmployeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {

		try {
			Employee employee = iEmployeeService.getEmployeeById(employeeId);
			return ResponseEntity.ok().body(employee);
		} catch (Exception e) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}

	}

	@PostMapping("/employees")
	public String createEmployee(@RequestBody Employee employee) {
		return iEmployeeService.createEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@RequestBody Employee employeeDetails) {
		try {
			iEmployeeService.updateEmployeeById(employeeId, employeeDetails);
			return ResponseEntity.ok().body("Updated");
		} catch (Exception e) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}

	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable(value = "id") Long employeeId) {

		return iEmployeeService.deleteEmployeeById(employeeId);
	}
}
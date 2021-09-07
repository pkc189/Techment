package com.techment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;
import com.techment.service.IEmployeeService;

@RestController
@RequestMapping
public class EmployeeControllerWithDb {

	@Autowired
	IEmployeeService iEmployeeService;

	@GetMapping("/viewAllEmployee")
	public List<Employee> viewAllEmployee() {
		return iEmployeeService.viewAllEmployees();

	}
	
	
	@PostMapping("/addNewEmployee")
	public ResponseEntity<String> addNewEmployee(@RequestBody Employee employee) {
		//return iEmployeeService.addEmployee(employee);
		return new ResponseEntity<String>("added",HttpStatus.OK);
	}
	
	@GetMapping("/viewEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return iEmployeeService.viewEmployeeById(id);
	}
	
	@GetMapping("{name}/{dept}")
	public Employee getEmployee(@PathVariable String name,@PathVariable String dept) {
		return new Employee(name, dept);
	}
	
	@GetMapping("/employee")
	public Employee empQueryParam(@RequestParam String name,@RequestParam String dept)
	{
		return new Employee(name, dept);
		
	}
	
	
}

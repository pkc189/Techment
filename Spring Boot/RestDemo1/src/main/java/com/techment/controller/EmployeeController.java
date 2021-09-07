package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;
import com.techment.service.IEmployeeService;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	@Autowired
	IEmployeeService iEmployeeService;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	@GetMapping("/showMessage")
	public String  hello() {
		return "this is my first demo";
		
	}
	
	
	
	@GetMapping("/getAllEmployee")
	public ArrayList<Employee>  showsEmployees() {
		
		
//		employees.add(new Employee(1, "Pk", "etc"));
//		employees.add(new Employee(2, "Pk", "etc"));
//		employees.add(new Employee(3, "Pk", "etc"));
//		employees.add(new Employee(4, "Pk", "etc"));
		
		return employees;
		
	}
	
	@PostMapping(value="addNewEmployee")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		
		employees.add(employee);
		//return "employee added";
		
		return new ResponseEntity<String>("employee added",HttpStatus.OK);
	}
	
	
}

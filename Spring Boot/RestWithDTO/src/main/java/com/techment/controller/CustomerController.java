package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDTO;
import com.techment.entity.Customer;
import com.techment.exception.IDNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping
public class CustomerController {

	@Autowired
	ICustomerService iCustomerService;

	@GetMapping("/viewAllCustomer")
	public ResponseEntity<List<CustomerDTO>> viewAllCustomer() {

		return new ResponseEntity<List<CustomerDTO>>(iCustomerService.viewAll(), HttpStatus.OK);
	}

	@GetMapping("/viewCustomerById/{id}")
	public ResponseEntity<CustomerDTO> viewCustomerById(@PathVariable int id) {

		// return new ResponseEntity<CustomerDTO>(iCustomerService.customerDTOById(id),
		// HttpStatus.OK);

		try {
			return new ResponseEntity<CustomerDTO>(iCustomerService.customerDTOById(id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			throw new IDNotFoundException("no present to get it ");
		}
	}
	
	
	@DeleteMapping("/deleteCustomerById/{id}")
	public ResponseEntity<String> deletedCustomerById(@PathVariable int id) {

		// return new ResponseEntity<CustomerDTO>(iCustomerService.customerDTOById(id),
		// HttpStatus.OK);

		try {
			return new ResponseEntity<String>(iCustomerService.deleteCustomerById(id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			throw new IDNotFoundException("no present to get it ");
		}
	}
	
	
	@PutMapping("/updateCustomerById/{id}")
	public ResponseEntity<String> updateCustomerById(@RequestBody CustomerDTO customerDTO,@PathVariable int id){
		
		
		try {
			
			return new ResponseEntity<String>(iCustomerService.updateCustomerById(customerDTO, id),HttpStatus.OK);
		}catch (NoSuchElementException e) {
			throw new IDNotFoundException("no present to get it ");
		}
		
	}
	

	@PostMapping("/addNewCustomer")
	public ResponseEntity<String> addNewCustomer(@RequestBody CustomerDTO customerDTO) {

		iCustomerService.addNewCustomer(customerDTO);
		return new ResponseEntity<String>("added", HttpStatus.OK);
	}

	@ExceptionHandler(value = IDNotFoundException.class)
	public ResponseEntity<Object> myException(IDNotFoundException exception) {
		return new ResponseEntity<Object>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}

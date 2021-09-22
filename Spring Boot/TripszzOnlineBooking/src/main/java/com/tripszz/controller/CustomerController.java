package com.tripszz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripszz.entity.Customer;
import com.tripszz.service.ICustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	@Autowired
	ICustomerService iCustomerService;

	@PostMapping("/createNewCustomer")
	public ResponseEntity<Customer> createNewCustomer(@RequestBody Customer customer) {
		try {

			Customer customer2 = iCustomerService.createCutstomer(customer);

			return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);

		} catch (Exception e) {

		}
		return null;

	}

}

package com.tripszz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripszz.entity.Booking;
import com.tripszz.entity.Flight;
import com.tripszz.repository.IBooking;


@RestController
@RequestMapping("/api/v1/")
public class BookingController {

	@Autowired
	IBooking iBooking;
//
//	@GetMapping("/findByFlightId/{id}")
//	public ResponseEntity<Booking> findByFlightId(@RequestBody Flight flight) {
//		try {
//
//			Booking customer2 = iCustomerService.createCutstomer(customer);
//
//			return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);
//
//		} catch (Exception e) {
//
//		}
//		return null;
//
//	}
}

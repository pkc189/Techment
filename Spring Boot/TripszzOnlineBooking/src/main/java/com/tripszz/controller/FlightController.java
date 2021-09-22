package com.tripszz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripszz.entity.Flight;
import com.tripszz.repository.IFlight;
import com.tripszz.service.IFlightService;

@RestController
@RequestMapping("/api/v1")
public class FlightController {

	@Autowired
	IFlightService iFlightService;
	
	@Autowired
	IFlight iFlight;
	
	@PostMapping("/createNewFlight")
	public ResponseEntity<Flight> createNewFlight(@RequestBody Flight flight)
	{
		try {
		      Flight flight2= iFlightService.createFlight(flight);
		      
		      return new ResponseEntity<Flight>(flight2,HttpStatus.CREATED);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@GetMapping("/viewAllFlight")
	public ResponseEntity<List<Flight>> viewAllFlight()
	{
		try {
		      List<Flight> flights= iFlightService.viewAllFlight();
		      
		      return new ResponseEntity<List<Flight>>(flights,HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@GetMapping("/findByAmount/{amount}")
	public ResponseEntity<Flight> findByAmount(@PathVariable int amount)
	{
		try {
		      Flight flight = iFlight.findByAmount(amount);
		      
		      return new ResponseEntity<Flight>(flight,HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@GetMapping("/findByAmountLessThan/{amount}")
	public ResponseEntity<List<Flight>> findByAmountLessThan(@PathVariable int amount)
	{
		try {
		      List<Flight> flight = iFlight.findByAmountLessThan(amount);
		      
		      return new ResponseEntity<List<Flight>>(flight,HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@GetMapping("/findByAmountGreaterThan/{amount}")
	public ResponseEntity<List<Flight>> findByAmountGreaterThan(@PathVariable int amount)
	{
		try {
			List<Flight> flight = iFlight.findByAmountGreaterThan(amount);
		      
		      return new ResponseEntity<List<Flight>>(flight,HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
}

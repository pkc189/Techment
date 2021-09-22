package com.tripszz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripszz.entity.Flight;
import com.tripszz.repository.IFlight;
import com.tripszz.service.IFlightService;

@Service
public class FlightServiceImpl implements IFlightService {

	@Autowired
	IFlight flightDao;
	
	@Override
	public Flight createFlight(Flight flight) {
		
		return flightDao.save(flight);
	}

	@Override
	public List<Flight> viewAllFlight() {
		// TODO Auto-generated method stub
		return flightDao.findAll();
	}

}

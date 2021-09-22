package com.tripszz.service;

import java.util.List;

import com.tripszz.entity.Flight;

public interface IFlightService {

	Flight createFlight(Flight flight);
	List<Flight> viewAllFlight();
}

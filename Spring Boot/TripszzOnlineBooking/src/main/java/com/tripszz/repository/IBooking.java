package com.tripszz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripszz.entity.Booking;
import com.tripszz.entity.Flight;

public interface IBooking extends JpaRepository<Booking, Integer> {
 Booking findByFlight(Flight flight);
}

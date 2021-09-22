package com.tripszz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripszz.entity.Flight;

public interface IFlight extends JpaRepository<Flight, Integer> {
    Flight findByAmount(int amount);
    List<Flight> findByAmountLessThan(int amount);
    List<Flight> findByAmountGreaterThan(int amount);

    Flight findByDestination(String destination);
}

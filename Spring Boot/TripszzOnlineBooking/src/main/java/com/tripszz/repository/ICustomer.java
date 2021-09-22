package com.tripszz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripszz.entity.Customer;

public interface ICustomer extends JpaRepository<Customer, Integer> {

}

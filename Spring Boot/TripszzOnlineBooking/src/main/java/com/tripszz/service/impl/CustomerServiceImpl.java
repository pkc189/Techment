package com.tripszz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripszz.entity.Customer;
import com.tripszz.repository.ICustomer;
import com.tripszz.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomer customerDao;
	
	@Override
	public Customer createCutstomer(Customer customer) {
		
		return customerDao.save(customer);
	}

	
}

package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDTO;
import com.techment.entity.Customer;


public interface ICustomerService {

	String addNewCustomer(CustomerDTO customerDTO);
	List<CustomerDTO> viewAll();
	CustomerDTO customerDTOById(int id);
	String deleteCustomerById(int id);
	String updateCustomerById(CustomerDTO customerDTO,int id);
}

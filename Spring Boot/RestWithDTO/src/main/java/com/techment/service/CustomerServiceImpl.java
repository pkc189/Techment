package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDTO;
import com.techment.entity.Customer;
import com.techment.exception.ValidationException;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao iCustomerDao;

	@Override
	public String addNewCustomer(CustomerDTO customerDTO)throws ValidationException {

		Customer customer = new Customer(customerDTO.getAge(), customerDTO.getName(), customerDTO.getAddress(),
				customerDTO.getEmail(), customerDTO.getMobile());
		iCustomerDao.save(customer);
		return "customer added";
	}

	@Override
	public List<CustomerDTO> viewAll() {


		List<Customer> customers = iCustomerDao.findAll();
		
		List<CustomerDTO> customerDTO = new ArrayList<CustomerDTO>();
		
		for(Customer c: customers)
		{
			customerDTO.add(new CustomerDTO(c.getAge(),c.getName()));
		}
		
		
		return customerDTO;
	}

	@Override
	public CustomerDTO customerDTOById(int id)throws NoSuchElementException {
		// TODO Auto-generated method stub
		
		Customer c = iCustomerDao.findById(id).get();
		CustomerDTO dto =  new CustomerDTO(c.getAge(), c.getName(), c.getAddress(), c.getAddress(), c.getMobile());
	
		return dto;
	}

	@Override
	public String deleteCustomerById(int id)throws NoSuchElementException  {
		
		 iCustomerDao.deleteById(id);
		 return "Deleted";
	}

	@Override
	public String updateCustomerById(CustomerDTO customerDTO, int id)throws NoSuchElementException  {
		
		Customer newCustomer = iCustomerDao.findById(id).get();
		
		//CustomerDTO newCustomer = new CustomerDTO();
		newCustomer.setAddress(customerDTO.getAddress());
		newCustomer.setAge(customerDTO.getAge());
		newCustomer.setEmail(customerDTO.getEmail());
		newCustomer.setMobile(customerDTO.getMobile());
		iCustomerDao.save(newCustomer);
		
		return "Updated";
	}

}

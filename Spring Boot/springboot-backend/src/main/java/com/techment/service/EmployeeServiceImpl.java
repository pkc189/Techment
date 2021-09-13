package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techment.dao.IEmployeeDao;
import com.techment.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao iEmployeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return iEmployeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		
		return iEmployeeDao.findById(id).get();
	}

	@Override
	public String updateEmployeeById(Long id, Employee newEmp) {

		Employee oldEmp = iEmployeeDao.findById(id).get();
		
		
		oldEmp.setFirstName(newEmp.getFirstName());
		oldEmp.setLastName(newEmp.getLastName());
		oldEmp.setEmailId(newEmp.getEmailId());
		
		iEmployeeDao.save(oldEmp);
		
		return "Updated";
	}

	@Override
	public String createEmployee(Employee employee) {
		iEmployeeDao.save(employee);
		return "Created";
	}

	@Override
	public String deleteEmployeeById(Long id) {
		iEmployeeDao.deleteById(id);
		return "Deleted";
	}

}

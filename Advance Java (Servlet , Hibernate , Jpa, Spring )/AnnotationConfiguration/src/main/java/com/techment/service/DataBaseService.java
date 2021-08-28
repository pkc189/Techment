package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Employee;
import com.techment.dao.IDao;

// this class wants dao name

@Service("anyNamehere")
public class DataBaseService {
	
	@Autowired
	@Qualifier("mySql")
	IDao dao;

	@Autowired
	Employee employee;
	
	public void displayDatabaseInfo()
	{
		dao.dataBaseName();
		employee.displayEmployeeInfo();
	}
	
	
	
}

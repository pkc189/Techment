package com.techment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

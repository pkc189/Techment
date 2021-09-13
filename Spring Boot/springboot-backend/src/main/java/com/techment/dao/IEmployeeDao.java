package com.techment.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.model.Employee;

public interface IEmployeeDao extends  JpaRepository<Employee, Long> {

}

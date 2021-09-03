package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Student;

public interface IStudentDao extends JpaRepository<Student, Integer> {

	public List<Student> findByName(String name);
}

package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.modal.Student;

public interface IStudentDao extends JpaRepository<Student, Long> {

}

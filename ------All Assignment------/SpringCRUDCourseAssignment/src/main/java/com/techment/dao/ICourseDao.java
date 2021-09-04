package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Course;

@Repository
public interface ICourseDao extends JpaRepository<Course, Integer> {

}

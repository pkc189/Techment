package com.techment.service;

import java.util.List;

import com.techment.entity.Course;

public interface ICourseService {

	List<Course> listAllCourse();
	String addCourse(Course course);
	Course viewCourseById(int id);
	String updateCourseById(int id);
	String deleteCourseById(int id);
	void save(Course course);
}

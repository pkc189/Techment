package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Course;
import com.techment.service.ICourseService;

@RestController
@RequestMapping("/courseController")
public class CourseController {
	
	@Autowired
	ICourseService iCourseService;
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses(){
		return iCourseService.listAllCourse();
	}
	
	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable int id) {
		return iCourseService.viewCourseById(id);
	}
	
	@PostMapping("/addNewCourse")
	private String addNewCourse(@RequestBody Course course) {
		return iCourseService.addCourse(course);
		

	}
	
	@DeleteMapping("/deleteById/{id}")
	private String deleteById(@PathVariable int id) {
		return iCourseService.deleteCourseById(id);
		// TODO Auto-generated method stub

	}
	
	@PutMapping("/update/{id}")
	public String update(@RequestBody Course course,@PathVariable int id) {
	try {
	// if the course already exists, update it
	Course c = iCourseService.viewCourseById(id);
	
	Course _c = c;
	
	_c.setName(course.getName());
	_c.setPrice(course.getPrice());
	
	System.out.println(_c);
	iCourseService.save(_c);
	return "course updated";
	} catch (NoSuchElementException e) {
	return "Not a valid course id";
	}
	}

	

}

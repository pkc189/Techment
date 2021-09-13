package com.techment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.techment.dao.IStudentDao;
import com.techment.modal.Student;
import com.techment.service.IStudentService;

@Controller
public class StudentController {

	@Autowired
	private IStudentService iStudentService;
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", iStudentService.getAllStudents());
	
		return "students";
	}
	
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
	Student student = new Student();
		model.addAttribute("student", iStudentService.getAllStudents());
	
		return "create_student";
	}
	
}

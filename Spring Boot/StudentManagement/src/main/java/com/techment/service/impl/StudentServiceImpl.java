package com.techment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IStudentDao;
import com.techment.modal.Student;
import com.techment.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao iStudentDao;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return iStudentDao.findAll();
	}

}

package com.techment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IStudentDao;
import com.techment.modal.Student;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private IStudentDao iStudentDao;
	
	@Override
	public void run(String... args) throws Exception {
	
  Student student1 = new Student("Pankaj", "Chouhan", "pankajchauhan189@gmail.com");
  Student student2 = new Student("Rakesh", "Chouhan", "rakeshchauhan189@gmail.com");
  Student student3 = new Student("Jo", "Chouhan", "joechauhan189@gmail.com");
  
//  iStudentDao.save(student1);
//  iStudentDao.save(student2);
//  iStudentDao.save(student3);
  
  
  
		
	}

}

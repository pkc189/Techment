package com.manytoone;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// One course 
		Course course1 = new Course(231, "java", 4);
		
		
		//many students
		Student stu1 = new Student(13, "Pankaj",course1);
		Student stu2 = new Student(20, "Rohit",course1);
		Student stu3 = new Student(35, "Uttkarsh",course1);

		

		

		//Persiting to database here
		em.persist(course1);
		em.persist(stu1);
		em.persist(stu2);
		em.persist(stu3);
	
		
		
		System.out.println("Inserted");

		em.getTransaction().commit();
	}

}

package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Course java = new Course(1, "Java", 4);
		Course javascript = new Course(2, "Javascript", 3);
		Course python = new Course(3, "python", 5);

		List<Course> courses = new ArrayList<Course>();

		courses.add(java);
		courses.add(javascript);
		courses.add(python);

		Student stu1 = new Student(1, "Pankaj", courses);

		em.persist(java);
		em.persist(python);
		em.persist(javascript);
		em.persist(stu1);

		System.out.println("Inserted");

		em.getTransaction().commit();
	}

}

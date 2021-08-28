package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
	
		
//		Object o = session.load(Student.class,new student_0(123));
//		Student s = (Student)o;
//		
		Transaction tx = session.beginTransaction();
		
		
		
		
		Student student = new Student();
		student.setName("Pankaj");
		student.setDept("CSE");
		student.setStudentId(123);
		session.persist(student);
		System.out.println("inserted");
		
//		session.delete(s);
//		System.out.println("deleted successfully ");

		tx.commit();

		session.close();
	}

}

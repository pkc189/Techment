package com.techment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ReteriveDemo2 {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");


		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query<StudentDto> query= session.createQuery("select s.studentId,s.name from Student s");
 
		
		ArrayList l  = (ArrayList) query.list();
		
		//System.out.println(l.get(0).));


	}

}

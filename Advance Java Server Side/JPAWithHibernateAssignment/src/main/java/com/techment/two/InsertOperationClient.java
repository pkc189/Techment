package com.techment.two;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertOperationClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Auth pankaj = new Auth("Pankaj");
		Auth harivansh = new Auth("Harivansh");

		
		
		Book java = new Book("Java", 234,pankaj);
		Book python = new Book("Python", 300,pankaj);
		Book cpp = new Book("C++", 134,harivansh);
		Book javascript = new Book("C++", 634,harivansh);

//		Set<Book> books1 = new HashSet();
//		Set<Book> books2 = new HashSet();
//
//		books1.add(java);
//		books1.add(python);
//		books2.add(cpp);
//		books2.add(javascript);
//		
//
//		pankaj.setBooks(books1);
//		harivansh.setBooks(books2);
		 
	
		em.persist(java);
		em.persist(python);
		em.persist(cpp);
		em.persist(pankaj);
		em.persist(harivansh);

		em.getTransaction().commit();
		System.out.println("Inserted");

	}

}

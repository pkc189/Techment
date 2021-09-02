package com.techment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBidirectionalClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Library lib1 = new Library("Arihant Library");

		Book java = new Book("java", lib1);
		Book python = new Book("python", lib1);

		Set<Book> books = new HashSet<Book>();

		books.add(java);
		books.add(python);
		
		lib1.setBooks(books);
		
		
		em.persist(lib1);
		em.persist(java);
		em.persist(python);

		System.out.println("Inserted");

		em.getTransaction().commit();
	}

}

package com.techment.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertAuthorClient {
	

	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();


		Author author1 = new Author("Pankaj", "Ku", "Chouhan", 975868384);
		Author author2 = new Author("Harivansh", "Rai", "Bachhan", 893549354);
		em.persist(author1);
		em.persist(author2);
		
		em.getTransaction().commit();
	}

}

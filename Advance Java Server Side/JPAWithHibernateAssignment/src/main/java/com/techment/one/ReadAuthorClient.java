package com.techment.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadAuthorClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Author author = em.find(Author.class, 16);

		System.out.println("First name "+author.getFirstName());
		System.out.println("Last Name "+author.getLastName());
		System.out.println("Phone no "+author.getPhoneNo());

		em.getTransaction().commit();
		em.close();
	}

}

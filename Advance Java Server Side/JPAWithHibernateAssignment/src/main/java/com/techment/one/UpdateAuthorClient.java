package com.techment.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateAuthorClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Author author = em.find(Author.class, 17);

		author.setFirstName("Hello");

		em.getTransaction().commit();
		em.close();
	}

}

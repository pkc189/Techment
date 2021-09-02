package com.techment.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteAuthorClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Author author = em.find(Author.class, 17);

		em.remove(author);
		System.out.println("deleted");

		em.getTransaction().commit();
		em.close();
	}

}

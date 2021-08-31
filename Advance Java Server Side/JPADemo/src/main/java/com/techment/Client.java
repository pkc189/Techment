package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	

	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Product product = new Product();

		product.setName("gadget3");
		product.setId(7);
		product.setPrice(45000);
		product.setCategory("electronics");

		em.persist(product);

		em.getTransaction().commit();
	}

}

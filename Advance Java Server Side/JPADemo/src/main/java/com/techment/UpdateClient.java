package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateClient {
	

	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

	

		Product product= em.find(Product.class, 1);
		
		
		product.setName("clothes");
		

		em.persist(product);

		em.getTransaction().commit();
	}

}

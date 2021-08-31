package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		// em.getTransaction().begin();

		System.out.println("========================");
		Query qry = em.createQuery("delete from Product where id=1");
		// Query qry = em.createQuery("update Product SET Category='fashion' where
		// id=1");

		qry.executeUpdate();

		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}

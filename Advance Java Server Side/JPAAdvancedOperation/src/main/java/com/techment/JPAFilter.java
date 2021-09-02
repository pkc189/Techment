package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JPAFilter {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query q1 = em.createQuery("select p from Product p where p.id between 3 and 5");

		 

	 
		List<Product> list = q1.getResultList();

		System.out.println("name");

		for (Product s : list) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCategory());

		}

		
	System.out.println("LIKE operator ");
		Query q2 = em.createQuery("select p from Product p where p.name like '%il%'");
		
		

		List<Product> list2 = q2.getResultList();

	

		for (Product s : list2) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCategory());

		}
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

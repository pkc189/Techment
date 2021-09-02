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

public class JPASorting {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query q1 = em.createQuery("select p from Product p order by p.name");

		 

	 
		@SuppressWarnings("unchecked")
		List<Product> list = q1.getResultList();

		System.out.println("sorting by name ");

		for (Product s : list) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCategory());

		}

	
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

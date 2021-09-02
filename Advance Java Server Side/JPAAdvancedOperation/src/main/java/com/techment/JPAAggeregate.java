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

public class JPAAggeregate {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		System.out.println("Max id");
		Query q1 = em.createQuery("select MAX(s.id) from Product s");

		System.out.println("Max id :" + q1.getSingleResult());

		System.out.println("count ");
		Query q2 = em.createQuery("select count(p) from Product p");

		System.out.println("count is : " + q2.getSingleResult());




		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

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

public class JPACriteriaMultiSelect {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);

		Root<Product> product = cq.from(Product.class);
		cq.multiselect(product.get("s_age"),cb.count(product)).groupBy(product.get("s_age")).having(cb.ge(product.get("s_age"), 24));  
		cq.multiselect(product.get("name"),product.get("Category"));

		CriteriaQuery<Product> select = cq.select(product);
		TypedQuery<Product> q = em.createQuery(select);
		List<Product> list = q.getResultList();

		System.out.println("name");

		for (Product s : list) {
			System.out.println(s.getName()+" "+s.getCategory());

		}

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

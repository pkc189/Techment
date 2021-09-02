package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

import com.mysql.cj.AbstractQuery;

public class JPACriteriaGroupBy {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);

		Root<Product> product = cq.from(Product.class);

		cq.multiselect(product.get("id"),cb.count(product)).groupBy(product.get("id"));

		//CriteriaQuery<Product> select = cq.select(product);
		//TypedQuery<Product> q = em.createQuery(select);
		List<Product> list = em.createQuery(cq).getResultList();

		System.out.println("output----------------------------------------------");

		for (Product s : list) {
			System.out.println(s.getName()+" "+s.getId());

		}

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

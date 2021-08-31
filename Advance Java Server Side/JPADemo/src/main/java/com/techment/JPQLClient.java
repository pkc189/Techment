package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLClient {
	

	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		//em.getTransaction().begin();

Query query =  em.createQuery("select p.id from Product p");

//List<Product> products = query.getResultList();

//for(Product p:products)
//{
//	System.out.println(p.getId()+" "+p.getName());
//}

List<Integer> products = query.getResultList();
for(Integer p:products)
{
	System.out.println(p);
}


System.out.println("========================");


Query qry = em.createNamedQuery("findAllProduct");
List<Product> productList = qry.getResultList();

for(Product p:productList)
{
	System.out.println(p.getId()+" "+p.getName()+" "+p.getCategory());
}




	}

}

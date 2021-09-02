package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClient {
	

	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

        Address address = new Address();
        
        address.setCity("Bhilai");
        address.setDoorNo(305);
        address.setStreetName("Jamul");

        
        Employee employee = new Employee();
        
        employee.setName("Pankaj");
        employee.setDesignation("Ceo");
        employee.setId(1);
        employee.setAddress(address);
        
        
        em.persist(address);
        em.persist(employee);
        
        System.out.println("Inserted");
        
        
		em.getTransaction().commit();
	}

}

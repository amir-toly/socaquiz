package com.socaquiz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HelloWorldDao {

	private EntityManagerFactory entityManagerFactory;
	
	public HelloWorldDao(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
	public void create(HelloWorld helloWorld) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(helloWorld);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public HelloWorld getById(Long id) {
		HelloWorld helloWorld = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		helloWorld = entityManager.find(HelloWorld.class, id);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return helloWorld;
	}
}

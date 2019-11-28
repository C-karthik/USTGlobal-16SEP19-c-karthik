package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ustglobal.jpawithibernateapp.dto.Product;
public class ReatachingDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null ;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			Product p = entityManager.find(Product.class, 131);
			
			System.out.println(entityManager.contains(p));
			entityManager.detach(p);                       //just disable the object  
			System.out.println(entityManager.contains(p)); 
			
			Product p1 = entityManager.merge(p);
			p1.setPname("tomato");
			
			p.setPname("beery");
			System.out.println("updated....");
			entityTransaction.commit();
			
		}catch(Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}


}

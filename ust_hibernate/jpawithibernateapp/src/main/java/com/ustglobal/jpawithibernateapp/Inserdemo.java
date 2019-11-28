package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class Inserdemo {

	public static void main(String[] args) {


		Product p = new Product();

		p.setPid(131);
		p.setPname("apple");
		p.setQuantity(20);
		
//		Product p1 = new Product();  //no need to create multi objy 
//
//		p1.setPid(121);
//		p1.setPname("Apple");
//		p1.setQuantity(20);

		//created only once
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//created bassed on num of DDL operationsy
		EntityTransaction entityTransaction = entityManager.getTransaction();


		entityTransaction.begin();
		entityManager.persist(p);
		//entityManager.persist(p1);
		System.out.println("data inserted .."); 
		
		entityTransaction.commit();   //save the data and store the data if its not written data cannot be inserted into database
		
		entityManager.close();


	}

}

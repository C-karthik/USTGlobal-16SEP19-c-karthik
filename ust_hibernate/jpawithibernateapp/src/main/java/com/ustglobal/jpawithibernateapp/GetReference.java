package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class GetReference {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
	
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
			//Product p = entityManager.getReference(Product.class, 111);
			
			Product pa = entityManager.find(Product.class, 111);
			System.out.println(pa.getClass());
			
//			System.out.println("id...." + p.getPid());
//			System.out.println("ename.." + p.getPname());
//			System.out.println("quatity .."+ p.getQuantity());
//			

			entityManager.close();
		
		
		
		
		
	}

}

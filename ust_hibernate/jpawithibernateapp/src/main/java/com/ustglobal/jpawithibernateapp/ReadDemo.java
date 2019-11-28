package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReadDemo {
	
	public static void main(String[] args) {
		
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Product p = entityManager.find(Product.class, 111);  //find method used to retrive the data 
		
		System.out.println("id.." + p.getPid());		
		System.out.println("name .." + p.getPname());
		System.out.println("quantity..." +p.getQuantity());
		
		
	}

}

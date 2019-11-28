package com.ustglobal.jpawithibernateapp.jpql;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReadByJPQLDemo {
	
	public static void main(String[] args) {
		
		
		
		
		EntityManagerFactory  entityManagerFactory  = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		
		
		//first  write jpqlquery
		String jpql = "select pname from Product";
		
		//get that Query to connect to database
		Query q = entityManager.createQuery(jpql);
		
		//store the jpqlQuery
		
		
		List<Product>  ar1 = q.getResultList();
	for (Product s : ar1) {
			
			System.out.println(s.getPid());
			System.out.println(s.getPname());
			System.out.println(s.getQuantity());
			System.out.println("..................");
		}
	//to get only names 	
	List<String>  ar = q.getResultList();	
	for (String string : ar) {
		
		System.out.println(string);
		
	}
		entityManager.close();
		 
	}

}

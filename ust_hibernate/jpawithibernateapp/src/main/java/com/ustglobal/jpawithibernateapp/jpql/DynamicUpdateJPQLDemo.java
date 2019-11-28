package com.ustglobal.jpawithibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class DynamicUpdateJPQLDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		String jpql = "update Product set pname = :name where pid = :id";
		
		Query query = entityManager.createQuery(jpql);
		
		query.setParameter("name", "book");
		
		query.setParameter("id", 111);
		
		int result = query.executeUpdate();
		System.out.println(result);
		
		entityTransaction.commit();
		
		entityManager.close();
		
		
		
		
		
	}

}

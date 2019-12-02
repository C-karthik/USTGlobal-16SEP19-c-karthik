package com.ust.student_mvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.student_mvc.dto.StudentBean;

@Repository
public class StudentDaoImpl implements StudentDao{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public StudentBean login(int id, String password) {
		
		String jpql = "from StudentBean where id=:id and password=:password";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<StudentBean> query = entityManager.createQuery(jpql, StudentBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			StudentBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}//end of login

	@Override
	public int register(StudentBean bean) {
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			
			entityManager.persist(bean);
			entityTransaction.commit();
			return bean.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public StudentBean searchById(int id) {
		EntityManager entityManager = factory.createEntityManager();
		StudentBean bean = entityManager.find(StudentBean.class, id);
		return bean;
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		StudentBean bean = entityManager.find(StudentBean.class, id);
		bean.setPassword(password);
		entityTransaction.commit();
		return true;
	}

	@Override
	public boolean updateProfile(StudentBean bean) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	     StudentBean sbean = entityManager.find(StudentBean.class, bean.getId());
	     sbean.setName(bean.getName());
	     sbean.setGender(bean.getGender());
	     sbean.setEmail(bean.getEmail());
	     sbean.setDoj(bean.getDoj());
	     entityTransaction.commit();
		return true;
	}

	@Override
	public boolean deleteProfile(int id) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		StudentBean bean = entityManager.find(StudentBean.class, id);
		entityManager.remove(bean);
		entityTransaction.commit();
		return true;
	}

}

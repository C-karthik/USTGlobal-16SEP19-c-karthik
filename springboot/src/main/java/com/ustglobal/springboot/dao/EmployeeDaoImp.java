package com.ustglobal.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springboot.dto.EmployeeBean;

//@Repository
public class EmployeeDaoImp implements EmployeeDao {

	//@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addEmpoyee(EmployeeBean bean) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(bean);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		EmployeeBean employeeBean = entityManager.find(EmployeeBean.class,bean.getId());
		
		employeeBean.setName(bean.getName());
		employeeBean.setEmail(bean.getEmail());
		employeeBean.setGender(bean.getGender());
		employeeBean.setDoj(bean.getDoj());
		employeeBean.setPassword(bean.getPassword());
		entityTransaction.commit();
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
		if(bean!= null) {
			entityManager.remove(bean);
			entityTransaction.commit();
			return true;
				
			}else {
				return false;
		}
	}

	@Override
	public EmployeeBean getEmployeeBean(int id) {
		EntityManager entityManager = factory.createEntityManager();
		
		return entityManager.find(EmployeeBean.class, id);
	}

	@Override
	public List<EmployeeBean> getAllEmployeeBeans() {
		String jpql = "from EmployeeBean";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query = entityManager.createQuery(jpql, EmployeeBean.class);
		List<EmployeeBean> employeeBeans = query.getResultList();
		return employeeBeans;
	}
	
	

}

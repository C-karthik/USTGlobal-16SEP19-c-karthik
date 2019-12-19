package com.ustglobal.Springboot1.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.Springboot1.dto.StudentBean;

@Transactional
public interface StudentRepo extends JpaRepository<StudentBean, Integer>{
	
	@Modifying
	@Query("update StudentBean set name=:name, email=:email, password=:password, doj=:doj, gender=:gender where id=:id")
	public void update(String name, String email ,String password, Date doj, String gender, int id);


	StudentBean findByName(String name);
}

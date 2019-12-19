package com.ustglobal.Springboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.Springboot1.dto.StudentBean;
import com.ustglobal.Springboot1.repo.StudentRepo;

@Service
public class StudentServiceJPA implements StudentService {

	@Autowired
	private StudentRepo repo;

	@Override
	public boolean addStudents(StudentBean bean) {

		repo.save(bean);

		return true;
	}

	@Override
	public boolean modifySudentData(StudentBean bean) {

		repo.update(bean.getName(), bean.getEmail(), bean.getPassword(), bean.getDoj(), bean.getGender(), bean.getId());

		return true;
	}

	@Override
	public boolean deleteStudent(int id) {

		repo.deleteById(id);

		return true;
	}

	@Override
	public StudentBean getStudent(int id) {

		return repo.findById(id).get();
	}

	@Override
	public List<StudentBean> getAllStudents() {

		return repo.findAll();
	}

	@Override
	public StudentBean findByName(String name) {
		
		return repo.findByName(name);
	}



}

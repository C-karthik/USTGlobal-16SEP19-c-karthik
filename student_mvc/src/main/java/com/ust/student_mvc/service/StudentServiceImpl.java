package com.ust.student_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.student_mvc.dao.StudentDao;
import com.ust.student_mvc.dto.StudentBean;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentDao dao;	
	
	@Override
	public StudentBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(StudentBean bean) {
		return dao.register(bean);
	}

	@Override
	public StudentBean searchById(int id) {
		return dao.searchById(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

	@Override
	public boolean updateProfile(StudentBean bean) {
		return dao.updateProfile(bean);
	}

	@Override
	public boolean deleteProfile(int id) {
		return dao.deleteProfile(id);
	}

}

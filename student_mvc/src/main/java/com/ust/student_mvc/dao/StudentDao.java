package com.ust.student_mvc.dao;

import com.ust.student_mvc.dto.StudentBean;

public interface StudentDao {
	
	public StudentBean login(int id , String password);
	
	public int register(StudentBean bean);
	
	public StudentBean searchById(int id);
	
	public boolean changePassword(int id , String password);
	
	public boolean updateProfile(StudentBean bean);
	
	public boolean deleteProfile(int id);
	
	
	
	

}

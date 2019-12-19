package com.ustglobal.Springboot1.service;

import java.util.List;

import com.ustglobal.Springboot1.dto.StudentBean;

public interface StudentService {
	
    public boolean addStudents(StudentBean bean);
	
	public boolean modifySudentData(StudentBean bean);
	
	public boolean deleteStudent(int id);
	
	public StudentBean findByName(String name);
	
	public StudentBean getStudent(int id);
	
	public List<StudentBean> getAllStudents();

}

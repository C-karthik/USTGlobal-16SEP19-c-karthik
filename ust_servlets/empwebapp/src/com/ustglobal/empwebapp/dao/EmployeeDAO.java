package com.ustglobal.empwebapp.dao;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public interface EmployeeDAO {
	
	
	
	
	public EmployeeInfo auth(int id , String password); //select
	
	public EmployeeInfo searchEmployee(int id); //dynamicSearch
	
	public boolean changePassword(int id , String password); //update
	
	public boolean registerEmployee(EmployeeInfo info); //insert
	

}

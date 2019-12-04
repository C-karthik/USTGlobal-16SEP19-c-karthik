package com.ustglobal.springboot.dao;

import java.util.List;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeDao {
	
	public boolean addEmpoyee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployeeBean(int id);
	public List<EmployeeBean> getAllEmployeeBeans();

}

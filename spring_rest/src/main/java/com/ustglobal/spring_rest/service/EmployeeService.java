package com.ustglobal.spring_rest.service;

import java.util.List;

import com.ustglobal.spring_rest.dto.EmployeeBean;

public interface EmployeeService {
	
	public boolean addEmpoyee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployeeBean(int id);
	public List<EmployeeBean> getAllEmployeeBeans();


}

package com.ustglobal.spring_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.spring_rest.dao.EmployeeDao;
import com.ustglobal.spring_rest.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public boolean addEmpoyee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<=8) {
			return false;
		}
		return dao.addEmpoyee(bean);
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.modifyEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployeeBean(int id) {
		
		return dao.getEmployeeBean(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployeeBeans() {
		
		return dao.getAllEmployeeBeans();
	}
	
	
	

}

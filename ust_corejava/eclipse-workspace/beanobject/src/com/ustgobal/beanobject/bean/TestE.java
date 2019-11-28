package com.ustgobal.beanobject.bean;

public class TestE {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setDeptno(10);
		e.setDesignatin("software devp");
		e.setEmpid(12345);
		e.setName("sanvi");
		e.setSal(50000);
		
		DataBase1 b = new DataBase1();
		
		b.receiveEmp(e);
		
		
		
		
	}

}

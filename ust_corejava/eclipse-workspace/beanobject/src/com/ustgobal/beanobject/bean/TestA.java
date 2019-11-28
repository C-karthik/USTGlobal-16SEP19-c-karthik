package com.ustgobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		
		
		Accountant aa = new Accountant();
		aa.setAccNo(12345678);
		aa.setContNo(7799061535l);
		
		Database3 db3 = new Database3();
		db3.collect(aa);
		
	}

}

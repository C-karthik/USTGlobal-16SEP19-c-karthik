package com.ustgobal.beanobject.bean;

public class TestS {

	public static void main(String[] args) {

		Student s = new Student();

		s.setId(12);
		s.setName("sanvi");
		s.setRollNo(121);

		DataBase db = new DataBase();
		
		db.recieve(s);
	}


}

package com.ustglobal.objClass;

public class Testpe {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p = new Person(10, "navina");
		System.out.println(p.id);
		System.out.println(p.name);


		Object o = p.clone();
		Person p1 = (Person)o;
		System.out.println("p1 id " + p1.id);
		System.out.println(" p1 name " + p1.name);

		p1.id = 12;
		p1.name = "nevi";
		System.out.println(" after clone p1 id " + p1.id);
		System.out.println("after clone  p1 name " + p1.name);


	}


}

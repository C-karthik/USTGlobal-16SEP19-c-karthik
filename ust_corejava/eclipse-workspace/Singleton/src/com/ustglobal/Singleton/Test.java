package com.ustglobal.Singleton;

public class Test {
	
	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "karthik";
		ms.name = "arvindha";
		System.out.println("hashcode  to check same obj r not " + ms.hashCode());
		
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "hi";
		mx.name = "hi raa";
		System.out.println(" hascode of mx  "+ mx.hashCode());
		

		MySingleton my = MySingleton.getDbConnection();
		my.s = "hello";
		my.name = "hey";
		
		System.out.println(ms.s);
		System.out.println(mx.s);
		System.out.println(my.s);
		// created in same object
		System.out.println(mx.name + ms.name + my.name);
	}

}

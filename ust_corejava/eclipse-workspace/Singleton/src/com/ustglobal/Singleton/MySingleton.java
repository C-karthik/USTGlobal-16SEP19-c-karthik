package com.ustglobal.Singleton;

public class MySingleton {
	
	String s;
	String name;

	private static MySingleton instance = null;

	private MySingleton() { }    //private default or zero par constructor

	public static MySingleton getDbConnection() {

		if(instance == null) {
			
			instance = new MySingleton();
			
			return instance;
			
			
		}else {
			
			return instance;
		
		}
	}

}

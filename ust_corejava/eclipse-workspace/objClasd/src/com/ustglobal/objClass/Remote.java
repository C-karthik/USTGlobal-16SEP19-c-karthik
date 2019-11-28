package com.ustglobal.objClass;

public class Remote {
	void add() {
		System.out.println("add() method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		Remote r = new Remote();
		Class c = r.getClass();

		Object o = c.newInstance(); // used create obj 
		Remote a = ( Remote )o;

		a.add();
		
		
	}

}
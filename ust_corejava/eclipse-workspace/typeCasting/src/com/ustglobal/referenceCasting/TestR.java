package com.ustglobal.referenceCasting;

public class TestR {
	public static void main(String[] args) {
		
		pen p = new Marker();
		
		//p.write();
		
		Marker m = (Marker) p ;
		
		m.write();
		m.dark();
		System.out.println(m.b);
		System.out.println(m.cost);
		
	}

}

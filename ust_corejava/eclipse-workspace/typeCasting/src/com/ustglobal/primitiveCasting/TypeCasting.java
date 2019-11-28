package com.ustglobal.primitiveCasting;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		byte q = 97;
		char g = (char) q;
		System.out.println("explicit casting "+ g);
		
		float d = 21.09f;
		int r = (int) d;
		System.out.println("explicit casting "+ r);
		
		System.out.println("==================================");
		
		
		int a = 10;
		float f = a;
		System.out.println(" implicit casting " + f);
		
		int t = 10;
		double c = t;
		System.out.println(" implicit casting " + c);


	}
}


package com.ustgloble.wrapperclasses;

public class TestW {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("a is "+ a);
		Integer i = a;                        // autoboxing
		System.out.println(" i is "+ i);
		
		Integer x = 17;
		System.out.println(" x is " + x);
		int un = x;                           // unBoxing
		System.out.println(" un is "+  un);
		
//		int gp = Integer.parseInt("123gre");
//		System.out.println("value is " + gp);
//		
		
		int g = Integer.parseInt("123");
		System.out.println("value is " + g);
		
		boolean v = Boolean.parseBoolean("true");
		System.out.println(" result "+ v);
		
		boolean o = Boolean.parseBoolean("123true");
		System.out.println(" result "+ o);
		
		
	}

}

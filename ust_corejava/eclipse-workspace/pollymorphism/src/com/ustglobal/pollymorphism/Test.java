package com.ustglobal.pollymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		PollyDemo p = new PollyDemo(10, "ravi");
		
		PollyDemo p1 = new PollyDemo(20, "rahul");
		
		System.out.println(p.getId());
		System.out.println(p1.getId());
	}

}

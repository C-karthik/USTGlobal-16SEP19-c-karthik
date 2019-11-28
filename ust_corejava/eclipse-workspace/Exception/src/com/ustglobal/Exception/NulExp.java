package com.ustglobal.Exception;

public class NulExp {

	public static void main(String[] args) {
		
		System.out.println("main sarted");
		
		String s = "helo";
		int[] a = {10,20,30};
		int b = 10;
		try {
			String str = s.toUpperCase();
			System.out.println(str);
			System.out.println(a[2]);
			System.out.println(b/0);
		}catch(NullPointerException npe){
			
			System.out.println("dont play with null exception");
		}
		
		
		
		
		
		System.out.println("main ended");
	}
	
	
	
	
	
}

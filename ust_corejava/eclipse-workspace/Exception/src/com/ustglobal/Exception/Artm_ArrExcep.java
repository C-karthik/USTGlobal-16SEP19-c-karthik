package com.ustglobal.Exception;

public class Artm_ArrExcep {
	public static void main(String[] args) {
		
		System.out.println("main Started");
		
		int[] a = { 10,12,34};
		int b = 0;
		try {
			b = 10/0;
		}
		
		catch (ArithmeticException ae) 
		{
			
			System.out.println("divided by zero");
		}
		
		try {
			System.out.println(a[4]);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("out of index u entered");
		}
		
		System.out.println(b);
		System.out.println("main ends");
		
	}

}

package com.ustglobal.Exception;

public class ArtmExcep {
	public static void main(String[] args) {
		
		System.out.println("main Started");
		
		int[] a = { 10,12,34};
		int b = 0;
		try {
			b = 10/2;
			System.out.println("good");
			System.out.println("mrng");
			System.out.println(a[4]);
		}
		
		catch (ArithmeticException ae) 
		{
			
			System.out.println("divided by zero");
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("out of index u entered");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(b);
		System.out.println("main ends");
		
	}

}

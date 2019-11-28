package com.ustglobal.Exception;

public class DemoE {

	public static void main(String[] args) {
		System.out.println("main starts");
		int[] a = {10,20,30};

		System.out.println(a[2]);

		try {
			
			System.out.println(a[0]);
			
			System.out.println(a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("index not found");
		}

		System.out.println("main ended");
	}




}

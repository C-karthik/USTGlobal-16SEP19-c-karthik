package com.ustglobal.exceptionHandling;

public class Demo1 {

	public static void main(String[] args) {

		try {
			
			System.out.println("inside try");
			Thread.sleep(3000);
			
		}catch(Exception ie) 
		{

               System.out.println("exception caught");
               
               ie.printStackTrace();

		}
		
		System.out.println("main ended");
	}

}

package com.ustglobal.Exception;

public class PVR {

	void book() {
		System.out.println("booking started");
		try {
			System.out.println(10/0);
			System.out.println("processing");
		}
		//catch(Exception e) {
		//e.printStackTrace();
		//throw e;
		//		}
		catch(ArithmeticException ae) {
			System.out.println("sry failed");
			throw ae;
		}
	}


}

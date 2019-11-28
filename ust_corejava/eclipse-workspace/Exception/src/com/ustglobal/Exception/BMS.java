package com.ustglobal.Exception;

public class BMS {

	public static void main(String[] args) {

		System.out.println("bms started");

		PVR p = new PVR();
		try {
			p.book();
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
			catch(ArithmeticException ae) {
				System.out.println("booing failed sry try again");
				}

		System.out.println("ended");

	}

}

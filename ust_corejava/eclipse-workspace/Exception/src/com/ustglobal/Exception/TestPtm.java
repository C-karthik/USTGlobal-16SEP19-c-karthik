package com.ustglobal.Exception;

public class TestPtm {

	public static void main(String[] args) {

		PayTm p = new PayTm();

		try {
			p.book();   // calling method
		}catch(ArithmeticException ae) {
			System.out.println("failed to recharge");
		}finally {

			System.out.println("finally Executing");

		}
		System.out.println("ended");
	}

}
        



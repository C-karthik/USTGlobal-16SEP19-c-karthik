package com.ustglobal.accessModifiers.pkg3;

public class TestB extends TestA {

	private void a() {
		System.out.println("second class");
	}

	public static void main(String[] args) {


		TestB  tb = new TestB();

		tb.a();


	}

}

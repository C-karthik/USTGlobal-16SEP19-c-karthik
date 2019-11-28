package com.ustglobal.accessModifiers.pkg3;

public class TestA {


	private void a() {
		System.out.println("frst method");
	}
	public static void main(String[] args) {

		TestA  ta = new TestA();
		ta.a();
	}
}

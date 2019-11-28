package com.ustglobal.objClass;

public class TestC {
	public static void main(String[] args) {
		
		Cow c1 = new Cow(100000, "gowri", "white");
		Cow c2 = new Cow(12000, "ganga", "black");
		Cow c3 =new Cow(100000, "gowri", "white");
		Cow c4 = c3;
		
		boolean isEqual = c1.equal(c3);
		boolean isEqual1 = c1.equal(c2);
		boolean isEqual2 = c3.equal(c4);
		System.out.println(isEqual);
		System.out.println(isEqual1);
		System.out.println(isEqual2);
	}

}

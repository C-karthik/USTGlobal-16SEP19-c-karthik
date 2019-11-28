package com.ustglobal.objClass;

public class TestE {
	public static void main(String[] args) {
		
		Empl e = new Empl(1, "karthik");
		Empl e2 = new Empl(2, "sanvi");
		Empl e3 = e ;
		
		System.out.println(e);
		System.out.println(e2);
		
		boolean isEqual = e.equal(e2);
		System.out.println(isEqual);
		
		boolean isEq = e.equal(e3);
		System.out.println(isEq);
	}
	

}

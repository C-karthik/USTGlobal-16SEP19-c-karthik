package com.ustglobal.objClass;


public class TestP {
	public static void main(String[] args) {

		Pen p = new Pen();

		int pHashcode = p.hashCode();

		System.out.println("HashCode of p " + pHashcode);

		Pen q = new Pen();

		int qHashcode = q.hashCode();
		System.out.println("HashCode of q " + qHashcode);
		
		String s = q.toString();
		System.out.println("toString method of pen q = "+ s); //only for refernce variable
		
	}
}
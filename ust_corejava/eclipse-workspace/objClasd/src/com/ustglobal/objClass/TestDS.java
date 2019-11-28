package com.ustglobal.objClass;

public class TestDS {
	public static void main(String[] args) {
		
		
		Student s = new Student(012, "raj", 67.76);
		
	int a =	s.hashCode();
	String n = s.toString();  // without Creating disply method we can display the details by overriding tostring
	
	System.out.println(a);
	System.out.println(n);
		
	}

}


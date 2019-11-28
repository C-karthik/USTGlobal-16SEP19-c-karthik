package com.ustglobal.objClass;

public class TestS {
	
	public static void main(String[] args) {
		
		Student s = new Student(12, "sanvi", 98.9);
		Student s1 = new Student(13, "anu", 80.9);
		Student s2 = new Student(14, "ravi", 78.9);
		
		int r = s.hashCode();
		int r1 = s1.hashCode();
		int r2 = s2.hashCode();
		
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		
		String st = s.toString();
		String st1 = s1.toString();
		String st2 = s2.toString();
		
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);

		
		
	}

}

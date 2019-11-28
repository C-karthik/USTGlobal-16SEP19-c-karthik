package com.ustglobal.sorting.list;

import java.util.ArrayList;

public class TestS {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s = new Student(42, "karthik", 45.54);
		Student s1 = new Student(21, "sariya" , 95.99);
		Student s3 = new Student(31 , "Riya" , 17.87);
		
		al.add(s);
		al.add(s1);
		al.add(s3);
		
		HelperClass hc = new HelperClass();
		// hc.displayAllStudentDetails(al);
		
		hc.displayFilledStudents(al);
		System.out.println("==============");
		hc.displayPassedStudents(al);
		System.out.println("topper");
		hc.displayToperStudents(al);
		
		
	}
	

}

package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

public static void main(String[] args) {
	
	ArrayList<Student> al = new ArrayList<Student>();
	
	Student s = new Student(42, "karthik", 45.54);
	Student s1 = new Student(21, "sariya" , 95.99);
	Student s3 = new Student(31 , "Riya" , 97.87);
	
	al.add(s);
	al.add(s1);
	al.add(s3);
	
	System.out.println(" before sorting");
	displayStudentDetails(al);
	
	System.out.println("after sorting");
	Collections.sort( al );
	displayStudentDetails(al);
	
	
}

 static void displayStudentDetails(ArrayList<Student> al) {
	
	Iterator<Student> it = al.iterator();
	
	while(it.hasNext()) {
		
		Student s = it.next();
		System.out.println(s);
	}
}



}

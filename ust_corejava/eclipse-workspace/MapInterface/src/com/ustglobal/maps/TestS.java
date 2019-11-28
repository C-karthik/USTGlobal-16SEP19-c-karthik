package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestS {

	public static void main(String[] args) {

		Student s = new Student(12, "lalasa", 45.94);
		Student s1 = new Student(13, "lovely", 45.99);
		Student s2 = new Student(15, "lilly", 45.34);
		Student s3 = new Student(14 , "laya", 95.54);
		Student s4 = new Student(16 , "maya", 65.54);
		Student s5 = new Student(17 , "kiya", 75.54);
		Student s6 = new Student(18 , "suviya", 49.54);
		Student s7 = new Student(19 , "diya", 55.54);
		Student s8 = new Student(20 , "renu", 65.54);
		Student s9 = new Student(21 , "riya", 85.54);

		ArrayList<Student> as = new ArrayList<Student>();
		as.add(s);
		as.add(s1);
		as.add(s2);
		as.add(s4);

		ArrayList<Student> a1 = new ArrayList<Student>();

		a1.add(s3);
		a1.add(s5);
		a1.add(s6);

		ArrayList<Student> a2 = new ArrayList<Student>();

		a2.add(s7);
		a2.add(s8);
		a2.add(s9);

        HashMap<String, ArrayList<Student>> h = new HashMap<String, ArrayList<Student>>();
        
        h.put("first", as);
        System.out.println(h.get("first"));
       
        h.put("second", a1);
        System.out.println(h.get("second"));
        
        h.put("third", a2);
        System.out.println(h.get("third"));
        
       
        
        ArrayList<Student> ms = h.get("second");
        Iterator<Student> ls = ms.iterator();
        
        // representation purpose 
        
        while (ls.hasNext()) {
        	
        	Student sa = ls.next();
        	
        	System.out.println("id = " + sa.id);
        	System.out.println("name = " + sa.name);
        	System.out.println("per = " + sa.per);
        	System.out.println("==============================");
			
			
		}
        
	}

}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestS {


	public static void main(String[] args) {

		Comparator<Student> cmp = (o1 , o2) -> {

			if(o1.per > o2.per)
				return 1 ;

			if(o1.per < o2.per)
				return -1;

			return 0;

		};
   
		Comparator<Student> cms = (s1 , s2 ) -> {
			
			String e1 = s1.s;
			String e2 = s2.s;
			
			return e1.compareToIgnoreCase(e2);
		};
		
		ArrayList<Student> as = new ArrayList<Student>();

		Student s = new Student(12, "tharun", 56.67);
		Student s1 = new Student(14, "vinith", 66.67);
		Student s3 = new Student(13, "veera", 56.77);
		Student s2 = new Student(11, "varun", 76.07);

		as.add(s);
		as.add(s1);
		as.add(s2);
		as.add(s3);

		
		Student ls = as.stream().max(cmp).get();
		System.out.println("max per ......." + ls);

		Student st = as.stream().min(cmp).get();
		System.out.println("min per = " + st);
    
	//List<Student> stu = as.stream().sorted().collect(Collectors.toList());
	
	Iterator<Student> is = as.iterator();
	while (is.hasNext()) {
		Student student =  is.next();
		
		System.out.println("student details " + student);
		
	}
	}






}

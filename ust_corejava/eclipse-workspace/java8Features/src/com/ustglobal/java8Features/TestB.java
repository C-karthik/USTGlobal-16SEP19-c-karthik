package com.ustglobal.java8Features;

import java.util.function.Predicate;

public class TestB {
public static void main(String[] args) {
	
Predicate<Student> p =  s -> {
		
		return s.per > 35;
		
	};
	
	Student s = new Student(1, "anitha", 45.45);
	
	boolean rs = p.test(s);
	System.out.println(rs);
	
	
	
	
	
	
	
}
}

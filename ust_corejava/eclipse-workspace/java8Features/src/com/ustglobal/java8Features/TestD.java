package com.ustglobal.java8Features;

import java.util.function.Function;

public class TestD {
	public static void main(String[] args) {
		
		Function<Integer, Student> f = id -> {
			
			Student s = new Student(12, "navya", 56.87);
			
			s.id = id;
			return s;
			
			
		};
		
		Student s =  f.apply(124); // repalace value
		
		System.out.println(s);
		
		
		
		
		
		
		
	}

}

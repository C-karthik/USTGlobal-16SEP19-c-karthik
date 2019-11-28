package com.ustglobal.java8Features;

import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			
			System.out.println("id is "+ s.id);
			System.out.println("Name is "+ s.s);
			System.out.println("per is " + s.per);
		};
		
		Student s1 = new Student(12 , "karthik", 76.78);
		
		c.accept(s1);
		
		
		
		
		
	}

}

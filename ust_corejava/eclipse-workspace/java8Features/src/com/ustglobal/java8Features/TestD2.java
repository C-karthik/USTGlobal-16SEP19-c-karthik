package com.ustglobal.java8Features;

import java.util.function.Function;
import java.util.function.Supplier;

public class TestD2 {
	public static void main(String[] args) {
		
		Supplier< Student> f = () -> {
			
			return new Student(12, "navya", 56.87);
			
			
			
		};
		
		Student s =  f.get(); // repalace value
		System.out.println(s);
		
		// only return typr no input type
		Supplier<Integer> s1 = () -> 20;
		int v = s1.get();
		System.out.println(v);
		
		Supplier<String> st = () -> "goodnoon";
		String str = st.get();
		System.out.println(str);
		
		
		
		
		
		
		
		
	}

}

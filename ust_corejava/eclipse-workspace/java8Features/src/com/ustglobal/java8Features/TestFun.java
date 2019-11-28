package com.ustglobal.java8Features;

import java.util.function.Function;

public class TestFun {
	
	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f = i -> i*i;
		
		Integer i = f.apply(12);
		int fg = f.apply(43);
		
		System.out.println(i);
		System.out.println(fg);
		
		
		
		
		
		
		
	}

}

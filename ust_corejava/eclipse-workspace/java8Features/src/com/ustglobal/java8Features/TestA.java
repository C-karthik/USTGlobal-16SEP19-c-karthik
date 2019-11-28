package com.ustglobal.java8Features;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {

// to find even r odd by predicate method only for boolen return type and primitive datatypes

		Predicate<Integer> p = i -> {

			return i%2 == 0;

		};
		
		// it contains default method boolean test(T t) 
		
		boolean rs = p.test(11);
		System.out.println(rs);
	}

}

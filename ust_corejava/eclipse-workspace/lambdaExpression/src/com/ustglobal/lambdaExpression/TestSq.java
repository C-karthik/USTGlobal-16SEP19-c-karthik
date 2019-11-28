package com.ustglobal.lambdaExpression;

public class TestSq {
	
	public static void main(String[] args) {
		
		SquareInterface sqr = a -> a*a;
		
		System.out.println(sqr.square(5));
		
		
	}

}

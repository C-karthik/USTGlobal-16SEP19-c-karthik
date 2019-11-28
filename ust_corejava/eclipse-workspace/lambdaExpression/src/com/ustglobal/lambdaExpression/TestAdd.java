package com.ustglobal.lambdaExpression;

public class TestAdd implements AddInterface{
	
	public static void main(String[] args) {
		
		TestAdd a = new TestAdd();
		
		System.out.println(a.add(10, 20));
		
	}
	
	

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}

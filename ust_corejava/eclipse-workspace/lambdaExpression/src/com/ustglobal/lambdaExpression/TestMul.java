package com.ustglobal.lambdaExpression;

public class TestMul  {




	public static void main(String[] args) {


		MultiplyInterface mul = (a,b)->a*b;
		
		int m = mul.multiply(20, 30);
		System.out.println(m);
	}

}





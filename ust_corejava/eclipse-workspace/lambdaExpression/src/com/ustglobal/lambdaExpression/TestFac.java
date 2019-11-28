package com.ustglobal.lambdaExpression;

public class TestFac {
	
	public static void main(String[] args) {
		
		FactorialInterface ft = (n) ->{
			
			
			int fact = 1;
			for(int i = n ; i >= 1 ; i-- ) {
				
				fact = fact * n;
				
				n--;
			}
			
			return fact;
		};
		
		System.out.println(ft.fact(5));
		
	}

}

package com.ustglobal.checkedcustomizedEXceptions;

public class Amount {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		
		ValidateAmount va = new ValidateAmount();
		
		try {
			va.checkAmount(45000);
			System.out.println("withdraw amount");
		} catch (InvalidCheckExcep e) {
			
			//e.printStackTrace();
			
			System.err.println(e.getMessage());
			System.out.println(" ");
		}
		
		System.out.println("main ended");
		
		
	}

}

package com.ustglobal.uncheckedcustomizedEXceptions;

public class TestC {
	
	public static void main(String[] args) {
		
		System.out.println("main stated");
		
		Validation v = new Validation();
		
		try {
			
			v.verify(14);
		  
		}catch(InvalidAgeException ie) {
			
			// System.out.println("custom Exception");
			
			System.out.println(ie.getMessage());
		}
		
	//   v.verify(12);
		
		System.out.println("main ended");
	
	
	
	
	}

}

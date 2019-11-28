package com.ustglobal.uncheckedcustomizedEXceptions1;

public class ATMKeyboard {
	
	void enterPin(int n) {
		
		if( n != 4) {
			
			throw new InvalidEntryExcep("check pin");
			
		}else {
			
			System.out.println("please enter amount");
			
		}
		
	}
	void enterAmount( int k) {
		
		if( k != 100 || k != 200 || k != 500 || k != 2000) {
			
			throw new InvalidEntryExcep("enter multiples of 5 ");
			
		}else {
			
			System.out.println("please wait transection in process");
			
		}
	}

}

package com.ustglobal.uncheckedcustomizedEXceptions1;

public class InvalidEntryExcep extends RuntimeException {
	
	private String st = "please enter correct pin";
	
	public InvalidEntryExcep(String st) {
		
		this.st = st;
		//super(st);
	}
	
	public String getMessage() {
		
		return st;
	}

}

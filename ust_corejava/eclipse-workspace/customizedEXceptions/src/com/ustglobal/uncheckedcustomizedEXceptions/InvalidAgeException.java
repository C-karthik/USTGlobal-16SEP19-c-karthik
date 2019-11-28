package com.ustglobal.uncheckedcustomizedEXceptions;

public class InvalidAgeException extends RuntimeException{
	
	private String msg = "age is invalid if below 18y";
	
	public InvalidAgeException () {
		
		//zero parametarized constructor
	}
	
	 public InvalidAgeException( String msg) {
		this.msg = msg;
		
	}
	

	@Override
	public String getMessage() {
		
		return msg;
	}

}

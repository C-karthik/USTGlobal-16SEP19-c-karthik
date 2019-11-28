package com.ustglobal.checkedcustomizedEXceptions;

public class InvalidCheckExcep extends Exception {
	
	
	private String msgg = "daily limit is 40000";
	
	//@Override
	public String getMessage() {
		return msgg;
	}
	
	
	
	

}

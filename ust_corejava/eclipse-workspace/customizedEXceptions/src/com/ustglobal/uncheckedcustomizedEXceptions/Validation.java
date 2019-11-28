package com.ustglobal.uncheckedcustomizedEXceptions;

public class Validation {
	
	
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException();
		}
	}

}

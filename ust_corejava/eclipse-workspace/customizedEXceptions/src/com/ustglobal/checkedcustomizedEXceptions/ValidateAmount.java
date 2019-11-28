package com.ustglobal.checkedcustomizedEXceptions;

public class ValidateAmount {
	
	void checkAmount(int amount) throws InvalidCheckExcep {
		if(amount > 40000) {
			
			throw new InvalidCheckExcep();
		}
	}

}

package com.ustglobal.uncheckedcustomizedEXceptions1;

public class TestATM {

	public static void main(String[] args) {

		ATMKeyboard at = new ATMKeyboard();

		try {

			at.enterPin(4);
			
			try {
				at.enterAmount(700);
			}catch(InvalidEntryExcep ie1) {

				System.err.println(ie1.getMessage());
			}

		}catch(InvalidEntryExcep ie) {

			System.err.println(ie.getMessage());

		}finally {
			System.out.print("Thanks for visting");
		}

	}

}

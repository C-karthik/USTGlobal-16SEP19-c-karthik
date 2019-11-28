package com.ustglobal.atmMachine;

public class TestA {
	
	public static void main(String[] args) {
		
		Machine m = new Machine();
		HDFC h = new HDFC();
		m.slot(h);
		SBI s = new SBI();
		m.slot(s);
	}

}


package com.ustglobal.objClass;

public class TestO {
	
	public static void main(String[] args) {
		
		Object o = new PenDrive();
		USBPort.connect(o);           // upcasting manully
		
		
//		PenDrive p = new PenDrive();
//		USBPort.connect(p);  //upcasted in usbporter connect method
//		
		Mouse m = new Mouse();
		USBPort.connect(m);
	}

}
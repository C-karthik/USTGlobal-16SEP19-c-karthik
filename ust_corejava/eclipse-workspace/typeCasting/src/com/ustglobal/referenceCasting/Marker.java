package com.ustglobal.referenceCasting;

public class Marker extends pen {
	int b = 20 ;
	@Override
	void write() {
		System.out.println("pen changing its implementations");
	}
	
	void dark() {
		System.out.println(" im marker ");
	}

}

package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.Remote;
import static com.ustglobal.studentapp.jspiders.Remote.*;

public class TestB {
	
	
	public static void main(String[] args) {

		Remote r = new Remote();
		System.out.println(r.sum);

		on();
		System.out.println(r.num);
		off();
	}

}
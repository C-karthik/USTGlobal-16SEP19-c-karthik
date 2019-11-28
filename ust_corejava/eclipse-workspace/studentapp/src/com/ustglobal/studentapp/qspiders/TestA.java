package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {

		Qtp q = new Qtp();
		q.teachQpt();
		Selenium s = new Selenium();
		s.teactSelenium();
		
		Angular a = new Angular();
		a.teachAnguar();

		React r = new React();
		r.teachReact();
	}

}

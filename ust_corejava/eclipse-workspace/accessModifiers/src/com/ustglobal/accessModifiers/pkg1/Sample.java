package com.ustglobal.accessModifiers.pkg1;

import com.ustglobal.accessModifiers.pkg2.Demo;

public class Sample extends Demo {
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		Demo d = new Demo();

		//		System.out.println(d.a);
		//		d.add();
		//		not possible

		//		default
		//System.out.println(d.b);
		//s.sub();
		
		//		protected
		System.out.println(s.d);
		s.mul();
		
		//		public
		System.out.println(d.name);
		d.div();
		
		
		
	}

}

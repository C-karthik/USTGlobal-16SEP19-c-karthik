package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap h = new HashMap();

		h.put("kerthi", 123456);
		h.put("lara" , 3456778);
		h.put("laya" , 56789);

		HashMap h1 = new HashMap();

		h1.put("karuna", 123456);
		h1.put("karthik" , 3456778);
		h1.put("arjunS" , 56789);
		
		boolean hashkey = h1.containsKey("keerti");
		System.out.println(hashkey);
		
		boolean b = h.containsValue(123456);
		System.out.println(b);
		
		System.out.println("for comping one to other ");
		h.putAll(h1);
		System.out.println(h);
		
		
		System.out.println(h1.size());
		
		boolean b1 = h.isEmpty();
		System.out.println("checking for empty " + b1);
		
		
		

	}

}

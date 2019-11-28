package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		h.put("kerthi", 123456);
		h.put("lara" , 3456778);
		h.put("laya" , 56789);
		h.put(null, 4356354);
		
		
		System.out.println(h);
		
		h.put("laya" , 567891);
		System.out.println("key doesnt allow duplicates " );
		System.out.println(h);
		
		h.put("layakarthik" , 567891);
		System.out.println("duplicates of values ");
		System.out.println(h);
		
	Object o =	h.get("laya");
	System.out.println( "phone num  =  " + o);
	
	Object o1 = h.get("karthik");
	System.out.println(o1);
	
	Object oo =   h.remove("layakarthik");
	System.out.println(oo);
		
	Object oo1 =   h.remove("karthi");
	System.out.println(oo1);
		
		
		
		
		
	}

}

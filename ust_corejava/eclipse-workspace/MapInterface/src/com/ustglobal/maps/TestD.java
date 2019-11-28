package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {

		LinkedHashMap<String , Integer> lm = new LinkedHashMap<String, Integer>();

		lm.put("bangalore", 560069);
		lm.put("mumbai" , 887690);
		lm.put("kerala" , 654321);

		//System.out.println(lm);
		
		for(Map.Entry<String, Integer> m : lm.entrySet()) {
			
			// System.out.println(m);
			
		String s = m.getKey();
			System.out.println(s);
//			
//			Integer i = m.getValue();
//			System.out.println(i);
       }
	}
	
}

package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	
	public static void main(String[] args) {

		TreeMap<String , Integer> lm = new TreeMap<String, Integer>();

		lm.put("bangalore", 560069);
		lm.put("mumbai" , 887690);
		lm.put("malaria" , 654321);
		lm.put("kerala" , 654321);
		
		// lm.put(null, 45678); //throws class cast excetion

		//System.out.println(lm);
		
		for(Map.Entry<String, Integer> m : lm.entrySet()) {
			
			System.out.println(m);
			
			String s = m.getKey();
			Integer i = m.getValue();
		}
		
	}

}

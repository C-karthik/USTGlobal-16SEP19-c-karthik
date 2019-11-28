package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Tetsc {

	public static void main(String[] args) {

		LinkedHashMap<String , Integer> lm = new LinkedHashMap<String, Integer>();

		lm.put("bangalore", 560069);
		lm.put("mumbai" , 887690);
		lm.put("kerala" , 654321);

		System.out.println(lm);

		Set<String> s = lm.keySet();

		for (String string : s) {

			System.out.println(string);

		}
		
		Collection<Integer> sv = lm.values(); 
		
		for (Integer integer : sv) {
			
			System.out.println(integer);
			
		}









	}

}

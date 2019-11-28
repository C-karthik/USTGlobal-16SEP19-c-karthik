package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestAS {
	
	public static void main(String[] args) {
		
		HashSet<Integer > h = new HashSet<Integer>();
		
		h.add(12);
		h.add(32);
		h.add(12); // allows but prints only once
		h.add(null);
		h.add(null);
		
		Iterator<Integer> li = h.iterator();
		
		while(li.hasNext()) {
			
			Integer I = li.next();
			System.out.println(I);
		}
		System.out.println("======== for each =====");
		for (Integer integer : h) {
			
			System.out.println(integer);
			
		}
		
		
		
		
		
		
	}
	
	
	

	
	
	
	
	
}

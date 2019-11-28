package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LiskHash {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		lh.add("janini");
		lh.add("karthik");
		lh.add(null);
		lh.add(null);
		lh.add("amulya");
		
		System.out.println(" === for eachloop ========");
		
		for (String string : lh) {
			
			System.out.println(string);
			
		}
		System.out.println("==== while loop ===");
		Iterator<String> li = lh.iterator();
		while (li.hasNext()) {
			String string =  li.next();
			System.out.println(string);
			
		}
	}

}

package com.ustglobal.sorting.set;

import java.util.TreeSet;

public class TreeSetDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// wont all different types , null

    @SuppressWarnings("rawtypes")
	TreeSet ts = new TreeSet();
    
    ts.add(12);
    ts.add(23);
    ts.add(45);
    ts.add(1);
    ts.add(7);
    ts.add(12);
   // ts.add(null);   throws nullpointer exception
    
    for (Object object : ts) {
    	
    	System.out.println(object);
		
	}
    
     



	}
}
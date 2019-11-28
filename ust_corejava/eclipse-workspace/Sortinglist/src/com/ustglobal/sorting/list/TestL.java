package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestL {
	
	public static void main(String[] args) {
		
		LinkedList<LapTop> ll = new LinkedList<LapTop>();
		
		LapTop lp = new LapTop(45000, "hp", 8);
		LapTop lp1 = new LapTop(43000, "lenovo", 4);
		LapTop lp2 = new LapTop(80000, "sony", 16);
		
		ll.add(lp);
		ll.add(lp1);
		ll.add(lp2);
		ll.add(new LapTop(37000, "samsung", 4));
		
		System.out.println("before sorting");
		diplayDetails(ll);
		
		Collections.sort(ll);
		System.out.println("after sort");
		diplayDetails(ll);
		
		
	}
	
	static void diplayDetails(LinkedList<LapTop> l) {
		
		Iterator<LapTop> i = l.iterator();
		while(i.hasNext()) {
			LapTop lt = i.next();
			System.out.println(lt);
		}
	}

}

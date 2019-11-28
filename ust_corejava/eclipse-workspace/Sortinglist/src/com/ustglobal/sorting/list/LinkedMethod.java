package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class LinkedMethod {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll =  new LinkedList<Integer>();
		
		ll.add(23);
		ll.add(21);
		ll.add(445);
		ll.add(43);
		ll.add(23);
		ll.add(null);
		
		System.out.println(ll);
		
		int i = ll.peek();
		System.out.println(i);
		
		int i1 = ll.peekFirst();
		System.out.println(i1);
		
		Integer I = ll.pollLast();
		System.out.println(I);
		
		
		
		
	}

}

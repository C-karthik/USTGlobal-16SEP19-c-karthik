package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(66);
		al.add(86);
		al.add(16);
		al.add(61);
		al.add(25);
		al.add(108);
		
		long l = al.stream().filter(i -> i < 40 ).count();
		
		System.out.println(" num of students failed " + l);
		
		Comparator<Integer> cmp = (m1 , m2) -> {
  
			if(m1>m2)
				return 1;
			
			if(m1<m2)
				return -1 ;
			
			return 0;
		};
		
	Integer i = 	al.stream().min(cmp).get();
	System.out.println("min val " + i);
	
	Integer j = al.stream().max(cmp).get();	
	System.out.println("max val " + j);
		
	}
}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(32);
		al.add(5);
		al.add(7);
		al.add(4);
		
		List<Integer> l = al.stream().map(i -> i*i).collect(Collectors.toList());
		for (Integer integer : l) {
			
			System.out.println(integer);
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}

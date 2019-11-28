package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSort {
	
	
public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(66);
		al.add(86);
		al.add(16);
		al.add(61);
		al.add(25);
		al.add(108);
		
		List<Integer> i = al.stream().sorted().collect(Collectors.toList());
		
		Iterator<Integer> it = i.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
			
		}
			
}


}

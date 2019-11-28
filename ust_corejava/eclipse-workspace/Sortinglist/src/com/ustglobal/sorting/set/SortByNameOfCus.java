package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByNameOfCus implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		String s = o1.name;
		String s1 = o2.name;
		return s.compareTo(s1);
	}
	
	
	

}

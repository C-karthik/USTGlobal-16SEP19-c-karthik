package com.ustglobal.sorting.set;

import java.util.Comparator;

public class BankSortByName  implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		String s = o1.name;
		String s1 = o2.name;
		return s.compareTo(s1);
		
	}
	
	

}

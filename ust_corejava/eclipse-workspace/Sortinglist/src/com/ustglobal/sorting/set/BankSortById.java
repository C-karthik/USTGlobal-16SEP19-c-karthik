package com.ustglobal.sorting.set;

import java.util.Comparator;

public class BankSortById implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		if(o1.id > o2.id)
			return 1;
		
		if(o1.id < o2.id)
			return -1;
		
		return 0;

	}
	
	
	

}

package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Pen2> {

	@Override
	public int compare(Pen2 p1, Pen2 p2) {
		
		if(p1.price > p2.price)
			return 1;
		
		if(p1.price < p2.price )
			return -1 ;
		
		return 0;

	}
	

}

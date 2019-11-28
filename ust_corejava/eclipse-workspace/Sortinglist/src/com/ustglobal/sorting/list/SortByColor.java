package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor  implements Comparator<Pen2>{

	@Override
	public int compare(Pen2 o1, Pen2 o2) {
		
		String s = o1.color;
		String s1 = o2.color;
		return s.compareTo(s1);
		}
	
	
	

}

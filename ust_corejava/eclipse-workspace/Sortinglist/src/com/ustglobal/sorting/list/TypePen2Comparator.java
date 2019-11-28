package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TypePen2Comparator {
	public static void main(String[] args) {

		ArrayList<Pen2>  ar = new ArrayList();

		Pen2 p = new Pen2(10.01, "blue");
		Pen2 p1 = new Pen2(11.21 , "yellow");
		Pen2 p2 = new Pen2(7.09 , "green");

		ar.add(p);
		ar.add(p1);
		ar.add(p2);

		System.out.println("before sorting");
		displayDetail( ar);

		System.out.println("---sort by color using comparator----------");

		SortByColor sc = new SortByColor();

		Collections.sort(ar,sc);
		displayDetail(ar);

		System.out.println("-----------sort by price--------------");

		SortByPrice sb = new SortByPrice();

		Collections.sort(ar,sb);
		displayDetail(ar);





	}

	static void displayDetail( ArrayList<Pen2>  ar) {

		Iterator<Pen2> li = ar.iterator();
		while(li.hasNext()) {
			Pen2 pe = li.next();
			System.out.println(pe);
		}  
	}





}

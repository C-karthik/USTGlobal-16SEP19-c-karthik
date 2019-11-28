package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("shanmathi");
		ts.add("karthik");
		ts.add("arvindh");
		ts.add("anvika");

		
		for (String string : ts) {
			System.out.println(string);

		}
		
		System.out.println("==========");

		Iterator<String> at = ts.iterator();
		while (at.hasNext()) {
			String string =  at.next();
			System.out.println(string);

		}

	}

}



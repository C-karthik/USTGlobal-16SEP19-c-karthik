package com.ustglobal.maps;

import java.util.ArrayList;

public class Array {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList mylist = new ArrayList();
		mylist.add("c");
		mylist.add("h");
		@SuppressWarnings("rawtypes")
		ArrayList mylist1 = new ArrayList();
		mylist.add(1 ,"h");
		mylist.add("c");
		System.out.println(mylist.equals(mylist1));

	}
}

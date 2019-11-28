package com.ustglobal.sorting.set;

public class Bank {
	
	String name;
	int id;
	long acc;
	public Bank(String name, int id, long acc) {
		super();
		this.name = name;
		this.id = id;
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", id=" + id + ", acc=" + acc + "]";
	}
	
	

}

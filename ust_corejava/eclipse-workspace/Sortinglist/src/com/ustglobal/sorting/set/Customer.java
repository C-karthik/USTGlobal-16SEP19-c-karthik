package com.ustglobal.sorting.set;

public class Customer {
	
	int id;
	String name;
	long sal;
	public Customer(int id, String name, long sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}

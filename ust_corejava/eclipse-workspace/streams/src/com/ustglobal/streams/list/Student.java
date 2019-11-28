package com.ustglobal.streams.list;

public class Student {
	
	int id;
	String s;
	double per;
	public Student(int id, String s, double per) {
		super();
		this.id = id;
		this.s = s;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", s=" + s + ", per=" + per + "]";
	}
	

}

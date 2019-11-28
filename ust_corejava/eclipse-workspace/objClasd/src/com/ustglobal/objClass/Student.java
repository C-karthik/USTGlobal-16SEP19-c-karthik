package com.ustglobal.objClass;

public class Student {

	int id;
	String name;
	double Perc;

	public Student(int id, String name, double perc) {
		super();
		this.id = id;
		this.name = name;
		Perc = perc;
	}

	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public String toString() {
		return "name is " + name + " id is " +  id + " perc is " + Perc;
	}
}

package com.ustglobal.hasarelation;

public class TestA {
	public static void main(String[] args) {
         
		Person p = new Person();
		
		System.out.println(p.s);
		
		p.sleep();
		
		System.out.println("============");
		
		
		
		p.m.write();   //assosiation relationship or Has - A relationship
		
	}
}

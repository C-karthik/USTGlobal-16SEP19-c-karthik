package com.ustglobal.immutable;

public class TestString {

	public static void main(String[] args) {


		MyString ms = new MyString(12, "renu");


		System.out.println(ms.getId());
		System.out.println(ms.getName());
		System.out.println(ms);

		MyString ms1= 
				ms.changeContent(13, "ravi");

		System.out.println(ms.getId());
		System.out.println(ms.getName());
		System.out.println("=======================");

		System.out.println(ms1.getId());
		System.out.println(ms1.getName());
		

	}

}

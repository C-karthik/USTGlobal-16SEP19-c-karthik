package com.ustgobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age ");
		int age = sc.nextInt();
		System.out.println(age );
		
		
		System.out.println("enter favourite country");
		String cn = sc.next();
		System.out.println( cn);
		
		System.out.println("enter ur crush");
		sc.nextLine();
		String  name = sc.nextLine();
		System.out.println( name);
		
		sc.close();
		
	}


}

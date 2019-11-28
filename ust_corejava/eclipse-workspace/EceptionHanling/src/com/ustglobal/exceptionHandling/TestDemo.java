package com.ustglobal.exceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class TestDemo {
	public static void main(String[] args) {

		System.out.println("main started");

		TestTd t = new TestTd();
		try {
			//try {
			//	try {
			t.open();
		} 
		// from jdk1.7
		catch (SQLException | ClassNotFoundException | IOException e) 
		{
			e.printStackTrace();
			System.out.println("exceptions are occured");
		}

		//			} catch (ClassNotFoundException e) {
		//				e.printStackTrace();
		//			}
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		}

		System.out.println("main ended");

	}

}

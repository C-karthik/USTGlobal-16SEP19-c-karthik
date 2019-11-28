package com.ustglobal.Array;

public class DemoArray1 {
     
	public static void main(String[] args) {
		
		int [] a = {10 ,20 , 34,45 , 56};
//		System.out.println(a[10]); ArrayIndexOutOfBoundsException
		
		receive(a);
		
		int[] val = getArray();
		
		for(int v : val) {
			System.out.println(v);
		}
		
		String[] s = getString();
		
		for(String str : s) {
			System.out.println(str);
		}
		
		String[] sr = {" navya", "rahulsai", "ms dhoni"};
		printName ( sr );
	}
	
	static void receive(int[] n) {
		
		for(int i : n) {
			System.out.println(i);
		}
		
	}
	
	static int[] getArray() {
		
		int[] val = {12,23,34,45,56};
		
		return val;
		
	}
	
	// string method
	static String[] getString() {
		String[] st = {"jay", "purshotham", "madhu", "prakash","aarav"};
		return st;
		
	}
	
	// string method
	static void printName(String[] s) {
		
//		String[] sr = {" navya", "rahulsai", "ms dhoni"};
		
		for(String sts : s) {
			
			System.out.println(sts);
		}
		
	}
	
}

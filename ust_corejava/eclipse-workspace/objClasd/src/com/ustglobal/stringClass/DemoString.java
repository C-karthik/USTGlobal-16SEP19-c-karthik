package com.ustglobal.stringClass;

public class DemoString {
	public static void main(String[] args) {
		
		String s = "nivi";
		String s1 = "karthik";
		
		String s3 = new String("sanvijosef");
		String s4 = new String("nivi");
		String s5 = "nivi";
		
		System.out.println(s==s1);
		System.out.println(s1==s3);
		System.out.println(s.equalsIgnoreCase(s4));   //it compares content 
		System.out.println(s==s4);                   // it compares only hashCode not content
		System.out.println(s==s5);
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s3.toUpperCase();
		System.out.println(s7);
		char c = s.charAt(0);
		System.out.println(c);
		char[] c1 = s1.toCharArray();
		System.out.println(c1);
		
		StringBuffer sb = new StringBuffer("nivi");
		System.out.println(sb.length());
//		sb.append("ChandruKarthik");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("nivi");
		
		
		System.out.println(sb.toString().equals(sb1.toString()));  // in stingbuffer method equals are not override
	}

}

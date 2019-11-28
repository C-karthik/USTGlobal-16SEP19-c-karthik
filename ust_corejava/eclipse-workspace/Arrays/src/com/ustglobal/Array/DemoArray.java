package com.ustglobal.Array;

public class DemoArray {
	public static void main(String[] args) {

         int[] a = new int[5];
         a[0] = 10;
         a[1] = 20;
         a[2] = 30;
         a[3] = 40;
         a[4] = 50;
         for(int i = 0 ; i < a.length ; i++) {
        	 System.out.println(a[i]);
         }
         
         char[] c = {'a','b','c','d'};
         
         for(char i : c){
        	 
        	 System.out.println(i + " ");
        	 
         }
         
         byte[] b = {19,89,98,67};
         
         for(byte bt : b) {
        	 System.out.println(bt);
         }
         
         double[] d = {12.09,23.43,34.98,65.90};
         
         for( int i = 0 ; i < d.length ; i++) {
        	 System.out.println(d[i] + " ");
         }
         for(double dbt : b) {
        	 System.out.print(dbt);
         }
         System.out.println(" ");
         System.out.println("=============================================");
         String [] names = {"kavi","nivi","karthik","roopa","viji"};
         for(String st : names) {
        	 System.out.print(st + " ");
         }
	}
}

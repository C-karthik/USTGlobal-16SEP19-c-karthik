package com.ustglobal.sorting.set;

import java.util.TreeSet;

public class TestCus {
	
     public static void main(String[] args) {
    	 
    	SortByNameOfCus sc = new SortByNameOfCus();
    	
    	 TreeSet<Customer> tc = new TreeSet<Customer>(sc);
    		
    		Customer c = new Customer(12, "deepthi", 30000);
    		Customer c1 = new Customer(13, "kavya", 31000);
    		Customer c2 = new Customer(14, "anasa", 33000);
    		Customer c3 = new Customer(18, "thanmay", 30000);
    		//Customer c5 = new Customer(12, "deepthi", 30000);
    		
    		tc.add(c);
    		tc.add(c1);
    		tc.add(c2);
    		tc.add(c3);
    		//tc.add(c5);
    		
    		for (Customer customer : tc) {
				
    			System.out.println(customer);
    			
			}
    		
    		
		
	}
	
	
	

}

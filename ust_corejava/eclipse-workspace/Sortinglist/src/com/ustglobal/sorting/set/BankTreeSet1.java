package com.ustglobal.sorting.set;

import java.util.TreeSet;

public class BankTreeSet1 {
	public static void main(String[] args) {
		
		BankSortById si = new BankSortById();
		BankSortByName sn = new BankSortByName();
		TreeSet<Bank> ts = new TreeSet<Bank>(sn);
		
		Bank b = new Bank("BOI", 1234, 234567);
		Bank b1 = new Bank("SBI", 1233, 234567);
		Bank b2 = new Bank("RBI", 1232, 234567);
		Bank b3 = new Bank("UCO", 1231, 234567);
		Bank b4 = new Bank("UCO", 1231, 234567);
		
		ts.add(b);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		for (Bank bank : ts) {
			
			System.out.println(bank);
			
		}
		
	}

}

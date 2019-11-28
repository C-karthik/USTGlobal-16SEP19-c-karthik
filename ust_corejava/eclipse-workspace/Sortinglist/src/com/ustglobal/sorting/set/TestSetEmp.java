package com.ustglobal.sorting.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestSetEmp {
	
	public static void main(String[] args) {
		
		
		HashSet<EmployeeSet> he = new HashSet<EmployeeSet>();
		
		EmployeeSet es = new EmployeeSet(121, "karthi", 50000);
		EmployeeSet es1 = new EmployeeSet(131, "Vishnu", 50000);
		EmployeeSet es2 = new EmployeeSet(141, "anvika", 50000);
		EmployeeSet es3 = new EmployeeSet(141, "anvika", 50000);
		
		he.add(es);
		he.add(es1);
		he.add(es2);
		he.add(es3);
		
		
		for (EmployeeSet employeeSet : he) {
			
			System.out.println(employeeSet);
			
		}
	}
	
	
	
	
	

}

package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmpy {
	
	public static void main(String[] args) {
		
		Comparator<Employee> ceo = (o1,o2) -> {
			
			if(o1.height > o2.height)
				return 1;
			
			if(o1.height < o2.height)
				return -1;
			
			return 0;
		};    
		
		TreeSet<Employee> ts = new TreeSet<Employee>( ceo );
		
		Employee e = new Employee(123, "aruna", 5.53);
		Employee e1 = new Employee(234 , "vinu" , 4.9);
		Employee e2 = new Employee(345, "arvindha", 5.54);
		Employee e3 = new Employee (456 , "sindhuja" , 5.5);
		
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		Iterator<Employee> li = ts.iterator();
		while (li.hasNext()) {
			Employee employee =  li.next();
			System.out.println(employee);
			
		}
	}
}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e = new Employee(3, "meena");
		Employee e1 = new Employee(2 , "akitha");
		Employee e2 = new Employee(1 , "bavya");
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		Comparator<Employee> cmp = (s1 , s2) -> {
			
			return s1.name.compareTo(s2.name);
		};
	List<Employee> le = 	al.stream().sorted(cmp).collect(Collectors.toList());
	
	Iterator<Employee> it = le.iterator();
	while (it.hasNext()) {
		Employee emp =  it.next();
		System.out.println(emp);
		
	}
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	}
}

package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {

	int id ;
	String Name ;
	Double per;

	public Student(int id, String name, Double per) {
		super();
		this.id = id;
		Name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", per=" + per + "]";
	}
	
	// all wrapper  class logic

	@Override
	public int compareTo(Student o) {
		
		Integer i = this.id;
		Integer j = o.id;
		
		return i.compareTo(j);
	}

	
//	@Override
//	public int compareTo(Student s) {
//		
//		String p = this.Name;
//		p.toLowerCase();
//		String q = s.Name;
//		q.toLowerCase();
//		return p.compareTo(q);
//		
//				
//	}

//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.per > s.per)
//		return 1;
//	
//		if(this.per < s.per)
//			return -1;
//		
//		return 0;
//	}

//   @Override
//	public int compareTo(Student s) {
//
//		if(this.id > s.id)
//			return 1;
//		
//		if(this.id < s.id)
//			return -1;
//		 
//		return 0;
//	}


}

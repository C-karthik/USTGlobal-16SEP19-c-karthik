package com.ustglobal.maps;

public class Employee {

		
		int id;
		String name;
		double per;
		public Employee(int id, String name, double per) {
			super();
			this.id = id;
			this.name = name;
			this.per = per;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
		}
		
		

	}
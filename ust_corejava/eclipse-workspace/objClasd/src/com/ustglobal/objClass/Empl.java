package com.ustglobal.objClass;

public class Empl {
	
	int id;
	String name;
	public Empl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + "]";
	}
	public boolean equal(Object obj) {
		
		Empl e = ( Empl )obj;
		if(this == obj) {
			return true;
			
		}
		
		if(this.id == e.id) {
			if(this.name == e.name) {
				return true;
				
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}

}

package com.ustglobal.spring_corebook;

import org.springframework.stereotype.Component;

@Component("author")
public class Author {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPenname() {
		return penname;
	}
	public void setPenname(String penname) {
		this.penname = penname;
	}
	private String penname;
	

}

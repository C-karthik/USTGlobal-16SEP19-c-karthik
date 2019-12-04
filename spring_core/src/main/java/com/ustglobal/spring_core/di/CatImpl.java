package com.ustglobal.spring_core.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class CatImpl implements Animal{

	
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("miyaaaaaaaaaaaaaaaaaaaa");
		
	}
}

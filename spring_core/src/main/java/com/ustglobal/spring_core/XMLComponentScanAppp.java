package com.ustglobal.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.spring_core.di.Hello;
import com.ustglobal.spring_core.di.Pet;

public class XMLComponentScanAppp {
	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
		
		Hello hello = context.getBean(Hello.class);  //its create object
		
		hello.setMsg("heloo google");
		System.out.println(hello.getMsg());
		
		System.out.println(hello.getMap());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("siri");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		
		
		
		
		
		
	}

}

package com.ustglobal.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.spring_core.config.ConfigurationClass;
import com.ustglobal.spring_core.di.Animal;
import com.ustglobal.spring_core.di.Hello;
import com.ustglobal.spring_core.di.Pet;

public class AnnotationApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
				(ConfigurationClass.class);
		
		Hello hello = context.getBean(Hello.class);
//		Hello hello2 = context.getBean(Hello.class);
//		
		System.out.println(hello.getMsg());
		
		//System.out.println(hello);   singleton            object
		//System.out.println(hello2);
		
//		Animal animal = context.getBean(Animal.class);
//		animal.makeSound();
//		
		System.out.println("--------------------------");
		
		Pet pet = context.getBean(Pet.class);
		pet.getAnimal().makeSound();
		System.out.println(pet.getName());
		context.close();
		
	}

}

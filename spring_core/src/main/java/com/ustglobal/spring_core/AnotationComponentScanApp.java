package com.ustglobal.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ustglobal.spring_core.config.ComponentCanConfg;
import com.ustglobal.spring_core.di.Hello;
import com.ustglobal.spring_core.di.Pet;

public class AnotationComponentScanApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(ComponentCanConfg.class);
		Hello hello = context.getBean(Hello.class);  //its create object

		hello.setMsg("heloo MOTO");
		System.out.println(hello.getMsg());

		//System.out.println(hello.getMap());

		Pet pet = context.getBean(Pet.class);
		pet.setName("google");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();







	}


}

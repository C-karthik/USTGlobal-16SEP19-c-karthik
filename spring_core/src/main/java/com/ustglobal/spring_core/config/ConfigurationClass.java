package com.ustglobal.spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.spring_core.di.CatImpl;
import com.ustglobal.spring_core.di.DogImpl;
import com.ustglobal.spring_core.di.Hello;
import com.ustglobal.spring_core.di.Pet;

@Configuration
@Import(PetConfiguration.class)
public class ConfigurationClass {

	@Bean(name = "hello")
	//@Scope("prototype")
	public Hello getHello() {

		Hello hello = new Hello();
		hello.setMsg("I love Python");
		return hello;
	}
	
	@Bean(name = "cat")
	public CatImpl getat() {
		
		return new CatImpl();
		
	}
	@Bean(name = "dog")
	public DogImpl getDog() {

		return new DogImpl();
	}
	
	
}

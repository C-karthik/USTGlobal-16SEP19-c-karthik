package com.ustglobal.spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.spring_core.di.Pet;

@Configuration
public class PetConfiguration {
	
	@Bean(name = "pet")
	public Pet getPet() {
		
	Pet pet = new Pet();
	pet.setName("Bittu");
	//pet.setAnimal(getDog());  //wiring
	return pet;
	
	}

}

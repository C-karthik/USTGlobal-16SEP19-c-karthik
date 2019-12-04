package com.ustglobal.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.spring_core.di.Animal;
import com.ustglobal.spring_core.di.Hello;
import com.ustglobal.spring_core.di.Pet;

public class App 
{                                         
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      
      
      Hello hello = context.getBean(Hello.class);
      System.out.println(hello.getMsg());  //its an variable
      
      System.out.println( "object reference of hello " +hello);
      
      System.out.println(hello.getMap());
     
      Animal animal = context.getBean(Animal.class);
      
      animal.makeSound(); //its method
      
      System.out.println("buddy making sound is getting propety from dog class placed as ref = 'dog' in bean ");
      Animal animal2 = (Animal) context.getBean("dog");
      animal2.makeSound();
      
      Pet pet = context.getBean(Pet.class);
      System.out.println(pet.getName());                                                                                                                
      pet.getAnimal().makeSound();
      
    }
}

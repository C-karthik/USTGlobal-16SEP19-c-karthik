package com.ustglobal.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.spring_core.di.Hello;

public class LifeCycle {

	public static void main(String[] args) {

	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

      Hello hello = context.getBean(Hello.class);
      System.out.println(hello.getMsg());
        
        context.close();
        

	}

}

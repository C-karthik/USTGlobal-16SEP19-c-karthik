package com.ustglobal.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.spring_core.config.BookComponentScanConfigApp;
import com.ustglobal.spring_corebook.Author;
import com.ustglobal.spring_corebook.Book;

public class AnotationComponentScanBookApp {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(BookComponentScanConfigApp.class);
		
	
		
		Author author = context.getBean(Author.class);
		
		author.setName("Spring");
		author.setPenname("marker");
		//System.out.println(author.getName());
		//System.out.println(author.getPenname());
		
	Book book = context.getBean(Book.class);
		
		book.setName("Giridhar");
		book.setPrice(678);
		
		System.out.println("book name : " +book.getAuthor().getName());
		System.out.println("pen name :" + book.getAuthor().getPenname());
		System.out.println("Author : " + book.getName());
		System.out.println("price : " +book.getPrice());
		
		
		
		
		
		
		
	}

}

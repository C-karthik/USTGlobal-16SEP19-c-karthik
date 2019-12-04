package com.ustglobal.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.spring_core.config.BookConfiguration;
import com.ustglobal.spring_corebook.Author;
import com.ustglobal.spring_corebook.Book;

public class AnotationBookApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(BookConfiguration.class);
		
		Author author = context.getBean(Author.class);
		//System.out.println(author.getName());
		//System.out.println(author.getPenname());
		
		Book book = context.getBean(Book.class);
		
	    System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenname());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		
	}

}

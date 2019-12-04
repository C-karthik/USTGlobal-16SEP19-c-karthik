package com.ustglobal.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.spring_corebook.Author;
import com.ustglobal.spring_corebook.Book;

public class BookClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");

//		Author author = context.getBean(Author.class);
//
//		System.out.println(author.getName());
//		System.out.println(author.getPenname());

		Book book = context.getBean(Book.class);
        System.out.println(book.getAuthor().getName()); //dependency injection
        System.out.println(book.getAuthor().getPenname());
		System.out.println(book.getName());
		System.out.println(book.getPrice());

		Book book1 = context.getBean(Book.class);
		
        System.out.println(book1.getAuthor().getName()); //dependency injection
        System.out.println(book1.getAuthor().getPenname());
		System.out.println(book1.getName());
		System.out.println(book1.getPrice());
		
		









	}
}

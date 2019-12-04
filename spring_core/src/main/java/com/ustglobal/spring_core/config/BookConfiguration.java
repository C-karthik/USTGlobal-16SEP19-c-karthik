package com.ustglobal.spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ustglobal.spring_corebook.Author;
import com.ustglobal.spring_corebook.Book;

@Configuration
public class BookConfiguration {
	
	@Bean("book")
	public Book getBook() {
		
		Book book = new Book();
		book.setName("java");
		book.setPrice(756);
		
		return book;
	}
	
	@Bean("author")
	public Author getAuthor() {
		
		Author author = new Author();
		
		author.setName("karthik");
		author.setPenname("universal");
		
		return author;
	}

}

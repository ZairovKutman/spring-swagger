package com.javatechie.spring.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.swagger.api.dao.BookRepository;
import com.javatechie.spring.swagger.api.model.Book;

@Service
public class BookService {
	private final BookRepository repository;

	public BookService(BookRepository repository) {
		this.repository = repository;
	}

	public String saveBook(Book book) {
		repository.save(book);
		return "book save dwith id " + book +"";
	}

	public Book getBook(int bookId) {
		return repository.findOne(bookId);
	}

	public List<Book> removeBook(int bookId) {
		repository.delete(bookId);
		return repository.findAll();
	}
}

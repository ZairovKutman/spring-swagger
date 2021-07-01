package com.javatechie.spring.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.swagger.api.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

package com.rooney.library.controller;

import com.rooney.library.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class BookController {

    @GetMapping("book")
    public Book getBook() {
        Book book = new Book();
        book.setAuthor("James Rooney");
        book.setTitle("On a Journey");

        return book;
    }
}

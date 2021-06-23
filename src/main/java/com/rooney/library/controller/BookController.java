package com.rooney.library.controller;

import com.rooney.library.domain.Book;
import com.rooney.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("setBook/{title}")
    public Book setBook(@PathVariable String title) {
        Book book = new Book();
        book.setTitle(title);

        Book savedBook = bookService.saveBook(book);

        return savedBook;
    }

    @GetMapping("getBook/{bookId}")
    public Book getBook(@PathVariable UUID bookId) {

        Book retrievedBook = bookService.getBook(bookId);

        return retrievedBook;
    }
}

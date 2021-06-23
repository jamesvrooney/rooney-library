package com.rooney.library.service;

import com.rooney.library.BookRepository;
import com.rooney.library.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book Book) {
        Book savedBook = bookRepository.save(Book);

        System.out.println("Saved Book UUID: " + savedBook.getId());

        return savedBook;
    }

    public Book getBook(UUID BookId) {
        Optional<Book> retrievedBook = bookRepository.findById(BookId);

        if (retrievedBook.isPresent()) {
            return retrievedBook.get();
        }

        return null;
    }
}

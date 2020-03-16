package com.bookdemo.BookStore.service

import com.bookdemo.BookStore.model.Book
import com.bookdemo.BookStore.repository.AuthorRepository
import com.bookdemo.BookStore.repository.BookRepository
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
@Slf4j
@Service
class BookServiceImpl implements BookService{

    private final BookRepository bookRepository
    private final AuthorRepository authorRepository

    BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository
        this.authorRepository = authorRepository
    }

    @Override
    @Transactional
    Book saveOrUpdate(Book book) {
        def savedEntity = bookRepository.save(book)
        savedEntity
    }

    @Override
    Book getBookById(Long id) {
        bookRepository.findById(id).get()
    }
}

package com.bookdemo.BookStore.controller

import com.bookdemo.BookStore.model.Book
import com.bookdemo.BookStore.service.BookService
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class BooksController {

    private final BookService bookService

    BooksController(BookService bookService) {
        this.bookService = bookService
    }

    @GetMapping(path = "/api/v1/books")
    String helloMessage(){
        return "Hello World reloaded"
    }

    @PostMapping(value="/api/v1/books", consumes = "application/json", produces = "application/json")
    String saveOrUpdate(@RequestBody Book book){
        def bookEntitySavedOrUpdated = bookService.saveOrUpdate(book)
        bookEntitySavedOrUpdated.id
    }

    @GetMapping(path = "/api/v1/books/{id}")
    Book getBookById(@PathVariable Long id){
        def bookPulled = bookService.getBookById(id)
        bookPulled
    }
}

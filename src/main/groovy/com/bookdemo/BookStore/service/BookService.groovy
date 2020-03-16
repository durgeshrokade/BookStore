package com.bookdemo.BookStore.service

import com.bookdemo.BookStore.model.Book

interface BookService {
    Book saveOrUpdate(Book book)
    Book getBookById(Long id)
}
package com.bookdemo.BookStore.repository

import com.bookdemo.BookStore.model.Book
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository extends CrudRepository<Book, Long>{
}

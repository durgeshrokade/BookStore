package com.bookdemo.BookStore.repository

import com.bookdemo.BookStore.model.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository extends CrudRepository<Author, Long>{

}
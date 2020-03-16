package com.bookdemo.BookStore.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
class Customer {
    @Id
    @GeneratedValue
    Long id

    String name

    @ManyToMany(mappedBy = "customers")
    Set<Book> booksSet
}

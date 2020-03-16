package com.bookdemo.BookStore.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.fasterxml.jackson.annotation.ObjectIdGenerators

import javax.persistence.*
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator,
        property = "id")
@Entity
class Book {
    @Id
    @GeneratedValue
    Long id

    String name
    Double price

    @ManyToOne(cascade = CascadeType.ALL)
    Author author

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="book_customer",
    joinColumns = @JoinColumn(name="book_id"), inverseJoinColumns = @JoinColumn(name="customer_id"))
    Set<Customer> customers

}

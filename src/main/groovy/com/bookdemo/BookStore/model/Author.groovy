package com.bookdemo.BookStore.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.fasterxml.jackson.annotation.ObjectIdGenerators

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator,
        property = "id")
@Entity
class Author {
    @Id
    @GeneratedValue
    Long id

    String name

    @OneToMany(mappedBy = "author")
    Set<Book> books = new HashSet<>()
}

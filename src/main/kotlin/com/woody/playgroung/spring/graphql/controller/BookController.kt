package com.woody.playgroung.spring.graphql.controller

import com.woody.playgroung.spring.graphql.data.Book
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class BookController {

    private val books = listOf(
        Book("book-1", "Kotlin Mastery", "Gemini", 300),
        Book("book-2", "GraphQL Deep Dive", "Apollo", 250),
        Book("book-3", "Jetpack Compose Guide", "Google", 400),
    )

    @QueryMapping
    fun allBooks(): List<Book> = books

    @QueryMapping
    fun bookById(id: String): Book? = books.find { it.id == id }
}
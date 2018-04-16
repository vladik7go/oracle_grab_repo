package com.example.oraclegrabber2.controller;


import com.example.oraclegrabber2.domain.Books;
import com.example.oraclegrabber2.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BooksController {

    @Autowired
    BookRepo bookRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Books> getAll() {
        return bookRepo.findAll();
    }
}

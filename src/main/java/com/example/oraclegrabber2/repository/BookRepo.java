package com.example.oraclegrabber2.repository;

import com.example.oraclegrabber2.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Books, Integer> {




}

package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springboot.loginentity.BookEntity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}

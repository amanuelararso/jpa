package com.jpapractice.jpa.repositories;

import com.jpapractice.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findByFirstName(String fn);
    List<Author> findByFirstNameIgnoreCase(String fn);
}

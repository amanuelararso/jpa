package com.jpapractice.jpa.repositories;

import com.jpapractice.jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findByFirstName(String fn);

    List<Author> findByFirstNameIgnoreCase(String fn);

    @Modifying
    @Transactional
    @Query ("update Author a set a.age=:age where a.id=:id")
    int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query ("update Author a set a.email=:email where a.id=:id")
    void updateAuthor(String email, int id);
}

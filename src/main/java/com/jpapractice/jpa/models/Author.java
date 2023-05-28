package com.jpapractice.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    @Column (
            unique = true
    )
    private String email;

    @ManyToMany (mappedBy = "authors")
    private List<Course> courses;
}

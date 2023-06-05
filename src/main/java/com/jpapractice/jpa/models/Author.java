package com.jpapractice.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.*;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {

    private String firstName;
    private String lastName;
    @Column (
            unique = true
    )
    private String email;
    private int age;

    @ManyToMany (mappedBy = "authors")
    private List<Course> courses;
}

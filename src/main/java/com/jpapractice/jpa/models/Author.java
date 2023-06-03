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

    private String firstname;
    private String lastname;
    @Column (
            unique = true
    )
    private String email;

    @ManyToMany (mappedBy = "authors")
    private List<Course> courses;
}

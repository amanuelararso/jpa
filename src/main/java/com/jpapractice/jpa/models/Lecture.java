package com.jpapractice.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity

public class Lecture {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String name;
}

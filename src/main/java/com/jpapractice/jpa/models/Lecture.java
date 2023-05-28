package com.jpapractice.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Lecture {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany
    @JoinColumn (name = "section_id")
    private Section section;
}

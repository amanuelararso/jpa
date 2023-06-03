package com.jpapractice.jpa.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@DiscriminatorColumn(name="resource_type")
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;


}

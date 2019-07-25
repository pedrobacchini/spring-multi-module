package com.github.pedrobacchini.repository;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Person {
    @Id
    private Long id;
    private String name;
    private String lastname;
}
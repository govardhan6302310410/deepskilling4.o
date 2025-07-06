package com.example.jpa;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JPAUser {
    @Id
    private Long id;
    private String name;
}
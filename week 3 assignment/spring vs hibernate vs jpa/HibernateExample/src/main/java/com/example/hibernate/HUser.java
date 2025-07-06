package com.example.hibernate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HUser {
    @Id
    private Long id;
    private String name;
}
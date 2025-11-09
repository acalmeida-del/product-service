package com.example.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    private String hscode;

    private String name;

    public Product() {}

    public Product(String hscode, String name) {
        this.hscode = hscode;
        this.name = name;
    }

    // Getters and Setters
}

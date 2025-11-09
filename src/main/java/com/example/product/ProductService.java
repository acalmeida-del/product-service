package com.example.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Product getProductByHscode(String hscode) {
        return repository.findByHscode(hscode);
    }
}
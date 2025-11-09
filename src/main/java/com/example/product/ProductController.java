package com.example.product;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/{hscode}")
    public Product getProduct(@PathVariable String hscode) {
        return service.getProductByHscode(hscode);
    }

}

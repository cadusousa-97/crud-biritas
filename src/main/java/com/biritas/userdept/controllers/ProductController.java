package com.biritas.userdept.controllers;

import com.biritas.userdept.entities.Product;
import com.biritas.userdept.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }
    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    @PostMapping
    public Product insertProduct(@RequestBody Product product) {
        return repository.save(product);
    }
    @DeleteMapping(value = "delete")
    public void deleteProduct(@RequestParam Long id) {
        repository.deleteById(id);
    }
}

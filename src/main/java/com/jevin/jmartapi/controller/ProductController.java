package com.jevin.jmartapi.controller;

import com.jevin.jmartapi.model.Product;
import com.jevin.jmartapi.repository.ProductRepo;
import com.jevin.jmartapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepo repo;

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public Optional<Product> get(@PathVariable int id) {
        return repo.findById(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }

    @PostMapping("/new/{categoryId}")
    @PreAuthorize("hasRole('ADMIN')")
    public Product add(@PathVariable int categoryId, @RequestBody Product product) {
        return productService.create(categoryId, product);
    }


    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Product update(@RequestBody Product product) {
        return repo.save(product);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean delete(@PathVariable int id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}

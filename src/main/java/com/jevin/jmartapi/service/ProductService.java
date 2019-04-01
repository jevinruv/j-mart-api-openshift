package com.jevin.jmartapi.service;

import com.jevin.jmartapi.exception.ResourceNotFoundException;
import com.jevin.jmartapi.model.Product;
import com.jevin.jmartapi.repository.CategoryRepo;
import com.jevin.jmartapi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    CategoryRepo categoryRepo;

    public Product create(int categoryId, Product product) {

        return categoryRepo.findById(categoryId).map(category -> {
            product.setCategory(category);
            return productRepo.save(product);
        }).orElseThrow(() -> new ResourceNotFoundException("Category Id " + categoryId + " not found"));
    }

}

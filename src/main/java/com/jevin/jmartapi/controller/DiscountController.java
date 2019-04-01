package com.jevin.jmartapi.controller;

import com.jevin.jmartapi.model.Discount;
import com.jevin.jmartapi.repository.DiscountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/discounts")
public class DiscountController {

    @Autowired
    DiscountRepo repo;

    @GetMapping
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Discount> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Optional<Discount> get(@PathVariable int id){
        return repo.findById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Discount add(@RequestBody Discount discount){
        return repo.save(discount);
    }

}

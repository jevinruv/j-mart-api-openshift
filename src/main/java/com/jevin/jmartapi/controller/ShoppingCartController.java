package com.jevin.jmartapi.controller;

import com.jevin.jmartapi.form.ShoppingCartForm;
import com.jevin.jmartapi.model.ShoppingCart;
import com.jevin.jmartapi.repository.ShoppingCartRepo;
import com.jevin.jmartapi.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/carts")
public class ShoppingCartController {

    @Autowired
    ShoppingCartRepo repo;

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping("/{id}")
    public Optional<ShoppingCart> get(@PathVariable int id) {
        return repo.findById(id);
    }

    @GetMapping("/user/{id}")
    public Optional<ShoppingCart> getCartByUserId(@PathVariable int id) {
        return repo.findByUserId(id);
    }

    @GetMapping
    public List<ShoppingCart> getAll() {
        return repo.findAll();
    }

    @PostMapping("/fetch")
    public ResponseEntity<?> createCart(@RequestBody int userId) {
        return shoppingCartService.fetchCart(userId);
    }

    @PostMapping
    public ResponseEntity<?> addOrUpdate(@RequestBody ShoppingCartForm shoppingCartForm) {
        return shoppingCartService.addOrUpdate(shoppingCartForm);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCart(@PathVariable int id) {
        return shoppingCartService.deleteCart(id);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCartItem(@RequestBody ShoppingCartForm shoppingCartForm) {
        return shoppingCartService.deleteCartItem(shoppingCartForm);
    }


}

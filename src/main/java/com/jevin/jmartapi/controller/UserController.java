package com.jevin.jmartapi.controller;


import com.jevin.jmartapi.model.User;
import com.jevin.jmartapi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo repo;

    @GetMapping("/{id}")
    public Optional<User> get(@PathVariable int id) {
        return repo.findById(id);
    }

    @GetMapping
    public List<User> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public User add(@RequestBody User user) {
        return repo.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return repo.save(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}

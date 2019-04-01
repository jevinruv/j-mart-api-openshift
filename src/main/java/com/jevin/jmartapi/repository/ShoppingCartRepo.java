package com.jevin.jmartapi.repository;

import com.jevin.jmartapi.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepo extends JpaRepository<ShoppingCart, Integer> {
    Optional<ShoppingCart> findByUserId(int id);
}

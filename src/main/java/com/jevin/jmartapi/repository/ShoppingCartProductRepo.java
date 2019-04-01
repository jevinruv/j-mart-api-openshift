package com.jevin.jmartapi.repository;

import com.jevin.jmartapi.model.Product;
import com.jevin.jmartapi.model.ShoppingCartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ShoppingCartProductRepo extends JpaRepository<ShoppingCartProduct, Integer> {

//    ShoppingCartProduct findByProductId(int productId);

    Optional<ShoppingCartProduct> findByProductIdAndAndShoppingCartId(int productId, int shoppingCartId);

    @Transactional
    @Modifying
    @Query("DELETE FROM ShoppingCartProduct WHERE id = ?1")
    void removeCartProduct(int id);
}

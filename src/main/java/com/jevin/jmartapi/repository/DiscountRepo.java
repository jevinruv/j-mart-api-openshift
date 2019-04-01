package com.jevin.jmartapi.repository;

import com.jevin.jmartapi.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Integer> {
}

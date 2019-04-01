package com.jevin.jmartapi.repository;

import com.jevin.jmartapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends JpaRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}

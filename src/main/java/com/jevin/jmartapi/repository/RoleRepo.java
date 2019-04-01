package com.jevin.jmartapi.repository;

import com.jevin.jmartapi.model.Role;
import com.jevin.jmartapi.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(RoleName name);
}

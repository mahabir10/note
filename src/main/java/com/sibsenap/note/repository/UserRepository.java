package com.sibsenap.note.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sibsenap.note.models.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>{
    
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}

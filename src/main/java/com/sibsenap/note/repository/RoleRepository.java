package com.sibsenap.note.repository;

import java.util.Optional;

import com.sibsenap.note.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    
    Optional<Role> findByName(String name);

}

package com.springboot.blog.repository;

import com.BarfaChat.Barfa.Models.User;
import com.springboot.blog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional <User.Role> findByName(String name);
}
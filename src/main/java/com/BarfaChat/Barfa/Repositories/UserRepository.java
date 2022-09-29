package com.BarfaChat.Barfa.Repositories;

import com.BarfaChat.Barfa.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
//package com.springboot.blog.repository;
//
//import com.springboot.blog.entity.User;
//import org.springframework.data.domain.Example;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface UserRepository extends JpaRepository<User, Long> {
//  Optional<User> findByEmail(String email);
//  Optional<User> findByUsernameOrEmail(String username, String email);
//  Optional<User> findByUsername(String username);
//  Boolean existsByUsername(String username);
//  Boolean existsByEmail(String email);
//}

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
}

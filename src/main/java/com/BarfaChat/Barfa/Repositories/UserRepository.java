package com.BarfaChat.Barfa.Repositories;

import com.BarfaChat.Barfa.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
//
//
//  @Query("update User u set u.firstName = ?1 where u.id = ?2")
//  int updateFirstNameById(String firstName, Long id);
//
//  @Query("update User u set u.lastName = ?1 where u.id = ?2")
//  int updateLastNameById(String lastName, Long id);
//
//  @Query("update User u set u.email = ?1 where u.id = ?2")
//  int updateEmailById(String email, Long id);
//
//  @Query("update User u set u.username = ?1 where u.id = ?2")
//  int updateUsernameById(String username, Long id);
//
//  @Query("update User u set u.password = ?1 where u.id = ?2")
//  int updatePasswordById(String password, Long id);
}

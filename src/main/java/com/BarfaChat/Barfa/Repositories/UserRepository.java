package com.BarfaChat.Barfa.Repositories;

import com.BarfaChat.Barfa.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}

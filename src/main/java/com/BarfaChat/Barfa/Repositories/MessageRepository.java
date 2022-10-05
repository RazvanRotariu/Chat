package com.BarfaChat.Barfa.Repositories;


import com.BarfaChat.Barfa.Models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Message findById(String id);
}

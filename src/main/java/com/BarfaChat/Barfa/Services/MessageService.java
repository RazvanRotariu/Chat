package com.BarfaChat.Barfa.Services;

import com.BarfaChat.Barfa.Models.Message;
import com.BarfaChat.Barfa.Repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageService {
    MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void PostMessage(Message message) {
        messageRepository.save(message);
    }
    public List<Message> GetMessages(){
        return messageRepository.findAll();
    }


    public void updateMessage(Long userId, Message user) {
    }

    public void deleteMessage(Long id) {
    }
}

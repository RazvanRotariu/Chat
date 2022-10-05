package com.BarfaChat.Barfa.Services;

import com.BarfaChat.Barfa.Models.Message;
import com.BarfaChat.Barfa.Repositories.MessageRepository;

import java.util.List;

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


}

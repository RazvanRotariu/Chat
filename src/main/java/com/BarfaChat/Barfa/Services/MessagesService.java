package com.BarfaChat.Barfa.Services;

import com.BarfaChat.Barfa.Repositories.MessagesRepository;

public class MessagesService {
    MessagesRepository messagesRepository;

    public MessagesService(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }
}

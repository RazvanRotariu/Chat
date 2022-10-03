package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Services.MessagesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/Message")
public class MessagesController {
    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }
    private final MessagesService messagesService;

    @GetMapping
    @PostMapping


}

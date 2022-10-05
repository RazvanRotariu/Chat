package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Models.Message;
import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Services.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Message")
public class MessageController {
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    private final MessageService messageService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public void postMessage(@RequestBody Message message) {
        messageService.PostMessage(message);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Message> GetMessage() {

        return messageService.GetMessages();
    }


}

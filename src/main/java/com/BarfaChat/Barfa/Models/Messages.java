package com.BarfaChat.Barfa.Models;

import java.time.LocalDateTime;

public class Messages {
    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {return time;}

    public Messages(String sender, String receiver, String message, LocalDateTime time) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.time = time;
    }

    private User sender;
    private User receiver;

    private String message;

    private final LocalDateTime time;

    private long id;

}

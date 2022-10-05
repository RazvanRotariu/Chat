package com.BarfaChat.Barfa.Models;

import javax.persistence.*;

@Entity
@Table(name = "Conversations")
public class Message {
    @Id
    @SequenceGenerator(
            name = "message_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "message_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    public Message() {
    }

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
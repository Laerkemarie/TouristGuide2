package com.example.springbootintro;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeRepository {
    private int messageId = 1;
    private final List<Message> messages = new ArrayList<>();

    public WelcomeRepository() {
        populateMessages();
    }

    public Message findMessageById(int messageId) {
        Message result = new Message();
        for (Message message : messages) {
            if (message.getId() == messageId) {
                result = message;
            }
        }
        return result;
    }

    public List<Message> getAllMessages() {
        return messages;
    }

    private void populateMessages() {
        while (messageId <= 3) {
            messages.add(new Message(messageId, "Velkommen til " + messageId + " .semester"));
            messageId++;
        }
    }

    public Message addMessage(Message message) {
        message.setId(getMessageId());
        messages.add(message);
        return message;
    }

    private int getMessageId() {
        return messageId++;
    }
}

package com.example.chatgptapi.controllers;

import com.example.chatgptapi.entities.Conversation;
import com.example.chatgptapi.services.ConversationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConversationController  {
    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {
      this.conversationService = conversationService;
    };

    @GetMapping("/conversations")
    public Iterable<Conversation> getAllConversations() {
        return conversationService.getAllConversations();
    }
}

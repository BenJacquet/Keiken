package com.example.chatgptapi.services;

import com.example.chatgptapi.entities.Conversation;
import com.example.chatgptapi.repositories.ConversationRepository;
import org.springframework.stereotype.Service;

@Service
public class ConversationService {
    private final ConversationRepository conversationRepository;

    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }
    public Iterable<Conversation> getAllConversations() {
        return conversationRepository.findAll();
    }
}

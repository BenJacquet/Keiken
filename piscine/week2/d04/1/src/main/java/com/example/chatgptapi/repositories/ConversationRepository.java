package com.example.chatgptapi.repositories;

import com.example.chatgptapi.entities.Conversation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface ConversationRepository extends CrudRepository<Conversation, Integer> {
}

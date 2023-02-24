package com.example.chatgptapi.controllers;

import com.example.chatgptapi.entities.Conversation;
import com.example.chatgptapi.services.ConversationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="The Conversation controller, fetches all conversations and return them")
public class ConversationController  {
    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {
      this.conversationService = conversationService;
    };

    @ApiOperation(value="This retrieves all conversations stored in the database and returns them as a List<Conversation>", response = List.class)
    @GetMapping("/conversations")
    public Iterable<Conversation> getAllConversations() {
        return conversationService.getAllConversations();
    }
}

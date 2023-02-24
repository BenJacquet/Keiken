package com.example.chatgptapi.controllers;

import com.example.chatgptapi.services.PromptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(value="The Prompt controller, for sending the user message to openAI, storing it and the response in the database")
public class PromptController {
    private final PromptService promptService;

    public PromptController(PromptService conversationService) {
        this.promptService = conversationService;
    };

    @ApiOperation(value="This sends a prompt to openAI to generate a completion, then stores both inside the database as a Conversation", response = String.class)
    @PostMapping("/prompts")
    public String sendPrompt(@RequestParam String openAIToken,
                           @RequestParam String userMessage) {
       return promptService.createCompletion(openAIToken, userMessage);
    }
}

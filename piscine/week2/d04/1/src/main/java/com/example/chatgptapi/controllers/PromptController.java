package com.example.chatgptapi.controllers;

import com.example.chatgptapi.services.PromptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PromptController {
    private final PromptService promptService;

    public PromptController(PromptService conversationService) {
        this.promptService = conversationService;
    };

    @PostMapping("/prompt")
    public String sendPrompt(@RequestParam String openAIToken,
                           @RequestParam List<String> prompt) {
       return promptService.sendPrompt(openAIToken, prompt);
    }
}

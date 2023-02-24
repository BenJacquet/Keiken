package com.example.chatgptapi.services;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromptService {
    public String sendPrompt(String openAIToken, List<String> prompt) {
        return "Response";
    }
}

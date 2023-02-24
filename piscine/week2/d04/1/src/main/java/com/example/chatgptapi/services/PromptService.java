package com.example.chatgptapi.services;

import com.example.chatgptapi.entities.Conversation;
import com.example.chatgptapi.repositories.ConversationRepository;
import org.springframework.stereotype.Service;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;;

import java.util.Date;

@Service
public class PromptService {
    private ConversationRepository conversationRepository;
    public PromptService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    public String createCompletion(String openAIToken, String userMessage) {
        if (openAIToken == null) {
            System.exit(1);
        }
        OpenAiService service = new OpenAiService(openAIToken);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt(userMessage)
                .maxTokens(2048)
                .echo(false)
                .user("user")
                .n(1)
                .build();
        String response = service.createCompletion(completionRequest).getChoices().get(0).getText().trim();

        Conversation conversation = Conversation.builder()
                .userMessage(userMessage)
                .response(response)
                .date(new Date())
                .build();
        conversationRepository.save(conversation);
        return response;
    }
}

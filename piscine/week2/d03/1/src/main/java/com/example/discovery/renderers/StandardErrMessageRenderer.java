package com.example.discovery.renderers;

import com.example.discovery.providers.MessageProvider;

public class StandardErrMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardErrMessageRenderer.class.getName());
        }
        System.err.println(messageProvider.getMessage());
    }
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
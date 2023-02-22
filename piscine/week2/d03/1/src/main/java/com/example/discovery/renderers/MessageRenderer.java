package com.example.discovery.renderers;

import com.example.discovery.providers.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
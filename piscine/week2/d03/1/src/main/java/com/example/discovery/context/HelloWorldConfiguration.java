package com.example.discovery.context;

import com.example.discovery.providers.GoodbyeWorldMessageProvider;
import com.example.discovery.providers.MessageProvider;
import com.example.discovery.renderers.MessageRenderer;
import com.example.discovery.providers.HelloWorldMessageProvider;
import com.example.discovery.renderers.StandardOutMessageRenderer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    // equivalent to <bean id="provider" class=".."/>
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }
    // equivalent to <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
